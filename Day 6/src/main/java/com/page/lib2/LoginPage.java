package com.page.lib2;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
public class LoginPage {
    
    WebDriver wd;

    By makeAppointmentButton = By.xpath("//a[@id='btn-make-appointment']");
    By usernameField = By.id("txt-username");
    By passwordField = By.id("txt-password");
    By loginButton = By.id("btn-login");
    
    By login = By.xpath("//h2[contains(text(),'Login')]");

    public LoginPage(WebDriver wd) {
        this.wd = wd;
    }

    public void performLogin(String username, String password) {
        wd.findElement(makeAppointmentButton).click();
        wd.findElement(usernameField).sendKeys(username);
        wd.findElement(passwordField).sendKeys(password);
        wd.findElement(loginButton).click();
        String exptTxt = "Login";
        String actTxt = wd.findElement(login).getText();
        
        Assert.assertEquals(actTxt, exptTxt, "Text verification failed!");
    }
}

//