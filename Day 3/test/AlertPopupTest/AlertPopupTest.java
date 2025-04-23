package AlertPopupTest;

import org.testng.annotations.Test;

import com.alertpopup.example.AlertPopup;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
 
public class AlertPopupTest {
	static WebDriver wd;
	static AlertPopup ap = new AlertPopup();
  @Test
  public void f() throws InterruptedException {
	  ap.alert();
  }
  @BeforeClass
  public void beforeClass() {
	  wd = new ChromeDriver();
	  ap.init(wd);
	  wd.manage().window().maximize();
  }
 
  @AfterClass
  public void afterClass() {
	  ap.close();
  }
 
}