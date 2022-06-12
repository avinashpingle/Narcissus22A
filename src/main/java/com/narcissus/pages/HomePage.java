package com.narcissus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.narcissus.keywords.Keyword;

public class HomePage {

	@FindBy(css = "span.mvlogo-size-app1 img[alt='ijmeetimage']")
	public WebElement ijMettLogo;

	@FindBy(css = "ul.navbar-nav>li:nth-child(1)>a")
	public WebElement joinMeetingLink;

	@FindBy(css="ul.navbar-nav>li:nth-child(2)>a")
	public WebElement hostMeeting;
	
	@FindBy(css = "ul.navbar-nav li:nth-child(5) a")
	public WebElement signUpBtn;
	
	public HomePage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	public void clickOnIJMeetLogo() {
		ijMettLogo.click();
		System.out.println("Clicked on Logo");
	}
	
	public void clickOnJoinMeetingLink() {
		joinMeetingLink.click();
	}
	
	public String getTextOfJoinMeetingLink() {
		return joinMeetingLink.getText();
	}
	
	public String getTitle() {
		return Keyword.getTitle();
	}

	public void clickOnSignUp() {
		signUpBtn.click();
	}
}
