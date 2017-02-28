package com.RajatAuto.Test;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.server.session.JDBCSessionIdManager.SessionTableSchema;



public class windowHandle1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.naukri.com");
		 Set<String> allwh=driver.getWindowHandles();
		 driver.close();
		 for(String wh : allwh)
		 {
			 driver.switchTo().window(wh);
			 String title = driver.getTitle();
			 System.out.println(title);
			 
			 
		 }
		
		 
	}

}
