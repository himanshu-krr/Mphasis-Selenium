package com.alertpopup.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class AlertPopup {
	
	WebDriver wd ;
	
	public void init(WebDriver wd) {
		this.wd = wd;
		wd.get("https://mail.rediff.com/cgi-bin/login.cgi");
	}
	
	public void alert() throws InterruptedException {
		
		wd.findElement(By.xpath("//input[@id='login1']")).sendKeys("testdata");
		wd.findElement(By.name("proceed")).click();
		Alert a = wd.switchTo().alert();
		
//		String messagealert = a.getText();
		
//		System.out.println(messagealert);
		
		Thread.sleep(2000);
		a.accept();
		Thread.sleep(2000);
		wd.findElement(By.name("passwd")).sendKeys("psw456");
		
	}
	
	public void close() {
		if(wd!=null) {
			wd.quit();
		}
	}
	
}

// BSDK FOCUS ON CAREER
