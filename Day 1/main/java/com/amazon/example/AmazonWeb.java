package com.amazon.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonWeb {
	
	WebDriver wd;
	String filepath = "./AllConfig/Configdata.properties";
	Properties p = new Properties();
	
	public void init_AmazonWeb(WebDriver wd)
	{
		this.wd = wd;
	}
	
	public void launchAmazonApp() throws IOException
	{
		FileReader fr = new FileReader(filepath);
		p.load(fr);
		wd = new ChromeDriver();
		wd.get(p.getProperty("BaseUrl"));
	}
	
	public void enterInputSearchString(String inp)
	{
		wd.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys(inp);
	}
	
	public void clickToSearch()
	{
		wd.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
	}
	
	public String validateFindLocation()
	{
		String printdata = wd.findElement(By.xpath("//*[@id='glow-ingress-line1']")).getText();
		return printdata;
	}
	
}
