package com.narcissus.util;

import java.io.IOException;

public class Environment {

	public static String getUrl(String environment) throws IOException {
		if (environment.equalsIgnoreCase("dev")) {
			return PropUtil.getEnvirnomet("dev.url");
		} else if (environment.equalsIgnoreCase("qa")) {
			return PropUtil.getEnvirnomet("qa.url");
		} else if (environment.equalsIgnoreCase("preprod")) {
			return PropUtil.getEnvirnomet("preprod.url");
		} else {
			return "";
		}
	}

	public static String getUsername(String environment) {
		String username = "";
		return username;
	}
	
	public static String getBroswerName() throws IOException {
		return PropUtil.getEnvirnomet("browserName");
	}
}
