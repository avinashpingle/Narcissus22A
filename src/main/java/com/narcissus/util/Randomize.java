package com.narcissus.util;

import java.util.Random;

public class Randomize {

	public static String numbers() {
		Random random = new Random();
		String num = random.nextInt(9)+""+random.nextInt(9)+""+random.nextInt(9)+""+random.nextInt(9)+""+random.nextInt(9)+""+random.nextInt(9);
		return num;
	}
	
	public static String alphaNumeric() {

		String alphaNum = "";
		return alphaNum;
	}
	
}
