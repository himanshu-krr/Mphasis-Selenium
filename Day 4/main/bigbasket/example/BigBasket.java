package com.bigbasket.example;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class BigBasket {
	WebDriver wd;
	public void initWebDriver(WebDriver wd) {
		this.wd = wd;
	}
	
	public void launchBrowser() {
		wd.get("https://www.bigbasket.com");
	}
	
	public void clickOnFilter() throws InterruptedException {
		wd.findElement(By.id("headlessui-menu-button-:R5bab6:")).click();
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href='/cl/fruits-vegetables/?nc=nb'])[2]"))).click();
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@pattern='outline'])[1]"))).click();
		Thread.sleep(10000);
//		show filter button
		wd.findElement(By.xpath("(//button[@pattern='outline'])[1]")).click();
//		add cart button
		wd.findElement(By.xpath("(//button[@pattern='outline'])[3]")).click();
	}
}