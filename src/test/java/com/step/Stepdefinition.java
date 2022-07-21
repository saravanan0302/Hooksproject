package com.step;

import com.lib.LibGlobal;
import com.pages.LoginPage;
import com.pages.SignupPage;

import io.cucumber.java.en.*;

public class Stepdefinition extends LibGlobal {

	@Given("User launch the facebook web application URL")
	public void userLaunchTheFacebookWebApplicationURL() {
		

	}

	@When("User Enters valid {string} and  valid {string}")
	public void userEntersValidAndValid(String username, String password) {
		LoginPage loginPage = new LoginPage();
		loginPage.login(username, password);
	}

	@When("User clicks the login button")
	public void userClicksTheLoginButton() {
		LoginPage loginPage = new LoginPage();
		loginPage.loginbutton();
	}

	@Then("User verify the Error message is displayed")
	public void userVerifyTheErrorMessageIsDisplayed() {
		
	}

	@When("User clicks the signup Button")
	public void userClicksTheSignupButton() {
		SignupPage signup = new SignupPage();
		signup.Clickignup();
	}

	@When("clicks the create new account button")
	public void clicksTheCreateNewAccountButton() {
		SignupPage signupPage = new SignupPage();
		signupPage.clickcreate();

	}

	@Then("User enters the invalid {string} and {string}")
	public void userEntersTheInvalidAnd(String string, String string2) {
		SignupPage signup = new SignupPage();
		signup.firstname(string);
		signup.lastname(string2);

	}

}
