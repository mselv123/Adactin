package com.base_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Base_Class_Programs {
	static WebDriver driver;
	public static void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\admin\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	public static void LoadUrl(String Url) {
		driver.get(Url);		
	}	
	public static void create(WebElement c) {
		c.click();
	}
	public static void Fname(WebElement fn, String firstname) {
		fn.sendKeys(firstname);
	}
	public static void Lname(WebElement ln, String lastname) {
		ln.sendKeys(lastname);
	}
	public static void Eaddress(WebElement email, String email_address) {
		email.sendKeys(email_address);
	}
	public static void Eaddress1(WebElement email, String email_address) {
		email.sendKeys(email_address);
	}

	public static void pass(WebElement pass, String password) {
		pass.sendKeys(password);
	}
	public static void selectDropDown(WebElement element, String value) {
		Select s = new Select(element);
		s.selectByValue(value);	
	}
	public static void getTitle() {

		String Title = driver.getTitle();
		System.out.println(Title);
	}
	public static void getCurrentUrl() {

		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
	}
	public static void buttonclick(WebElement c) {
		c.click();
	}	
	public static void quitBrowser() {
		driver.quit();
	}

}
