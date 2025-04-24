package BigBasketTest;

import org.testng.annotations.Test;

import com.bigbasket.example.BigBasket;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
 
 
public class BigBasketTest {
	BigBasket obj = new BigBasket();
	WebDriver wd;
  @BeforeClass
  public void before() {
	  wd = new EdgeDriver();
	  obj.initWebDriver(wd);
  }
  @Test
  public void f() throws InterruptedException {
	  obj.launchBrowser();
	  obj.clickOnFilter();
  }
}