package AmazonTestCase;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.example.AmazonWeb;

public class TestAmazonWeb {
	
	WebDriver wd1;
	// Object for Library Class
	AmazonWeb at = new AmazonWeb();
	
	@Before
	public void presetup() throws IOException
	{
		at.init_AmazonWeb(wd1);
//		at.launchAmazonApp();
	}
	
	@Test
	public void LaunchAmazon() throws IOException {
		at.launchAmazonApp();
	}
	
	@Test
	public void enterTheDetailToSearch() throws IOException
	{
		at.launchAmazonApp();
		at.enterInputSearchString("C with Datastructure book");
		at.clickToSearch();
	}
	
	@Test
	public void clickToSearch()
	{
		at.clickToSearch();
	}
	
	@Test
	public void validatePinCode()
	{
		String pincode = at.validateFindLocation();
		System.out.println("Pincode is : " + pincode);
	}

}
