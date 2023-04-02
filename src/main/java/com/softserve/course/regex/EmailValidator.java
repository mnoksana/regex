package com.softserve.course.regex;

import java.util.regex.Pattern;

public class EmailValidator {

	private static final Pattern CHACK_EMAIL_ADDRESS_REGEX_PATTERN = Pattern
			.compile("[A-Za-z]{1}[A-Za-z0-9.]{1,}[A-Za-z0-9]{1,}@[A-Aa-z]{1}[A-Za-z.]{1,}[A-Za-z]{2,}");

	public boolean checkEmail(String text) {
		return CHACK_EMAIL_ADDRESS_REGEX_PATTERN.matcher(text).matches();
	}
}
