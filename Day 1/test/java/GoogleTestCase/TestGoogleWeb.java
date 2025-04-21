package GoogleTestCase;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import com.google.example.GoogleWeb;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestGoogleWeb {

    GoogleWeb gw = new GoogleWeb();

    @Before
    public void setUp() {
        gw.launchGoogleApp(); // Ensure the WebDriver is initialized before each test
    }

    @After
    public void setDown() {
        gw.closeBrowser();
    }

    @Test
    public void LaunchTest() {
        gw.launchGoogleApp(); // This initializes the WebDriver
        assertNotNull(gw.wd); // Assert that WebDriver is not null
    }

    @Test
    public void TitleTest() {
        String title = gw.getTitle("");
        System.out.println("Page title is: " + title);
        assertEquals("Google", title); // Assert page title matches
    }

    @Test
    public void SourceTest() {
        String source = gw.getSource("");
        System.out.println("Page source is: " + source);
        assertNotNull(source); // Assert that the page source is not null
    }

    @Test
    public void clickGoogleImageTest() {
        // Test the clickGoogleImage method
        gw.clickGoogleImage();
        System.out.println("Clicked on Google image.");
        // Optionally add assertions to verify the navigation behavior
    }

    @Test
    public void clickGmailTest() {
        String url = gw.clickGmail();
        System.out.println("Clicked on Gmail");
        assertEquals("https://workspace.google.com/intl/en-US/gmail/", url); // Assert Gmail URL matches expected value
    }
    
    @Test
    public void getUrl()
    {
    	String source = gw.getUrl("");
    	System.out.println("Current Url is : " + source);
    }

    @Test
    public void navigateBackToHomeTest() throws InterruptedException {
        gw.navigateBackToHome(); // Navigate back to home after clicking the image
        System.out.println("Navigated back to the home page.");

        String currentUrl = gw.wd.getCurrentUrl();
        assertEquals("https://www.google.com/", currentUrl); // Assert that the current URL is Google's home page
    }
    
    @Test
    public void navigateForwardToImage()throws InterruptedException
    {
    	gw.navigateForwardToImages();
        System.out.println("Navigated Forward to the image page.");
        Thread.sleep(5000);
        String currentUrl = gw.wd.getCurrentUrl();
        assertEquals("https://www.google.com/imghp?hl=en&tab=ri&ogbl", currentUrl);
        Thread.sleep(3000);
    }
    
    @Test
    public void maximizeWindow() throws InterruptedException
    {
    	gw.maximizeWindow();
    	Thread.sleep(4000);
    }
}
