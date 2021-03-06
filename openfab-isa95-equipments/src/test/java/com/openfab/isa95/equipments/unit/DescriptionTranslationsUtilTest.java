package com.openfab.isa95.equipments.unit;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Test;

import com.openfab.isa95.equipments.DescriptionLocalizedUtil;

public class DescriptionTranslationsUtilTest {

	@Test
	public void testUtilAReturnValue() {
		DescriptionTranslationsUtilA a = new DescriptionTranslationsUtilA();

		DescriptionTranslationsUtilA retA = DescriptionLocalizedUtil
				.setLanguage(a, Locale.ITALIAN.getLanguage());
		Assert.assertNotNull(retA.getDescription());
		Assert.assertEquals("italian description", retA.getDescription());

		DescriptionTranslationsUtilA retB = DescriptionLocalizedUtil
				.setLanguage(a, Locale.GERMAN.getLanguage());
		Assert.assertNotNull(retB.getDescription());
		Assert.assertEquals("german description", retB.getDescription());
	}

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
	public void testUtilANullLanguage() {
		DescriptionTranslationsUtilA a = new DescriptionTranslationsUtilA();

		DescriptionLocalizedUtil.setLanguage(a, null);
		String nullDescription = a.getDescription();
		Assert.assertNotNull(nullDescription);
		DescriptionLocalizedUtil.setLanguage(a, Locale.getDefault().getLanguage());
		Assert.assertNotNull(a.getDescription());
		Assert.assertEquals(a.getDescription(), nullDescription);
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

	@Test
	public void testUtilD() {
		DescriptionTranslationsUtilD d = new DescriptionTranslationsUtilD();

		DescriptionLocalizedUtil.setLanguage(d, Locale.ITALIAN.getLanguage());
		for (DescriptionTranslationsUtilA a : d.getTranslations()) {
			Assert.assertNotNull(a.getDescription());
			Assert.assertEquals("italian description", a.getDescription());
		}

		DescriptionLocalizedUtil.setLanguage(d, Locale.GERMAN.getLanguage());
		for (DescriptionTranslationsUtilA a : d.getTranslations()) {
			Assert.assertNotNull(a.getDescription());
			Assert.assertEquals("german description", a.getDescription());
		}
	}
}
