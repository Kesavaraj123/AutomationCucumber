package com.automation.stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.automation.pom.Address;
import com.automation.pom.CasuallDress;
import com.automation.pom.DressPage;
import com.automation.pom.PageObjectManager;
import com.automation.pom.Payment;
import com.automation.pom.ProceedOne;
import com.automation.pom.Shipping;
import com.automation.pom.SignPage;
import com.automation.pom.SignProceed;
import com.automation.pom.SummaryPage;
import com.automation.runner.Runner;
import com.baseclass.auto.BaseClass;

import cucumber.api.java.en.*;

public class StepDefinition extends BaseClass {
	public static WebDriver driver = Runner.driver;
	public static PageObjectManager pom = new PageObjectManager(driver);

	@Given("^user to Launch the browser$")
	public void user_to_Launch_the_browser() throws Throwable {
		System.out.println(" GIVEN BACKGROUND PART  EXECUTED ");
	}

	@Given("^user to login the application$")
	public void user_to_login_the_application() {
		System.out.println("BACKGROUND EXECUTE BEFORE  TO EACH SCENARIO ");

	}

	@When("^user to click on  sign in button$")
	public void user_to_click_on_sign_in_button1() throws Throwable {

		System.out.println("user LAUNCH  URL AND NAVIGATED TO SIGN PAGE  ");

	}

	@Given("^user launch the automation practice application$")
	public void user_launch_the_automation_practice_application() throws InterruptedException {
		/*
		 * driver = browserLaunch("chrome");
		 * getUrl("http://automationpractice.com/index.php");
		 */
		System.out.println("launched on ruuner class");
		Thread.sleep(5000);

	}

	@When("^user to click on sign in button$")
	public void user_to_click_on_sign_in_button() throws InterruptedException {
		/*
		 * SignPage sp = new SignPage(driver); click(sp.getSign());
		 */
		click(pom.getSp().getSign());
		Thread.sleep(5000);

	}

	@Then("^user navigate to homepage of automation practice$")
	public void user_navigate_to_homepage_of_automation_practice() throws InterruptedException {
		System.out.println("user naviagtinG to home page");
		Thread.sleep(5000);
	}

	@Given("^user enter the valid username \\\"([^\\\"]*)\\\" on username field$")
	public void user_enter_the_valid_username_on_username_field(String username) throws InterruptedException {

		/*
		 * SignPage sp = new SignPage(driver); typehere(sp.getMail(), username);
		 */
		typehere(pom.getSp().getMail(), username);
		Thread.sleep(5000);

	}

	@When("^user enter the valid password \\\"([^\\\"]*)\\\" on password field$")
	public void user_enter_the_valid_password_on_password_field(String password) throws InterruptedException {

		/*
		 * SignPage sp = new SignPage(driver); typehere(sp.getPasswrd(), password);
		 */
		typehere(pom.getSp().getPasswrd(), password);
		Thread.sleep(5000);

	}

	@When("^user click on submit button$")
	public void user_click_on_submit_button() throws InterruptedException {
		// SignPage sp = new SignPage(driver);
		/*
		 * SignPage sp = new SignPage(driver); click(sp.getSub());
		 */
		click(pom.getSp().getSub());
		Thread.sleep(5000);

	}

	@Then("^user validate the name of the user in homepage$")
	public void user_validate_the_name_of_the_user_in_homepage() {
		System.out.println(" user  SUCESSFULLY CHECKED  USER name & passwrd");

	}

	@Given("^user navigated to homepage$")
	public void user_navigated_to_homepage() {
		System.out.println("opened next page");

	}

	@When("^user to select type of dress$")
	public void user_to_select_type_of_dress() throws InterruptedException {
		/*
		 * DressPage dp = new DressPage(driver); Actions(dp.getWomen());
		 */
		Actions(pom.getDp().getWomen());
		Thread.sleep(2000);

	}

