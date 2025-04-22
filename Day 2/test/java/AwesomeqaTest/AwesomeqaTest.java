package AwesomeqaTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.awesomeqa.example.AwesomeqaWeb;

public class AwesomeqaTest {
	
	WebDriver wd;
	AwesomeqaWeb aq = new AwesomeqaWeb();

	@Test(priority = 1)
	public void launchWeb() {
		aq.launchWeb();
	}
	
//	@Test(priority = 2)
//	public void clickYes()
//	{
//		aq.clickYes();
//	}
	
	@Test(priority = 2)
	public void enterUsername()
	{
		aq.enterUserName("himanshu@gmail.com");
	}
	
	@Test(priority = 3)
	public void enterPassword()
	{
		aq.enterPassword("1234");
	}
	@Test(priority = 4)
	public void clickRegister()
	{
		aq.clickRegister();
	}
	
	@Test(priority = 5)
	public void clickForgotPswrd()
	{
		aq.clickForgtPswrd();
	}
	@Test(priority = 6)
	public void linksCount() {
		int count = aq.linksCount();
		System.out.println("No. of links : " + count);
	}
	
}
