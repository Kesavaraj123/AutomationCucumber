package com.baseclass.auto;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browsername) {
		try {
			if (browsername.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"C:\\Users\\kesavaraj\\eclipse-workspace\\AutomationPractice\\Driver\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equalsIgnoreCase("ie")) {

				System.setProperty("webdriver.ie.driver",
						"C:\\Users\\kesavaraj\\eclipse-workspace\\SeleniumConcept\\Driver\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			} else if (browsername.equalsIgnoreCase("firefox")) {

				System.setProperty("webdriver.gecko.driver",
						"C:\\Users\\kesavaraj\\eclipse-workspace\\SeleniumConcept\\Driver\\geckoDriver.exe");
				driver = new FirefoxDriver();
			} else {
				System.out.println("Invalid browsename");
			}
			driver.manage().window().maximize();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	public static void getUrl(String url) {
		try {
			driver.get(url);

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public static void getCurrentUrl(String Url) {
		try {
			driver.getCurrentUrl();

		} catch (Exception e) {

		}

	}

	public static void getTitle(String title) {
		try {
			driver.getTitle();

		} catch (Exception e) {

		}

	}

	public static void navigateto(String Url) {
		try {
			driver.navigate();

		} catch (Exception e) {

		}

	}

	public static void navigateback() {
		try {
			driver.navigate().back();
		} catch (Exception e) {

		}

	}

	public static void navigateforward() {
		try {
			driver.navigate().forward();

		} catch (Exception e) {
		}
	}

	public static void navigaterefresh() {
		try {
			driver.navigate().refresh();
		} catch (Exception e) {

		}

	}

	public static void dropDown(WebElement element, String option, String input) {
		Select s = new Select(element);

		if (option.equals("Index")) {
			int parseInt = Integer.parseInt(input);
			s.selectByIndex(parseInt);
		} else if (option.equals("value")) {
			s.selectByValue(input);
		} else if (option.equalsIgnoreCase("text")) {
			s.selectByVisibleText(input);

		}
	}

	public static void close() {
		driver.close();
	}

	public static void quit() {
		driver.quit();

	}

	public static void Actions(WebElement element) {
		Actions ac = new Actions(driver);
		ac.moveToElement(element).build().perform();

	}

	public static void click(WebElement element) {
		try {
			element.click();

		} catch (Exception e) {

		}

	}

	public static void getAttribute(WebElement element, String value) {
		try {
			element.getAttribute(value);
		} catch (Exception e) {

		}

	}

	public void getText(WebElement element) {
		try {
			element.getText();

		} catch (Exception e) {
		}

	}

	public static void isEnabled(WebElement element) {
		try {
			element.isEnabled();
		} catch (Exception e) {
		}
	}

	public static void isDisplayed(WebElement element) {
		try {
			element.isDisplayed();
		} catch (Exception e) {
		}
	}

	public static void isSelected(WebElement element) {
		try {
			element.isSelected();

		} catch (Exception e) {

		}
	}

	public static void isMultiple(WebElement element) {
		try {
			isMultiple(element);
		} catch (Exception e) {
		}
	}

	public static void typehere(WebElement element, String value) {
		try {
			element.sendKeys(value);
		} catch (Exception e) {

		}
	}

	public static void sAlert() {
		try {
			Alert salrt = driver.switchTo().alert();
			salrt.accept();

		} catch (Exception e) {

		}

	}

	public static void cAlert() {
		try {
			Alert cnfrmalert = driver.switchTo().alert();
			cnfrmalert.dismiss();

		} catch (Exception e) {

		}

	}

	public static void pAlert(WebElement element, String value) {
		try {
			Alert prmptalert = driver.switchTo().alert();
			prmptalert.sendKeys(value);
			prmptalert.accept();

		} catch (Exception e) {

		}

	}

	public static void dragdrop(WebElement drag, WebElement drop) {
		try {
			Actions ac = new Actions(driver);
			ac.dragAndDrop(drag, drop).build().perform();

		} catch (Exception e) {

		}

	}

	public static void robot() {
		try {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);

			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
		}

	}

	public static void Screenshot(String file) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			// TakesScreenshot ts = (TakesScreenshot) driver;
			File src1file = ts.getScreenshotAs(OutputType.FILE);
			File des1file = new File("C:\\eclipse-workspace\\SeleniumConcepts\\Screenshot\\" + file + ".png");
			FileUtils.copyFile(src1file, des1file);

		} catch (Exception e) {
		}

	}

	public static void UpandDown() {
		try {
			JavascriptExecutor js = (JavascriptExecutor) driver;

		} catch (Exception e) {
		}
	}

	public static void Frame(WebElement element) {
		try {
			driver.switchTo().frame(element);

		} catch (Exception e) {
		}
	}

	public static void checkBox(List<WebElement> elements, String attributeName, String attributeValue) {
		for (WebElement test : elements) {
			if (test.getAttribute(attributeName).equals(attributeValue)
					|| test.getAttribute(attributeName).equals(attributeValue)) {
				test.click();
			}
		}

	}

}
