package AutomationExcerciseTest;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.automationexercise.example.AutomationExercise;

public class AutomationExerciseTest {
	
	WebDriver wd;
	AutomationExercise ae = new AutomationExercise();

//	@Test
//	public void launchAutomation() {
//		ae.launchWeb();
//		
//	}
	
//	@Test
//	public void validateCartName()
//	{
//		ae.launchWeb();
//		String text = ae.validateCartName();
//		System.out.println(text);
//		assertEquals("Cart", text);
//	}
	
	@Test
	public void goTOLogiNAndEnterDetails()
	{
		ae.launchWeb();
		ae.goTOLogiNAndEnterDetails("himanshu@gmail.com","1234");
		ae.cilckOnLogIn();
		String text = ae.validateLogIn();
//		System.out.println(text);
		assertEquals("Your email or password is incorrect!",text);
	}

}
