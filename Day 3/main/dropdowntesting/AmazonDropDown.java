package com.amazon.dropdowntesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropDown {
	WebDriver wd;
	
	
	public void init(WebDriver wd)
	{
		this.wd = wd;
		
	}
	
	public void invokeApp()
	{
		wd = new EdgeDriver();
//		wd = new ChromeDriver();
//		wd = new FirefoxDriver();
		wd.get("https://www.amazon.in/");
	}
	
	public void selectAnOpt() throws InterruptedException
	{
		WebElement selectele = wd.findElement(By.id("searchDropdownBox"));
		Select sel = new Select(selectele);
		Thread.sleep(3000);
//		sel.selectByVisibleText("Amazon Devices");
		sel.selectByValue("search-alias=alexa-skills");
	}
	
	public List <WebElement> selectOpt()
	{
		WebElement selectele = wd.findElement(By.id("searchDropdownBox"));
		
		Select sel = new Select(selectele);
		List <WebElement> listdata = sel.getOptions();
		
		return listdata;
	}
	
	public int linksCount()
	{
		List <WebElement> list = wd.findElements(By.tagName("img"));
		int countList = list.size();
		
		for(int i=0;i<=countList-1;i++)
		{
			
			String listName = list.get(i).getText();
		}
		
		return countList;
	}
	
}
