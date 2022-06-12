Feature: This feature tests the Signup functionality of the ijmeet application

Scenario: पूरा नाम खाली नहीं होना चाहिए
	Given User is on signup page
	When User leaves full name empty and clicks on Signup button
	Then User should see an error message

Scenario: Type number as a full-name and check if system accepts it
	Given User is on signup page
	When User enters the full name as "Satish"


