package AmazonDropdownTest;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.amazon.dropdowntesting.AmazonDropDown;

public class DropDownTest {
	
	WebDriver wd;
	
	AmazonDropDown adt = new AmazonDropDown();
	
	
  @Test(priority = 1)
  public void selectThridOpt() throws InterruptedException {
	  adt.init(wd);
	  adt.invokeApp();
	  adt.selectAnOpt();
	  List <WebElement> listdata = adt.selectOpt();
	  
	  for(int i =1; i<=listdata.size()-1; i++)
	  {
		  String res = listdata.get(i).getText();
		  System.out.println(res);
	  }
  }
  
	@Test(priority = 2)
	public void linksCount() {
		int count = adt.linksCount();
		System.out.println("No. of images : " + count);
	}
}
