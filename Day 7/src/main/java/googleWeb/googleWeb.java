//package googleWeb;
//
//import org.openqa.selenium.WebDriver;
//
//public class googleWeb {
//	
//	WebDriver wd;
//	
//	public googleWeb(WebDriver wd)
//	{
//		this.wd = wd;
//	}
//
//}

package googleWeb; 
import org.openqa.selenium.WebDriver; 

public class googleWeb { 
	WebDriver wd; 
	
	public googleWeb(WebDriver wd) 
	{ 
		this.wd = wd; 
	} 
	
	public void launchWeb() 
	{ 
		wd.get("https://www.google.com/"); 
	} 
}