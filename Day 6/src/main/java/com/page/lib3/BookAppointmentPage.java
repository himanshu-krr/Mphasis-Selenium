package com.page.lib3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class BookAppointmentPage {
    
    WebDriver wd;

    By facilitySelect = By.xpath("//select[@id='combo_facility']");
    By hospitalReadmissionCheckbox = By.id("chk_hospotal_readmission");
    By healthProgramRadio = By.id("radio_program_medicare");
    By dateField = By.id("txt_visit_date");
    By commentField = By.id("txt_comment");
    By bookAppointmentButton = By.id("btn-book-appointment");
    
    By checkApt = By.xpath("//h2[contains(text(),'Make Appointment')]");
    
    public BookAppointmentPage(WebDriver wd) {
        this.wd = wd;
    }

    public void bookAppointment(String date, String comment) throws InterruptedException {
        WebElement facilityDropdown = wd.findElement(facilitySelect);
        Thread.sleep(1000);
        Select select = new Select(facilityDropdown);
        select.selectByIndex(2);
        wd.findElement(hospitalReadmissionCheckbox).click();
        Thread.sleep(1000);
        wd.findElement(healthProgramRadio).click();
        Thread.sleep(1000);
        wd.findElement(dateField).sendKeys(date);
        Thread.sleep(1000);
        wd.findElement(commentField).sendKeys(comment);
        Thread.sleep(1000);
        wd.findElement(bookAppointmentButton).click();
        Thread.sleep(1000);
        
        String exptTxt = "Make Appointment";
        String actTxt = wd.findElement(checkApt).getText();
        
        Assert.assertEquals(actTxt, exptTxt, "Text verification failed!");
    }
}
