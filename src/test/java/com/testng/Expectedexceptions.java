package com.testng;

import org.testng.annotations.Test;

public class Expectedexceptions {
	@Test(expectedExceptions = ArithmeticException.class)
	
	private void add() {
		int a= 10;
		int b=0;
		System.out.println(a/b);                  //passed

	}
	
		@Test(expectedExceptions = ArithmeticException.class)
		
		private void sub() {
			int a= 10;
			int b=0;
			System.out.println(a+b);                  //failed

		}

	}



