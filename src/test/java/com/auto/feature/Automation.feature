Feature: automated Testing on automation practice application 
Background:
    Given user to Launch the browser
    And user to login the application	
 
Scenario: user to check the sign function 
	Given user launch the automation practice application 
	When user to click on  sign in button 
	Then user navigate to homepage of automation practice 
	


@login	
Scenario Outline: user to check the login function using vaild username and password 
	Given  user enter the valid username "<username>" on username field 
	When user enter the valid password "<password>" on password field 
	And user click on submit button 
	Then user validate the name of the user in homepage 
	Examples:
	|username|password|
	|bahubali302@gmail.com|wenndeisel|
	
	
	
	
Scenario: user to select dress to order 
	Given user navigated to homepage 
	When   user to select type of dress 
	And  user to select casuall dress 
	Then  user navigate to casuall dress page 
	
Scenario: user to purchase the clothes 
	Given user navigate to casual dress page 
	When  user to click on quick button in the image 
	And   user  to select dress Quantity 
	And   user to select dress size 
	And  user to select on color 
	Then user to click on add to cart button 
	
Scenario: user to check for to proceed checkout 
	Given user navigated to proceed page 
	When  user to click on proceed button 
	Then  user navigate to summary page 
	
Scenario: user to check for to  proceed summary 
	Given  user navigated to summary page 
	When   user to click on proceed summary button 
	Then   user to navigate to signin page 
	

	
Scenario: user to check for  to proceed  address page 
	Given user to navigated to proceed to address page 
	When user to click on proceed to address button 
	Then user to navigate to proceed to shipping page 
	
Scenario: user to check for  proceed for shipping 
	Given user to navigated to proceed to shipping page 
	When user to click on terms and service check box 
	And user to click on proceed to shipping  button 
	Then user to navigate to proceed to payment page 
	
	
	
Scenario: user to check for payment process 
	Given  user to navigated to proceed to payment page 
	When   user to click on pay by bank wire button 
	And    user to click on order confirmation buton 
	Then  user navigate to  confirmed order recipt details page 
	
     