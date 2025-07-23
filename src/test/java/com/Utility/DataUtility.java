package com.Utility;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;

public class DataUtility {

	public static Faker faker = new Faker();

	public static final String firstName = randomFirstName();
	public static final String middleName = randomMiddleName();

	public static final int empId = randomNumber();
	public static final String emailId = randomEmailID();

	private static final String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	public static String timestamp() {

		String smf = new SimpleDateFormat("yyyy_mm_dd_hh_mm_ss").format(new Date());
		return smf;
	}

	public static String randomFirstName() {
		return faker.name().firstName();
	}

	public static String randomMiddleName() {
		return faker.name().firstName();

	}

	public static String randomLastName() {
		return faker.name().lastName();
	}

	public static String randomEmailID() {
		return faker.internet().emailAddress();
	}

	public static String randomStreetAddress() {

		return faker.address().fullAddress();
	}

	public static String randomState() {

		return faker.address().state();
	}

	public static String randomCity() {

		return faker.address().city();
	}

	public static String randomZipCode() {
		return faker.address().zipCode();
	}

	public static String randomPhoneNumber() {
		return faker.phoneNumber().cellPhone();
	}

	public static Integer randomNumber() {
		int randomnumber = 0;

		randomnumber = faker.number().numberBetween(1000, 9999);
		return randomnumber;

	}

	public static String passwordGenerator(int length) {

		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder();

		try {

			for (int i = 0; i < length; i++) {

				int index = random.nextInt((characters.length()));
				sb = sb.append(characters.charAt(index));

			}
		} catch (Exception e) {
			System.out.println("Exception occured while generating password : " + e.getMessage());
		}

		return sb.toString();
	}

}
