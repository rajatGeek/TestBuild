package com.RajatAuto.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class utube {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.youtube.com");
		driver.findElement(By.xpath("html/body/div[2]/div[2]/div[2]/div/div[3]/form/div/input")).sendKeys("moula mere moula ");

	}

}
