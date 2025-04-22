package com.awesomeqa.example;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;

public class AwesomeqaWeb {
	//id
	//name
	//linktext
	//partiallinktext

	WebDriver wd;
	
	public void init_launchWeb(WebDriver wd)
	{
		this.wd = wd;
	}
	
//	public void launchWeb()
//	{
//		wd = new EdgeDriver();
//		wd.get("https://awesomeqa.com/ui/index.php?route=account/register");
//	}
	
	public void launchWeb()
	{
		wd = new EdgeDriver();
		wd.get("https://www.awesomeqa.com/ui/index.php?route=account/login");
	}
	
	public void enterUserName(String unm)
	{
		wd.findElement(By.id("input-email")).sendKeys(unm);
	}
	
	public void enterPassword(String ps)
	{
//		wd.findElement(By.id("input-password")).sendKeys(ps);
		wd.findElement(By.name("password")).sendKeys(ps);
	}
	
	public void clickRegister()
	{
		wd.findElement(By.linkText("Register")).click();
	}
	
	public void clickForgtPswrd()
	{
		wd.findElement(By.partialLinkText("Forgotten")).click();
	}
	
	// Calculate the number of links present in awesomeqa registeration page
	public int linksCount()
	{
		List <WebElement> list = wd.findElements(By.tagName("a"));
		int countList = list.size();
		
		for(int i=0;i<=countList-1;i++)
		{
			
			String listName = list.get(i).getText();
			System.out.println(listName);
		}
		
		return countList;
	}
	
	public void clickYes()
	{
		WebElement ele = wd.findElement(By.xpath("//input[@name='newsletter'] [@value='1']"));
		ele.click();
		boolean isEnable = ele.isEnabled();
		System.out.println(isEnable);
	}
}
