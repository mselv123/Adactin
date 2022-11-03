package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

	@Test

	@Parameters({ "username", "password" })
	private void credentials(@Optional("Nisha") String username, @Optional("Moni@345") String password) {
		System.out.println("username" + username);
		System.out.println("password" + password);

	}

}
