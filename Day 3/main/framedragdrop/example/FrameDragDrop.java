package com.framedragdrop.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
 
public class FrameDragDrop {
	
	WebDriver wd ;
	
	public void init(WebDriver wd) {
		this.wd = wd;
		wd.get("https://jqueryui.com/droppable/");
	}
	
	public void dropframe() throws InterruptedException {
		wd.switchTo().frame(0);
		
		WebElement we = wd.findElement(By.id("draggable"));
		WebElement we1 = wd.findElement(By.id("droppable"));
		
		Actions a = new Actions(wd);
		
		Thread.sleep(2000);
		
		a.dragAndDrop(we, we1).perform();
		
		wd.switchTo().parentFrame(); // After this, we can do Web Scrapping
		
		String s = wd.findElement(By.xpath("//a[@href='https://api.jqueryui.com/']")).getText();
		
		System.out.println(s);
		
	}
	
	public void close() {
		if(wd!=null) {
			wd.quit();
		}
	}
	
}
