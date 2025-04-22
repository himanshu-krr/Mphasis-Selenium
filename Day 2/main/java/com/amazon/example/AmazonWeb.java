package com.amazon.example;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
		String pincode =  printdata.split(" ")[3];
		return pincode;
	}
	
	public List<String> fetchSuggestion()
	{
        List <WebElement> list = (List<WebElement>) wd.findElements(By.xpath("/html/body/div[1]/header/div/div[2]/div/div[2]/div[1]/div[1]/div"));
		
		List<String> l1 = new ArrayList<String>();
		
		for(int i=0;i<=list.size()-1;i++) {
			String val= list.get(i).getText();
			l1.add(val);
		}
		
		return l1;
	}
	
}
