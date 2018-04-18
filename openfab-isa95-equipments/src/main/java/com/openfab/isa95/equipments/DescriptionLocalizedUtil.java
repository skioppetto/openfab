package com.openfab.isa95.equipments;

import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.util.Collection;
import java.util.Optional;

import org.jboss.logging.Logger;

public class DescriptionLocalizedUtil {

	public static final void setLanguage(Object object, String language) {
		Class<? extends Object> clz = object.getClass();
		PropertyDescriptor[] propertyDescriptors = null;
		try {
			propertyDescriptors = Introspector.getBeanInfo(clz, Object.class).getPropertyDescriptors();
		} catch (Exception e) {
			Logger.getLogger(DescriptionLocalizedUtil.class).error("cannot beanInfo clazz " + clz.getSimpleName());
			return;
		}

		for (PropertyDescriptor p : propertyDescriptors) {
			if (null != p.getReadMethod() && null != p.getWriteMethod()
					&& null != p.getReadMethod().getAnnotation(DescriptionLocalized.class)
					&& null != p.getReadMethod().getAnnotation(DescriptionLocalized.class).translationsField()
					&& p.getWriteMethod().getParameterTypes().length == 1
					&& String.class.isAssignableFrom(p.getWriteMethod().getParameterTypes()[0])) {
				String translationsField = p.getReadMethod().getAnnotation(DescriptionLocalized.class)
						.translationsField();

				try {
					for (PropertyDescriptor tp : propertyDescriptors)
						if (tp.getName().equals(translationsField) && null != tp.getReadMethod()
								&& DescriptionTranslations.class.isAssignableFrom(tp.getReadMethod().getReturnType())) {
							DescriptionTranslations dt = (DescriptionTranslations) tp.getReadMethod().invoke(object,
									new Object[] {});
							p.getWriteMethod().invoke(object,
									Optional.of(dt.getTranslatedText(language)).orElse(dt.getDefaultText()));
							break;
						}
				} catch (Exception e) {
					Logger.getLogger(DescriptionLocalizedUtil.class)
							.error("cannot set localized text on field " + p.getName(), e);
				}
			}
			// MANAGE COLLECTIONS
			else if (null != p.getReadMethod() && Collection.class.isAssignableFrom(p.getReadMethod().getReturnType())){
				try{
				Collection<? extends Object> collection = (Collection<? extends Object>) p.getReadMethod().invoke(object, new Object[]{});
				if (null != collection)
					collection.forEach(el -> setLanguage(el, language));
				}catch (Exception e){
					Logger.getLogger(DescriptionLocalizedUtil.class)
					.error("cannot set localized text on collection " + p.getName(), e);
				}
			}
		}

	}

}