	@When("^user to select casuall dress$")
	public void user_to_select_casuall_dress() throws InterruptedException {
		/*
		 * DressPage dp = new DressPage(driver); Actions(dp.getDress());
		 */
		Actions(pom.getDp().getDress());
		Thread.sleep(2000);

	}

	@Then("^user navigate to casuall dress page$")
	public void user_navigate_to_casuall_dress_page() throws InterruptedException {
		/*
		 * DressPage dp = new DressPage(driver); click(dp.getCasual());
		 */
		click(pom.getDp().getCasual());
		Thread.sleep(8000);

	}

	@Given("^user navigate to casual dress page$")
	public void user_navigate_to_casual_dress_page() {
		System.out.println("succesfully navigated to casual dress page");

	}

	@When("^user to click on quick button in the image$")
	public void user_to_click_on_quick_button_in_the_image() throws InterruptedException {
		/*
		 * CasuallDress cd = new CasuallDress(driver); Actions(cd.getImg());
		 * click(cd.getQwick());
		 */
		Actions(pom.getCd().getImg());
		click(pom.getCd().getQwick());
		Thread.sleep(8000);

	}

	@When("^user  to select dress Quantity$")
	public void user_to_select_dress_Quantity() throws InterruptedException {
		/*
		 * CasuallDress cd = new CasuallDress(driver); driver.switchTo().frame(0);
		 * Thread.sleep(5000); click(cd.getPlus()); click(cd.getPlus());
		 * click(cd.getPlus()); click(cd.getPlus()); click(cd.getPlus());
		 * click(cd.getPlus()); Thread.sleep(5000); click(cd.getMinus());
		 * click(cd.getMinus()); click(cd.getMinus());
		 */
		// Frame(pom.getCd().getFrame());
		driver.switchTo().frame(0);
		Thread.sleep(5000);
		click(pom.getCd().getPlus());
		click(pom.getCd().getPlus());
		click(pom.getCd().getPlus());
		click(pom.getCd().getPlus());
		click(pom.getCd().getPlus());
		click(pom.getCd().getPlus());
		click(pom.getCd().getPlus());
		Thread.sleep(5000);
		click(pom.getCd().getMinus());
		click(pom.getCd().getMinus());
		click(pom.getCd().getMinus());
		click(pom.getCd().getMinus());
		Thread.sleep(5000);
	}

	@When("^user to select dress size$")
	public void user_to_select_dress_size() throws InterruptedException {

		/*
		 * CasuallDress cd = new CasuallDress(driver);
		 * 
		 * click(cd.getSize()); robot();
		 */
		click(pom.getCd().getSize());
		robot();
		Thread.sleep(3000);
	}

	@When("^user to select on color$")
	public void user_to_select_on_color() throws InterruptedException {
		/*
		 * CasuallDress cd = new CasuallDress(driver); click(cd.getColor());
		 */
		click(pom.getCd().getColor());
		Thread.sleep(3000);
	}

	@Then("^user to click on add to cart button$")
	public void user_to_click_on_add_to_cart_button() throws InterruptedException {
		/*
		 * CasuallDress cd = new CasuallDress(driver);
		 * 
		 * click(cd.getAddcart());
		 */
		click(pom.getCd().getAddcart());

		Thread.sleep(2000);
	}

	@Given("^user navigated to proceed page$")
	public void user_navigated_to_proceed_page() {
		System.out.println("user successfully navigated to proceed page");
	}

	@When("^user to click on proceed button$")
	public void user_to_click_on_proceed_button() throws InterruptedException {
		/*
		 * ProceedOne pr1 = new ProceedOne(driver); click(pr1.getProceedone());
		 */
		click(pom.getPr1().getProceedone());

		Thread.sleep(6000);
	}

	@Then("^user navigate to summary page$")
	public void user_navigate_to_summary_page() {
		System.out.println("sucessfully proceeded one");
	}

	@Given("^user navigated to summary page$")
	public void user_navigated_to_summary_page() {
		System.out.println("user navigated to summary page to proceed");
	}

