package com.page.lib1;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import com.page.utility.CommonTestMethods;

public class HomePage {
    
    public WebDriver wd;
    CommonTestMethods ctm = new CommonTestMethods();
    String filePath = "./ConfigFile/data.properties";
    FileReader fr;
    Properties p;
    
    
    // By is a type of Class which is used to store web element 
    By wecareTxt = By.xpath("//h3[contains(text(),'We Care About Your Health')]");
    //This XPath expression finds an <h3> tag that contains the text "We Care About Your Health".

    public void initHomePage(WebDriver wd) {
        this.wd = wd;
        ctm.initCTM(wd);
    }

    public String launchWeb() throws IOException {
        wd = new EdgeDriver();
        ctm.initCTM(wd);
        fr = new FileReader(filePath);
        p = new Properties();
        p.load(fr);
        wd.get(p.getProperty("BaseURL"));
        
        return wd.findElement(wecareTxt).getText();
    }
}

//package com.page.lib1;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Properties;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.support.ui.Select;
//import com.page.utility.CommonTestMethods;
//
//public class HomePage {
//
//    // Step 1 -> Declare WebDriver
//    private WebDriver wd;
//    private CommonTestMethods ctm = new CommonTestMethods();
//    private String filePath = "./ConfigFile/data.properties";
//    private Properties p;
//
//    // Step 2 -> Define Locators
//    private By wecareTxt = By.xpath("//h3[contains(text(),'We Care About Your Health')]");
//    private By makeAppointmentButton = By.xpath("//a[@id='btn-make-appointment']");
//    private By makeAppointmentText = By.xpath("//h2[contains(text(),'Make Appointment')]");
//    private By facilitySelect = By.xpath("//*[@id='combo_facility']");
//
//    // Step 3 -> Init method
//    public void initHomePage(WebDriver wd) {
//        this.wd = wd;
//        ctm.initCTM(wd);
//    }
//
//    // Step 4 -> Define test methods
//    public String launchWeb() throws IOException {
//        wd = new EdgeDriver();
//        String expectedTextHome = "We Care About Your Health";
//
//        try (FileReader fr = new FileReader(filePath)) {
//            p = new Properties();
//            p.load(fr);
//        }
//
//        wd.get(p.getProperty("BaseURL"));
//        String actualTextHome = wd.findElement(wecareTxt).getText();
//        return actualTextHome;
//    }
//
//    public void performLogin(String username, String password) {
//        wd.findElement(makeAppointmentButton).click();
//        wd.findElement(By.id("txt-username")).sendKeys(username);
//        wd.findElement(By.id("txt-password")).sendKeys(password);
//        wd.findElement(By.id("btn-login")).click();
//    }
//
//    public void bookAppointment(String date, String comment) throws InterruptedException {
//        WebElement facilityDropdown = wd.findElement(facilitySelect);
//        Thread.sleep(1000);
//        
//        Select facilitySelect = new Select(facilityDropdown);
//        facilitySelect.selectByIndex(2);
//
//        wd.findElement(By.id("chk_hospotal_readmission")).click();
//        Thread.sleep(1000);
//
//        wd.findElement(By.id("radio_program_medicare")).click();
//        Thread.sleep(1000);
//
//        wd.findElement(By.id("txt_visit_date")).sendKeys(date);
//        Thread.sleep(1000);
//
//        wd.findElement(By.id("txt_comment")).sendKeys(comment);
//        Thread.sleep(1000);
//
//        wd.findElement(By.id("btn-book-appointment")).click();
//        Thread.sleep(1000);
//    }
//}
//
