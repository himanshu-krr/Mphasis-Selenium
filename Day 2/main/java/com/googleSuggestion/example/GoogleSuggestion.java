package com.googleSuggestion.example;

import java.time.Duration;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSuggestion {
	
	WebDriver wd;
	
	public void init_launchWeb(WebDriver wd)
	{
		this.wd = wd;
	}
	
	public void launchWeb()
	{
		wd = new EdgeDriver();
		wd.get("https://www.google.com/");
	}
	
	public void clickOnInputArea(String inp)
	{
		wd.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys(inp);
	}
	
	public String extractSuggestion()
	{
//		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
//		WebElement suggestion = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@role='listbox']//li[4]//span")));
		String str = wd.findElement(By.xpath("//ul[@role='listbox']//li[4]//span")).getText();
//		String str = suggestion.getText();
		return str;
	}
	
	public List<String> fetchSuggestion()
	{
        List <WebElement> list = (List<WebElement>) wd.findElements(By.xpath("//li[@data-view-type='1']"));
		
		List<String> l1 = new ArrayList<String>();
		
		for(int i=0;i<=list.size()-1;i++) {
			String val= list.get(i).getText();
			l1.add(val);
		}
		
		return l1;
	}
	
}