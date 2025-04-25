package JavaScriptExcutorTest;

import org.testng.annotations.Test;

import com.javascriptexecutor.example.JavaScriptExecutor;

public class JavaScriptExcutorTest {
	
	JavaScriptExecutor je = new JavaScriptExecutor();
  @Test(priority = 1)
  public void launchWeb() {
	  je.launchWeb();
  }
  
  @Test(priority = 2)
  public void demo() throws InterruptedException
  {
	  je.demo();
  }
  
}
