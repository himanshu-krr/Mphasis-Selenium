package ScreenshotTest;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import SampleLibrary.ScreenShot;

public class ScreenshotTest {
	
	WebDriver wd;
	ScreenShot s = new ScreenShot();
	
	@Test(priority = 1)
	public void launchWeb()
	{
		s.launchWeb();
	}
	
  @Test(priority = 2)
  public void takesScreenshot() throws IOException {
	  s.performScrollDownJs(5000);
	  s.captureScreenshot("img2", "Screenshots");
  }
  
//  @Test(priority = 3)
//  public void performScrollDown()
//  {
////	  s.performScrollDownJs();
//	  s.performScrollDownJs(5000);
//  }

}
