package com.RajatAuto.Test;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.sourceforge.htmlunit.corejs.javascript.ContextFactory.Listener;

public class multipalEliment {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "F:/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
	java.util.List<WebElement> lst=	driver.findElements(By.xpath("//a"));
	int count = lst.size();
	
	for(int i=0;i<count-1;i++)
	{
		WebElement link=lst.get(i);
		String text = link.getText();
		System.out.println(text);
		
	}
		

	}

}
