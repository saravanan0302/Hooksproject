package com.lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LibGlobal {
	public static WebDriver driver;

	public void launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}

		else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
	}
public void implicitwait() {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
}
	
	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void getattribute(WebElement element) {
		element.getAttribute("value");
		
	}
	public void launchUrl(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}

	public void type(WebElement element, String data) {
		element.sendKeys(data);
	}
	public void deletecookies() {
	driver.manage().deleteAllCookies();	
	}
	public void quitbrowser() {
		driver.quit();
	}

	public void btnClick(WebElement element) {
		element.click();

	}

	public void KeyPress(WebElement element) throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
	}

	public void getattri(WebElement element) {
		String at = element.getAttribute("value");
		System.out.println(at);
	}

	public void SelectByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}


}
