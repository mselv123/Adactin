package com.base_class;

public class Main_Class extends Base_Class_Programs {
	public static void main(String[] args) throws InterruptedException {
		LaunchBrowser();
		LoadUrl("https://www.facebook.com/");

		Pojo_Class p = new Pojo_Class();
		create(p.getCreate());
		Thread.sleep(2000);
		Fname(p.getFname(), "Monisha");
		Lname(p.getLname(), "Selvam");
		Eaddress(p.signEmail, "monishaselvam@gmail.com");
		Eaddress1(p.enterEmail, "monishaselvam@gmail.com");
		pass(p.signPass, "Monisha@123");
		selectDropDown(p.getDay(), "10");
		selectDropDown(p.getMonth(), "8");
		selectDropDown(p.getYear(), "1999");
		buttonclick(p.getGender());
		buttonclick(p.getSignup());
		getCurrentUrl();
		getTitle();

	}

}
