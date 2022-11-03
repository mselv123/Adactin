package com.testng;

import org.testng.annotations.Test;

public class Grouping {

	@Test(groups = "chat")
	private void whatsapp() {
		System.out.println("whatsapp");
	}

	@Test(groups = "chat")
	private void telegram() {
		System.out.println("telegram");

	}

	@Test(groups = "shopping")
	private void amazon() {
		System.out.println("amazon");
	}

	@Test(groups = "shopping")
	private void flipkart() {
		System.out.println("flipkart");
	}

	@Test(groups = "banking")
	private void axisbank() {
		System.out.println("axisbank");

	}

	@Test(groups = "banking")
	private void hdfcbank() {
		System.out.println("hdfcbank");

	}

}
