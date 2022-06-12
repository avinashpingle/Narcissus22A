package com.narcissus.stepdefinition;


import com.narcissus.keywords.Keyword;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setup() {
		Keyword.openBrowser("Chrome");
		Keyword.launchUrl("https://www.ijmeet.com");
	}
	
	@After
	public void tearDown() throws Exception {
		Keyword.closeBrowser();
	}
}