	@When("^user to click on proceed summary button$")
	public void user_to_click_on_proceed_summary_button() throws InterruptedException {

		/*
		 * SummaryPage smp = new SummaryPage(driver); click(smp.getSummary());
		 */
		click(pom.getSmp().getSummary());
		Thread.sleep(8000);

	}

	@Then("^user to navigate to signin page$")
	public void user_to_navigate_to_signin_page() throws InterruptedException {
		System.err.println("address page");
		Thread.sleep(5000);
	}

	/*
	 * @Given("^user to navigated to signin page$") public void
	 * user_to_navigated_to_signin_page() { System.out.println("sigin to"); }
	 * 
	 * @When("^user to click on proceed proceed to sigin button$") public void
	 * user_to_click_on_proceed_proceed_to_sigin_button() {
	 * 
	 * System.out.println("sigin click");
	 * 
	 * SignProceed spp = new SignProceed(driver); click(spp.getSignin());
	 * 
	 * }
	 * 
	 * @Then("^user to navigate to proceed to address page$") public void
	 * user_to_navigate_to_proceed_to_address_page() {
	 * System.out.println("user navigate to address pae "); }
	 */
	/*
	 * Scenario: user to check for to proceed sigin
	 * 
	 * Given user to navigated to signin page When user to click on proceed proceed
	 * to sigin button Then user to navigate to proceed to address page
	 */
	@Given("^user to navigated to proceed to address page$")
	public void user_to_navigated_to_proceed_to_address_page() {
		System.out.println("user came to navigated page successfully");
	}

	@When("^user to click on proceed to address button$")
	public void user_to_click_on_proceed_to_address_button() throws InterruptedException {
		/*
		 * Address ad = new Address(driver); click(ad.getAddress());
		 */
		click(pom.getAd().getAddress());
		Thread.sleep(8000);

	}

	@Then("^user to navigate to proceed to shipping page$")
	public void user_to_navigate_to_proceed_to_shipping_page() {
		System.out.println("user navigated to shipping page");
	}

	@Given("^user to navigated to proceed to shipping page$")
	public void user_to_navigated_to_proceed_to_shipping_page() {
		System.out.println("user sucessfully navigated to shipping page");
	}

	@When("^user to click on terms and service check box$")
	public void user_to_click_on_terms_and_service_check_box() throws InterruptedException {

		/*
		 * Shipping shp = new Shipping(driver); click(shp.getCheckbox());
		 */
		click(pom.getShp().getCheckbox());

		Thread.sleep(2000);

	}

	@When("^user to click on proceed to shipping  button$")
	public void user_to_click_on_proceed_to_shipping_button() throws InterruptedException {
		/*
		 * Shipping shp = new Shipping(driver); click(shp.getProceed());
		 */
		click(pom.getShp().getProceed());
		Thread.sleep(2000);
	}

	@Then("^user to navigate to proceed to payment page$")
	public void user_to_navigate_to_proceed_to_payment_page() {
		System.out.println("user navgited to payment page");
	}

	@Given("^user to navigated to proceed to payment page$")
	public void user_to_navigated_to_proceed_to_payment_page() {
		System.out.println("user succesfully navigated to payment page ");
	}

	@When("^user to click on pay by bank wire button$")
	public void user_to_click_on_pay_by_bank_wire_button() throws InterruptedException {
		/*
		 * Payment pm = new Payment(driver); click(pm.getBankpay());
		 */
		click(pom.getPm().getBankpay());
		Thread.sleep(2000);
	}

	@When("^user to click on order confirmation buton$")
	public void user_to_click_on_order_confirmation_buton() throws InterruptedException {
		/*
		 * Payment pm = new Payment(driver); click(pm.getConfirm());
		 */
		click(pom.getPm().getConfirm());
		Thread.sleep(2000);
	}

	@Then("^user navigate to  confirmed order recipt details page$")
	public void user_navigate_to_confirmed_order_recipt_details_page() {

		System.out.println("user sucessfully  dress order booked and sucessfully payment recived");
	}

}
