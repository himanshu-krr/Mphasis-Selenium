package AmazonTest;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.amazon.example.AmazonWeb;

public class AmazonTest {
	
	WebDriver wd;
	AmazonWeb at = new AmazonWeb();
	
  @Test(priority = 1)
  public void launchWeb() throws IOException {
	  at.launchAmazonApp();
  }
  @Test(priority = 2)
  public void enterInput()
  {
	  at.enterInputSearchString("Datastructure");
  }
  @Test(priority = 3)
  public void fetchSuggestion() throws InterruptedException
  {
	  Thread.sleep(3000);
	  List<String> text = at.fetchSuggestion();
	  System.out.println(text);
	  String exp = "datastructures and algorithms made easy by narasimha karumanchi";
	  boolean val = text.contains(exp);
	  System.out.println(val);
  }
  
  
  
}
