package GoogleSuggestionTest;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.googleSuggestion.example.GoogleSuggestion;

public class GoogleSuggestionTest {
	
	WebDriver wd;
	GoogleSuggestion gs = new GoogleSuggestion();

//	@Test
//	public void launchWeb() {
//		gs.launchWeb();
//	}
	
//	@Test
//	public void inputText() throws InterruptedException
//	{
//		gs.launchWeb();
//		gs.clickOnInputArea("book");
//		Thread.sleep(3000);
//		String text = gs.extractSuggestion();
//		System.out.println(text);
//	}
	
	@Test
	public void inputText() throws InterruptedException
	{
		gs.launchWeb();
		gs.clickOnInputArea("book");
		Thread.sleep(3000);
		List<String> text = gs.fetchSuggestion();
		System.out.println(text);
	}

}