package com.scripts.herokuapp;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.page.lib1.HomePage;
import com.page.lib2.LoginPage;
import com.page.lib3.BookAppointmentPage;
import com.page.utility.CommonTestMethods;

public class HerokuappTest {

    WebDriver wd;
    HomePage hp = new HomePage();
    LoginPage lp;
    BookAppointmentPage bp;
    CommonTestMethods ctm = new CommonTestMethods();

    @Test(priority = 1)
    public void invokeApp() throws IOException, InterruptedException {
        String expectedTextHome = "We Care About Your Health";
        hp.initHomePage(wd);
        String actualTextHome = hp.launchWeb();
        Assert.assertEquals(actualTextHome, expectedTextHome, "Text verification failed!");
        lp = new LoginPage(hp.wd);  // Initialize LoginPage with WebDriver instance
        bp = new BookAppointmentPage(hp.wd); // Initialize BookAppointmentPage with WebDriver instance
    }

    @Test(priority = 2)
    public void performLogin() {
        lp.performLogin("John Doe", "ThisIsNotAPassword");
    }

    @Test(priority = 3)
    public void bookAppointment() throws InterruptedException {
        bp.bookAppointment("26/04/2025", "I am having fever since two days");
    }

    @Test(priority = 4)
    public void maximizeAndTakeScreenshot() throws IOException {
        ctm.initCTM(hp.wd);
        ctm.maximizeWindow();
        ctm.takeScreenshot("appointment_confirmation", "./screenshots");
    }
}


//package com.scripts.herokuapp;
//
//import java.io.IOException;
//import org.openqa.selenium.WebDriver;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//import com.page.lib1.HomePage;
//import com.page.utility.CommonTestMethods;
//
//public class HerokuappTest {
//
//    private HomePage hp = new HomePage();
//    private WebDriver wd;
//    private CommonTestMethods ctm = new CommonTestMethods();
//
//    @Test(priority = 1)
//    public void invokeApp() throws IOException, InterruptedException {
//        String expectedTestHome = "We Care About Your Health";
//        hp.initHomePage(wd);
//        String actualTestHome = hp.launchWeb();
//        Assert.assertEquals(actualTestHome, expectedTestHome, "Both must be the same");
//    }
//
//    @Test(priority = 2)
//    public void performLogin() {
//        hp.performLogin("John Doe", "ThisIsNotAPassword");
//    }
//
//    @Test(priority = 3)
//    public void bookAppointment() throws InterruptedException {
//        hp.bookAppointment("26/04/2025", "I am having fever since two days");
//    }
//
//    @Test(priority = 4)
//    public void maximizeWindow() {
//        ctm.maximizeWindow();
//    }
//}
