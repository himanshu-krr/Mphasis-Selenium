//package googleWebTest;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.testng.annotations.Test;
//
//import googleWeb.googleWeb;
//
//public class googleWebTest {
//	
//	WebDriver wd = new EdgeDriver();
//	googleWeb gw = new googleWeb(wd);
//  @Test
//  public void launchWeb() {
//	  
//	  wd.get("https://www.google.com/");
//  }
//}

package googleWebTest; 
import org.openqa.selenium.WebDriver; 

import org.openqa.selenium.edge.EdgeDriver; 
import org.testng.annotations.Test; 
import googleWeb.googleWeb; 

public class googleWebTest 
{ 
	WebDriver wd = new EdgeDriver(); 
	googleWeb gw = new googleWeb(wd); 
	@Test public void launchWeb() 
	{ 
		gw.launchWeb(); 
	} 
}