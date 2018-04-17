package com.openfab.isa95.equipments.unit;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

import com.openfab.isa95.equipments.DescriptionLocalizedUtil;

public class DescriptionTranslationsUtilTest {

	@Test
	public void testUtilA() {
		DescriptionTranslationsUtilA a = new DescriptionTranslationsUtilA();

		DescriptionLocalizedUtil.setLanguage(a, Locale.ITALIAN.getLanguage());
		Assert.assertNotNull(a.getDescription());
		Assert.assertEquals("italian description", a.getDescription());

		DescriptionLocalizedUtil.setLanguage(a, Locale.GERMAN.getLanguage());
		Assert.assertNotNull(a.getDescription());
		Assert.assertEquals("german description", a.getDescription());
	}

	@Test
	public void testUtilB() {
		DescriptionTranslationsUtilB a = new DescriptionTranslationsUtilB();
		
		DescriptionLocalizedUtil.setLanguage(a, Locale.ITALIAN.getLanguage());
		Assert.assertNull(a.getDescription());
	}

	@Test
	public void testUtilC() {
		DescriptionTranslationsUtilC a = new DescriptionTranslationsUtilC();
		
		DescriptionLocalizedUtil.setLanguage(a, Locale.ITALIAN.getLanguage());
		Assert.assertNotNull(a.getDescription());
		Assert.assertEquals("italian description", a.getDescription());

		DescriptionLocalizedUtil.setLanguage(a, Locale.GERMAN.getLanguage());
		Assert.assertNotNull(a.getDescription());
		Assert.assertEquals("german description", a.getDescription());
	}

}
