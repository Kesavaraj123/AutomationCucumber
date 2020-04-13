package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class CasuallDress {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//div[@class='product-image-container']")//*[@id="center_column"]/ul/li/div/div[1]/div
	private WebElement img;

	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement qwick;

	@FindBy(id = "product")
	private WebElement frame;

	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement plus;

	@FindBy(xpath = "//a[@class='btn btn-default button-minus product_quantity_down']")
	private WebElement minus;

	@FindBy(id = "group_1")
	private WebElement size;

	@FindBy(id = "color_13")
	private WebElement color;

	@FindBy(id = "add_to_cart")
	private WebElement addcart;
	
	
	public CasuallDress(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
		
	}


	public WebElement getImg() {
		return img;
	}


	public WebElement getQwick() {
		return qwick;
	}


	public WebElement getFrame() {
		return frame;
	}


	public WebElement getPlus() {
		return plus;
	}


	public WebElement getMinus() {
		return minus;
	}


	public WebElement getSize() {
		return size;
	}


	public WebElement getColor() {
		return color;
	}


	public WebElement getAddcart() {
		return addcart;
	}


}
