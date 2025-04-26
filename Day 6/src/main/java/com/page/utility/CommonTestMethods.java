package com.page.utility;

import java.io.File;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class CommonTestMethods {
    
    WebDriver wd;
    
    public void initCTM(WebDriver wd) {
        this.wd = wd;
    }
    
    public void launchWeb() {
        wd = new EdgeDriver();
    }
    
    public void maximizeWindow() {
        if (wd != null) {
            wd.manage().window().maximize();
        }
    }
    
    public void useImplicitWait(int timeInSeconds) {
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
    }
    
    public void takeScreenshot(String fileName, String directoryPath) throws IOException {
        if (wd != null) {
            File srcFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
            Files.copy(srcFile, new File(directoryPath + "/" + fileName + ".png"));
        }
    }
    
    public void scrollDown(int scrollValue) {
        ((JavascriptExecutor) wd).executeScript("scroll(0, " + scrollValue + ")");
    }
    
    public void navigateBack() {
        wd.navigate().back();
    }
    
    public void navigateForward() {
        wd.navigate().forward();
    }
    
    public void reloadPage() {
        wd.navigate().refresh();
    }
    
    public void close() {
        if (wd != null) {
            wd.close();
        }
    }
}

//package com.page.utility;
//
//import java.io.File;
//import java.io.IOException;
//import java.time.Duration;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import com.google.common.io.Files;
//
//public class CommonTestMethods {
//    
//    private WebDriver wd;
//
//    public void initCTM(WebDriver wd) {
//        this.wd = wd;
//    }
//
//    public void launchWeb() {
//        wd = new EdgeDriver();
//    }
//
//    public void maximizeWindow() {
//        wd.manage().window().maximize();
//    }
//
//    public void useImplicitWait(int timeInSeconds) {
//        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
//    }
//
//    public void takeScreenshot(String fileName, String screenDir) throws IOException {
//        File srcFile = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);
//        Files.copy(srcFile, new File(screenDir + "/" + fileName + ".png"));
//    }
//
//    public void scrollDown(int scrollValue) {
//        ((JavascriptExecutor) wd).executeScript("window.scrollBy(0, " + scrollValue + ");");
//    }
//
//    public void navigateBack() {
//        wd.navigate().back();
//    }
//
//    public void navigateForward() {
//        wd.navigate().forward();
//    }
//
//    public void reloadPage() {
//        wd.navigate().refresh();
//    }
//
//    public void closeBrowser() {
//        wd.close();
//    }
//}
