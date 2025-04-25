package com.javascriptexecutor.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScriptExecutor {
	
	WebDriver wd;
	
	public void initWeb(WebDriver wd)
	{
		this.wd = wd;
		
	}
	
	public void launchWeb()
	{
		wd = new EdgeDriver();
		wd.get("https://awesomeqa.com/ui/index.php?route=account/login");
	}
	
	public void demo() throws InterruptedException
	{
		JavascriptExecutor js = (JavascriptExecutor)wd;
		Thread.sleep(2000);
		
		WebElement un = wd.findElement(By.id("input-email"));
		WebElement pw = wd.findElement(By.id("input-password"));
		WebElement lg = wd.findElement(By.xpath("//input[@type='submit']"));
		
		js.executeScript("arguments[0].value ='user@email.com';", un);
		Thread.sleep(2000);
		js.executeScript("arguments[0].value ='passcode@234';", pw);
		
		Thread.sleep(2000);
		
		js.executeScript("arguments[0].click();", lg);
	}

}
