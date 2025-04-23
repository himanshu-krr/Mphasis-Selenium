package W3SchoolTableTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.w3school.table.W3SchoolTable;

public class W3SchoolTableTest {
	
	WebDriver wd;
	W3SchoolTable wst = new W3SchoolTable();
	
  @Test(priority = 1)
  public void launchWeb() {
	  wst.launchApp();
  }
  
//  @Test(priority = 2)
//  public void selectDataFromTable()
//  {
//	  WebElement ele = wst.selectDataFromTable();
//	  String text = ele.getText();
//	  System.out.println(text);
//  }
  
  @Test(priority = 2)
  public void getTable()
  {
	  wst.getTable();
  }
}
