package com.amazonjavascript.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class AmazonJavaScript {
	
	WebDriver wd;
	
	public void initWeb(WebDriver wd)
	{
		this.wd = wd;
		
	}
	
	public void launchWeb()
	{
		wd = new EdgeDriver();
		wd.get("https://www.amazon.in/");
		wd.manage().window().setSize(new org.openqa.selenium.Dimension(500,500));
	}
	
	public void demo() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)wd;
		Thread.sleep(2000);
		
		WebElement dd = wd.findElement(By.id("searchDropdownBox"));
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", dd);
	}
}
