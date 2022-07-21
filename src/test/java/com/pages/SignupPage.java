package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.LibGlobal;

public class SignupPage extends LibGlobal {
	public SignupPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createBtn;
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement firstname;
	@FindBy(xpath = "(//input[@type='text'])[3]")
	private WebElement lastname;
	@FindBy(xpath = "(//button[text()='Sign Up'])[1]")
	private WebElement signup;


	public WebElement getSignup() {
		return signup;
	}

	public WebElement getCreateBtn() {
		return createBtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void clickcreate() {

		btnClick(getCreateBtn());
	}

	public void firstname(String firstname) {
		type(getFirstname(), firstname);

	}

	public void lastname(String lastname) {
		type(getLastname(), lastname);

	}

	public void Clickignup() {
		btnClick(getSignup());
	}

}
