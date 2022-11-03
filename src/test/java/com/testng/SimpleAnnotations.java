package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//ASCII VALUE
public class SimpleAnnotations {
	@Test
	private void women() {
		System.out.println("women");
	}

	@Test

	private void dresses() {
		System.out.println("dresses");

	}

	@Test
	private void tshirt() {
		System.out.println("tshirt");

	}

	@BeforeMethod
	private void signin() {
		System.out.println("signin");

	}

	@AfterMethod

	private void signout() {
		System.out.println("signout");

	}

	@BeforeSuite
	private void setProperty() {
		System.out.println("chrome browser");

	}

	@BeforeTest
	private void geturl() {
		System.out.println("url");

	}

	@BeforeClass
	private void getTtitle() {
		System.out.println("Title of the page");

	}

	@AfterClass
	private void closeBrowser() {
		System.out.println("close");

	}

	@AfterTest

	private void deletecookies() {

		System.out.println("deletecookies");
	}
	
	@AfterSuite

	private void terminate() {

		System.out.println("terminate");
	}

}
