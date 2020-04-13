package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"center_column\"]/form/p/button")
	private WebElement address;

	public Address(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getAddress() {
		return address;
	}

}
