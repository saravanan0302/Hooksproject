package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.lib.LibGlobal;

public class LoginPage extends LibGlobal{
	public LoginPage() {

		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement txtuser;
	@FindBy(xpath="//input[@name='pass']")
	private WebElement txtpasword;
	@FindBy(xpath="//button[@name='login']")
	private WebElement Login;
	@FindBy(xpath="(//a[text()='Forgotten password?'])[1]")
	private WebElement Errormessage;
	public WebElement getErrormessage() {
		return Errormessage;
	}
	public WebElement getTxtuser(){
		return txtuser;
	}
	public WebElement getTxtpasword() {
		return txtpasword;
	}
	public WebElement getLogin() {
		return Login;
	}
	
public void login(String username, String password) {
	
	type(getTxtuser(), username);
	type(getTxtpasword(), password);
}

public void loginbutton() {
	
	btnClick(getLogin());
	
	}
public void Errormess() {

	getattribute(getErrormessage());
}


	

}
