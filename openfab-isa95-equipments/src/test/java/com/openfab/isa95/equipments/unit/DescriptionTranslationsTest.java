package com.openfab.isa95.equipments;

import java.util.Locale;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DescriptionTranslationsTest {

	DescriptionTranslations translations;

	@Before
	public void setUp() {
		translations = new DescriptionTranslations();
	}

	@Test
	public void testContainsNotTexts() {
		Assert.assertNull(translations.getDefaultText());
		Assert.assertNull(translations.getTranslatedText(Locale.ITALIAN
				.getLanguage()));
	}

	@Test
	public void testContainsOneText() {
		translations.put(Locale.ENGLISH.getLanguage(),
				"this is the default string");
		Assert.assertNotEquals(Locale.getDefault(), Locale.ENGLISH);
		Assert.assertEquals("this is the default string",
				translations.getDefaultText());
	}

	@Test
	public void testDefaultText() {
		translations.put(Locale.ITALIAN.getLanguage(),
				"this is the italian string");
		translations.put(Locale.getDefault().getLanguage(),
				"this is the default string");
		Assert.assertNotEquals(Locale.getDefault().getLanguage(),
				Locale.ITALIAN.getLanguage());
		Assert.assertEquals("this is the default string",
				translations.getDefaultText());
	}

	@Test
	public void testTranslatedText() {
		translations.put(Locale.ITALIAN.getLanguage(),
				"this is the italian string");
		translations.put(Locale.GERMAN.getLanguage(),
				"this is the german string");
		translations.put(Locale.getDefault().getLanguage(),
				"this is the default string");
		Assert.assertNotEquals(Locale.getDefault().getLanguage(),
				Locale.GERMAN.getLanguage());
		Assert.assertNotEquals(Locale.getDefault().getLanguage(),
				Locale.ITALIAN.getLanguage());
		Assert.assertEquals("this is the german string",
				translations.getTranslatedText(Locale.GERMAN.getLanguage()));
		Assert.assertEquals("this is the italian string",
				translations.getTranslatedText(Locale.ITALIAN.getLanguage()));
	}

}
