package com.w3school.table;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class W3SchoolTable {
	WebDriver wd;
	
	
	public void init(WebDriver wd)
	{
		this.wd = wd;
		
	}
	
	public void launchApp()
	{
		wd = new EdgeDriver();
		wd.get("https://www.w3schools.com/html/html_tables.asp");
	}
	
//	public WebElement selectDataFromTable()
//	{
//		
//		WebElement ele = wd.findElement(By.xpath("//*[@id=\"customers\"]/tbody/tr[2]/td[2]"));
//		return ele;
//	}
	
	public void getTable()
	{
		List <WebElement> l = wd.findElements(By.id("customers"));
		
		for(int i =0; i<l.size(); i++)
		{
			System.out.println(l.get(i).getText());
		}
	}
}
