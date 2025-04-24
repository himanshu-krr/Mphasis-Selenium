package BookmyShowTest;

import org.testng.annotations.Test;

import com.bookmyshow.example.BookmyShow;

import Bookmyshow.BookMyShow;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class BookmyShowTest {
	
	static WebDriver wd;
	static BookmyShow b = new BookmyShow();
	
  @Test
  public void f() throws InterruptedException {
//	  b.listofcities();
//	  b.send_loca("Darbhanga");
	  String[] a = b.extract_movienames();
//	  assertEquals("40",a);
//	  System.out.println(a[0]);
	  for(int i = 0; i<a.length;i++) {
		  System.out.println(a[i]);
	  }
//	  Assert.ass
  }
  @BeforeClass
  public void beforeClass() {
	  wd = new EdgeDriver();
	  b.init(wd);
  }

  @AfterClass
  public void afterClass() {
  }

}