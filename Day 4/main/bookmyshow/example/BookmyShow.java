package com.bookmyshow.example;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookmyShow {
	
	WebDriver wd ;
	
	public void init(WebDriver wd) {
		this.wd = wd;
//		?languages=tamil
		wd.get("https://in.bookmyshow.com/explore/movies-chennai");
	}
	
	public void listofcities(){
		
		List<WebElement> l = wd.findElements(By.xpath("//li[@class='bwc__sc-ttnkwg-18 dQvLjK']"));
		
		List<String> l1 = new ArrayList<String>();
		
		for(WebElement i : l) {
			l1.add(i.getText());
		}
		
		System.out.println(l1.toString());
	}
	
	public void send_loca(String s) {
		
		WebDriverWait w = new WebDriverWait(wd, Duration.ofSeconds(10));
		
				
		wd.findElement(By.xpath("//input[@type='text']")).sendKeys(s);
		
		WebElement city = w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='bwc__sc-ttnkwg-14 cXklvo']")));
		city.click();
		
		
	}
	
	public String[] extract_movienames() throws InterruptedException {
		
//		wd.findElement(By.xpath("//a[@href='/explore/movies-chennai']")).click();
//		WebDriverWait w = new WebDriverWait(wd, Duration.ofSeconds(100));
//		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sc-dv5ht7-0 hexaHF']")));
//		Thread.sleep(40000);
		
		List<WebElement> l = wd.findElements(By.xpath("//div[@class='sc-dv5ht7-0 hexaHF']"));
		
		List<String> l1 = new ArrayList<String>();
		
		for(WebElement i:l) {
			l1.add(i.getText());
		}
		
		String[] arr = new String[l1.size()];
		int c=0;
		for(String i:l1) {
			arr[c++]=i;
		}
		
		return arr;
		
	}
	
}
