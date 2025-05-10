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

	public void practicing()
	{
		List <WebElement> rl = wd.findElements(By.xpath("(//table[@class ='ws-table-all'])/tbody/tr"));
		System.out.println(rl.size());
		
		List <WebElement> rc = wd.findElements(By.xpath("(//table[@class ='ws-table-all'])/tbody/tr[1]/th"));
		System.out.println(rc.size());
		
//		for(int r=2;r<=rl.size();r++)
//		{
//			for(int c=1;c<=rc.size();c++)
//			{
//				String d = wd.findElement(By.xpath("//table/tbody/tr[" + r + "]/td[" + c + "]")).getText();
//				System.out.print(d);
//			}
//		}
		// Loop through rows including the header row
		for (int r = 1; r <= rl.size(); r++) { // Start from the first row (header row)
			for (int c = 1; c <= rc.size(); c++) {
				// For the header row (tr[1]), use 'th', otherwise use 'td'
				String cellData;
				if (r == 1) { // Header row
					cellData = wd.findElement(By.xpath("(//table[@class ='ws-table-all'])/tbody/tr[" + r + "]/th[" + c + "]")).getText();
				} else { // Data rows
					cellData = wd.findElement(By.xpath("(//table[@class ='ws-table-all'])/tbody/tr[" + r + "]/td[" + c + "]")).getText();
				}
				System.out.print(cellData + "\t"); // Add a tab for formatting between columns
			}
			System.out.println();
		}// Move to the next line after printing all columns in a row
	}
	
	
	public void getTable()
	{
		List <WebElement> l = wd.findElements(By.id("customers"));
		
		for(int i =0; i<l.size(); i++)
		{
			System.out.println(l.get(i).getText());
		}
	}
}
