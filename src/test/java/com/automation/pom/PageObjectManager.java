package com.automation.pom;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	public static WebDriver driver;

	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public static SignPage sp;
	public static DressPage dp;
	public static CasuallDress cd;
	public static ProceedOne pr1;
	public static SummaryPage smp;
	public static Address ad;
	public static Shipping shp;
	public static Payment pm;

	public static SignPage getSp() {
		sp = new SignPage(driver);
		return sp;
	}

	public static DressPage getDp() {
		dp = new DressPage(driver);
		return dp;
	}

	public static CasuallDress getCd() {
		cd = new CasuallDress(driver);
		return cd;
	}

	public static ProceedOne getPr1() {
		pr1 = new ProceedOne(driver);
		return pr1;
	}

	public static SummaryPage getSmp() {
		smp = new SummaryPage(driver);
		return smp;
	}

	public static Address getAd() {
		ad = new Address(driver);
		return ad;
	}

	public static Shipping getShp() {
		shp = new Shipping(driver);
		return shp;
	}

	public static Payment getPm() {
		pm = new Payment(driver);
		return pm;
	}

}
