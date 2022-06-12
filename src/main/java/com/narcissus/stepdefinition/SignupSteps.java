package com.narcissus.stepdefinition;

import org.testng.Assert;

import com.narcissus.pages.HomePage;
import com.narcissus.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupSteps {
	SignUpPage signup = new SignUpPage();

	@Given("User is on signup page")
	public void launchSignupPage() {

		HomePage home = new HomePage();
		home.clickOnSignUp();
	}

	@When("User leaves full name empty and clicks on Signup button")
	public void enterBlankFullName() {
		signup.clickSignUp2Button();
	}

	@Then("User should see an error message")
	public void verifyError() {
		String actual = signup.getFullNameErrorMsg();
		Assert.assertEquals(actual, "Enter full name");
	}

	@When("User enters the full name as {string}")
	public void user_enters_the_full_name_as(String fullName) throws InterruptedException {
		signup.setFullNameTextField(fullName);
		Thread.sleep(5000);
	}
}
