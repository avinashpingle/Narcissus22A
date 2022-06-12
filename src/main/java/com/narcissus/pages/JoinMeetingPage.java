package com.narcissus.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.narcissus.keywords.Keyword;

public class JoinMeetingPage {

	@FindBy(css="h2.m-txt")
	public WebElement quickJoinMeetingHeading;
	
	public JoinMeetingPage() {
		PageFactory.initElements(Keyword.driver, this);
	}
	
	public String getQuickJoinMeetingText() {
		return quickJoinMeetingHeading.getText();
	}
}
