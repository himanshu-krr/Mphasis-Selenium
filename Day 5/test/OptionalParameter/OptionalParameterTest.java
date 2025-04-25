package OptionalParameter;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class OptionalParameterTest {
  @Test
  public void setup(@Optional("This is useful for test methods to handle param")String param) {
	  System.out.println(param.concat("test optional"));
  }
  
  @Test
  public void testMethod()
  {
	  System.out.println("Test is running");
  }
  
}
