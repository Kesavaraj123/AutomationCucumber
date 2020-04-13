package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"uniform-cgv\"]")
	private WebElement checkbox;

	@FindBy(xpath = "//*[@id=\"form\"]/p/button")
	private WebElement proceed;

	public Shipping(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getProceed() {
		return proceed;
	}

}
