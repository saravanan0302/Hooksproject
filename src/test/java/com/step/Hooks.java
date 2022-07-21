package com.step;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.lib.LibGlobal;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends LibGlobal {
	
	@Before
	public void before() {
		launchBrowser("chrome");
		launchUrl("https://www.facebook.com/");
		maximizeWindow();
		implicitwait();
		
	
	}
@After

public void after() throws IOException {

TakesScreenshot tk=	(TakesScreenshot)driver;
File screenshotAs = tk.getScreenshotAs(OutputType.FILE);
File dest=new File("D:\\facebook.png");
FileUtils.copyFile(screenshotAs, dest);

quitbrowser();
}

}
