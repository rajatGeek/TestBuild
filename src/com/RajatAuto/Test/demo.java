package com.RajatAuto.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","F:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("7597455234");
		driver.findElement(By.id("pass")).sendKeys("simaa@rajat");
		driver.findElement(By.xpath("//tbody/tr[2]/td[3]/label/input")).click();
        driver.findElement(By.xpath("//div[2]/div[2]/div/a/div")).click();
        
	}

}
