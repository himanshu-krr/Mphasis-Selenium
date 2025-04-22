package com.google.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class GoogleWeb {
    
    public WebDriver wd;
    
    public void init_launchGoogleApp(WebDriver wd) {
        this.wd = wd;
    }
    
    public void launchGoogleApp() {
        wd = new ChromeDriver();
        wd.get("https://www.google.com");
    }
    
    public String getTitle(String Title) {
        Title = wd.getTitle();
        return Title;
    }
    
    public String getSource(String Source) {
        Source = wd.getPageSource();
        return Source;
    }
    
    // Method to click on the Google image element using XPath
    public void clickGoogleImage() {
        WebElement imageElement = wd.findElement(By.xpath("(//a[@class='gb_X'])[2]"));
        imageElement.click();
    }
    
    public String clickGmail()
    {
    	WebElement gmailElement = wd.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[1]/a"));
    	gmailElement.click();
    	return wd.getCurrentUrl();
    }
    
    public String getUrl(String source)
    {
    	source = wd.getCurrentUrl();
    	return source;
    }
    
    public void navigateBackToHome() throws InterruptedException { 
        WebElement imageElement = wd.findElement(By.xpath("(//a[@class='gb_X'])[2]"));
        imageElement.click();
        Thread.sleep(3000);
        wd.navigate().back(); // Navigate back to the previous page
    }
    
    public void navigateForwardToImages() throws InterruptedException
    {
    	WebElement imageElement = wd.findElement(By.xpath("(//a[@class='gb_X'])[2]"));
        imageElement.click();
        Thread.sleep(3000);
        wd.navigate().back(); // Navigate back to the previous page
        Thread.sleep(3000);
        wd.navigate().forward();
    }
    
    public void maximizeWindow()
    {
    	wd = new ChromeDriver();
        wd.get("https://www.google.com");
        wd.manage().window().maximize();
    }
    
    // Close the browser
    public void closeBrowser() {
        if (wd != null) {
            wd.quit(); // Properly close the WebDriver
        }
    }
    
}
