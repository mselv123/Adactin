package com.testng;

import org.testng.annotations.Test;

public class DependsonMethod {
	
	@Test
	private void browserLaunch() {
		System.out.println("browserLaunch");

	}
	@Test(dependsOnMethods = "browserLaunch")
	private void url() {
		System.out.println("url");

	}
	@Test(dependsOnMethods = "url")
	private void login() {
		System.out.println("user login");

	}
	@Test(dependsOnMethods = "user login")
	private void logout() {
		System.out.println("user logout");

	}
	

}
