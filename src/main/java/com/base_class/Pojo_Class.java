package com.base_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_Class extends Base_Class_Programs {
	public Pojo_Class() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "(//a[@role='button'])[2]")
	WebElement create;

	@FindBy(xpath = "//input[@name='firstname']")
	WebElement Fname;

	@FindBy(xpath = "//input[@name='lastname']")
	WebElement Lname;

	@FindBy(xpath = "(//input[@type='text'])[4]")
	WebElement signEmail;

	@FindBy(xpath = "(//input[@type='text'])[5]")
	WebElement enterEmail;

	@FindBy(xpath = "(//input[@type='password'])[2]")
	WebElement signPass;

	@FindBy(xpath = "//select[@id='day']")
	WebElement day;

	@FindBy(xpath = "//select[@id='month']")
	WebElement month;

	@FindBy(xpath = "//select[@id='year']")
	WebElement year;

	@FindBy(xpath = "//input[@value='1']")
	WebElement gender;

	@FindBy(xpath = "//button[@name='websubmit']")
	WebElement signup;

	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement pass;

	@FindBy(xpath = "//button[@name='login']")
	WebElement login;

	public WebElement getCreate() {
		return create;
	}

	public void setCreate(WebElement create) {
		this.create = create;
	}

	public WebElement getFname() {
		return Fname;
	}

	public void setFname(WebElement fname) {
		Fname = fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public void setLname(WebElement lname) {
		Lname = lname;
	}

	public WebElement getDay() {
		return day;
	}

	public void setDay(WebElement day) {
		this.day = day;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getGender() {
		return gender;
	}

	public void setGender(WebElement gender) {
		this.gender = gender;
	}

	public WebElement getSignup() {
		return signup;
	}

	public void setSignup(WebElement signup) {
		this.signup = signup;
	}

	public WebElement getLogin() {
		return login;
	}

	public void setLogin(WebElement login) {
		this.login = login;
	}

	public WebElement getSignEmail() {
		return signEmail;
	}

	public void setSignEmail(WebElement signEmail) {
		this.signEmail = signEmail;
	}

	public WebElement getSignPass() {
		return signPass;
	}

	public void setSignPass(WebElement signPass) {
		this.signPass = signPass;
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(WebElement email) {
		this.email = email;
	}

	public WebElement getPass() {
		return pass;
	}

	public void setPass(WebElement pass) {
		this.pass = pass;
	}

}
