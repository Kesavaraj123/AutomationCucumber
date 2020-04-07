package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pom.DressPage;
import com.automation.pom.SignPage;
import com.baseclass.auto.BaseClass;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
	public WebDriver driver;

	@Given("^user launch the automation practice application$")
	public void user_launch_the_automation_practice_application() throws InterruptedException {
		driver = browserLaunch("chrome");
		getUrl("http://automationpractice.com/index.php");
		Thread.sleep(5000);

	}

	@When("^user to click on sign in button$")
	public void user_to_click_on_sign_in_button() throws InterruptedException {
		SignPage sp = new SignPage(driver);
		click(sp.getSign());
		Thread.sleep(5000);

	}

	@Then("^user navigate to homepage of automation practice$")
	public void user_navigate_to_homepage_of_automation_practice() throws InterruptedException {
		System.out.println("user naviagting to home page");
		Thread.sleep(5000);
	}

	@Given("^user enter the valid username on username field$")
	public void user_enter_the_valid_username_on_username_field() throws InterruptedException {
		/* SignPage sp = new SignPage(driver); */
		SignPage sp = new SignPage(driver);
		typehere(sp.getMail(), "bahubali302@gmail.com");
		Thread.sleep(5000);

	}

	@When("^user enter the valid password on password field$")
	public void user_enter_the_valid_password_on_password_field() throws InterruptedException {
		
	//SignPage sp = new SignPage(driver);
		SignPage sp = new SignPage(driver);
		typehere(sp.getPasswrd(), "wenndeisel");
		Thread.sleep(5000);

	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws InterruptedException {
		//SignPage sp = new SignPage(driver);
		SignPage sp = new SignPage(driver);
		click(sp.getSub());
		Thread.sleep(5000);

	}

	@Then("^user validate the name of the user in homepage$")
	public void user_validate_the_name_of_the_user_in_homepage() {
		System.out.println("valid user name & passwrd");

	}

	@Given("^user navigated to homepage$")
	public void user_navigated_to_homepage() {
		System.out.println("opened next page");

	}

	@When("^user to select type of dress$")
	public void user_to_select_type_of_dress() throws InterruptedException {
		     DressPage dp = new DressPage(driver);
		     Actions(dp.getWomen());
		     Thread.sleep(2000);

	}

	@When("^user to select casuall dress$")
	public void user_to_select_casuall_dress() throws InterruptedException {
		DressPage dp = new DressPage(driver);
		click(dp.getEvening());
		Thread.sleep(2000);
		

	}

	@Then("^user navigate to casuall dress page$")
	public void user_navigate_to_casuall_dress_page() {
		

	}

	@Given("^user navigate to casual dress page$")
	public void user_navigate_to_casual_dress_page() {

	}

	@When("^user to click on quick button in the image$")
	public void user_to_click_on_quick_button_in_the_image() {
	}

	@When("^user  to select dress Quantity$")
	public void user_to_select_dress_Quantity() {
	}

	@When("^user to select dress size$")
	public void user_to_select_dress_size() {
	}

	@When("^user to select on color$")
	public void user_to_select_on_color() {
	}

	@Then("^user to click on add to cart button$")
	public void user_to_click_on_add_to_cart_button() {
	}

	@Given("^user navigated to proceed page$")
	public void user_navigated_to_proceed_page() {
	}

	@When("^user to click on proceed button$")
	public void user_to_click_on_proceed_button() {
	}

	@Then("^user navigate to summary page$")
	public void user_navigate_to_summary_page() {
	}

	@Given("^user navigated to summary page$")
	public void user_navigated_to_summary_page() {
	}

	@When("^user to click on proceed summary button$")
	public void user_to_click_on_proceed_summary_button() {
	}

	@Then("^user to navigate to signin page$")
	public void user_to_navigate_to_signin_page() {
	}

	@Given("^user to navigated to signin page$")
	public void user_to_navigated_to_signin_page() {
	}

	@When("^user to click on proceed proceed to sigin button$")
	public void user_to_click_on_proceed_proceed_to_sigin_button() {
	}

	@Then("^user to navigate to proceed to address page$")
	public void user_to_navigate_to_proceed_to_address_page() {
	}

	@Given("^user to navigated to proceed to address page$")
	public void user_to_navigated_to_proceed_to_address_page() {
	}

	@When("^user to click on proceed to address button$")
	public void user_to_click_on_proceed_to_address_button() {
	}

	@Then("^user to navigate to proceed to shipping page$")
	public void user_to_navigate_to_proceed_to_shipping_page() {
	}

	@Given("^user to navigated to proceed to shipping page$")
	public void user_to_navigated_to_proceed_to_shipping_page() {
	}

	@When("^user to click on terms and service check box$")
	public void user_to_click_on_terms_and_service_check_box() {
	}

	@When("^user to click on proceed to shipping  button$")
	public void user_to_click_on_proceed_to_shipping_button() {
	}

	@Then("^user to navigate to proceed to payment page$")
	public void user_to_navigate_to_proceed_to_payment_page() {
	}

	@Given("^user to navigated to proceed to payment page$")
	public void user_to_navigated_to_proceed_to_payment_page() {
	}

	@When("^user to click on pay by bank wire button$")
	public void user_to_click_on_pay_by_bank_wire_button() {
	}

	@When("^user to click on order confirmation buton$")
	public void user_to_click_on_order_confirmation_buton() {
	}

	@Then("^user navigate to  confirmed order recipt details page$")
	public void user_navigate_to_confirmed_order_recipt_details_page() {
	}

}
