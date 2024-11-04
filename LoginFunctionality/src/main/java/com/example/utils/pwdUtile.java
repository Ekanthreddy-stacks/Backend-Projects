package com.example.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class pwdUtile {

	public static String generatepwd() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789~`!@#$%^&*()-_=+[{]}\\|;:\'\",<.>/?";
		String pwd = RandomStringUtils.random( 6, characters );
		System.out.println( pwd );
		return pwd;
	}

}
