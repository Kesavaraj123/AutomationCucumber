package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignPage {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	private WebElement sign;

	@FindBy(xpath = "//*[@id=\"email\"]")
	private WebElement mail;

	@FindBy(xpath = "//*[@id=\"passwd\"]")
	private WebElement passwrd;

	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]")
	private WebElement sub;

	public SignPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMail() {
		return mail;
	}

	public WebElement getPasswrd() {
		return passwrd;
	}

	public WebElement getSub() {
		return sub;
	}

	public WebElement getSign() {
		return sign;
	}

}
