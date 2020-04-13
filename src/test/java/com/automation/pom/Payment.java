package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	private WebElement bankpay;
	@FindBy(xpath = "//*[@id=\"cart_navigation\"]/button")
	private WebElement confirm;

	public Payment(WebDriver driver2) {
		
		this.driver=driver2;
		PageFactory.initElements(driver , this);
	}

	public WebElement getBankpay() {
		return bankpay;
	}

	public WebElement getConfirm() {
		return confirm;
	}

}
