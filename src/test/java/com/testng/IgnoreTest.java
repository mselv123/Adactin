package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {

	@Test
	private void women() {
		System.out.println();

	}

	@Test
	@Ignore
	private void men() {
		System.out.println();

	}

	@Test(enabled = false)
	private void kids() {
		System.out.println();

	}

}
