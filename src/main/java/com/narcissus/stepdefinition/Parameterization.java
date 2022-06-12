package com.narcissus.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Parameterization {
	String fruite;
	
	@Given("I have two {string}")
	public void acceptFruite(String fruite) {
		this.fruite = fruite;
	}
	
	@Then("print their color")
	public void printColor() {
		System.out.println("Oranges are red");
	}
}
