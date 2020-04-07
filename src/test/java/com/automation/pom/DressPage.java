package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DressPage {
	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/a")
	private WebElement women;

	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[1]/ul/li[2]/ul/li[1]/a")
	private WebElement casual;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]")
	private WebElement evening;

	/*
	 * public DressPage(WebDriver driver2) {
	 * 
	 * }
	 */

	public DressPage(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getWomen() {
		return women;
	}

	public WebElement getCasual() {
		return casual;
	}

	public WebElement getEvening() {
		return  evening;
	}

}
