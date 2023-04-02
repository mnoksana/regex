package com.softserve.course.regex;

import org.testng.annotations.Test;
import org.testng.Assert;

public class EmailValidatorTest {
	
	@Test(dataProvider = "valid", dataProviderClass = EmailDataProvider.class)
	public void checkEmailShouldAnswerWithTrue(String email) {
			Assert.assertTrue(new EmailValidator().checkEmail(email));
	}

	@Test(dataProvider = "invalid", dataProviderClass = EmailDataProvider.class)
	public void checkEmailShouldAnswerWithFalse(String email) {
		Assert.assertFalse(new EmailValidator().checkEmail(email));
	}
	
}
