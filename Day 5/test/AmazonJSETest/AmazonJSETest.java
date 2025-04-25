package AmazonJSETest;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.amazonjavascript.example.AmazonJavaScript;


public class AmazonJSETest {
		
	  AmazonJavaScript aj = new AmazonJavaScript();
	  
	  @Test(priority = 1)
	  public void launchWeb() {
		  aj.launchWeb();
		  Reporter.log("Test Completed");
	  }
	  
	  @Test(priority = 2)
	  public void demo() throws InterruptedException
	  {
		  aj.demo();
	  }
	  
}
