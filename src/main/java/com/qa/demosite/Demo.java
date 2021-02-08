package com.qa.demosite;

import org.aspectj.lang.annotation.Before;
import org.junit.After;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {
	
	public static RemoteWebDriver driver;
	private static final String URL = "http://thedemosite.co.uk/";
	
	  @Before
	    public void setup() {
	        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chrome/chromedriver.exe");
	        driver = new ChromeDriver();
	        driver.manage().window().setSize(new Dimension(1366, 768));
	    }
	  
	  @Test
	  
	  
	  @After
	    public void tearDown() {
	        driver.close();
	    }

}
