package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class DressPage {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;

	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dress;

	@FindBy(xpath = "(//a[@title='Casual Dresses'])[2]")
	private WebElement casual;

	

	public DressPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getDress() {
		return dress;
	}

	public WebElement getCasual() {
		return casual;
	}

}
