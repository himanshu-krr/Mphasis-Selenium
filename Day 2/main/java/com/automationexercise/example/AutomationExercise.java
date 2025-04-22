package com.automationexercise.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class AutomationExercise {
	
	WebDriver wd;
	
	public void init_launchWeb(WebDriver wd)
	{
		this.wd = wd;
	}
	
	public void launchWeb()
	{
		wd = new EdgeDriver();
		wd.get("https://automationexercise.com/");
	}
	
	public String validateCartName()
	{
		String printdata = wd.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a")).getText();
		return printdata;
	}
	
	public void goTOLogiNAndEnterDetails(String inp1, String inp2)
	{
		wd.findElement(By.xpath("//a[@href='/login']")).click();
		wd.findElement(By.xpath("//input[@name='email']")).sendKeys(inp1);
		wd.findElement(By.xpath("//input[@name='password']")).sendKeys(inp2);
	}
	
	public void cilckOnLogIn()
	{
		wd.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	public String validateLogIn()
	{
		String text = wd.findElement(By.xpath("//p[@style='color: red;']")).getText();
		return text;
	}
	
}
