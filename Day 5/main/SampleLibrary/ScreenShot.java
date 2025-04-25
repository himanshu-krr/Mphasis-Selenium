package SampleLibrary;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

public class ScreenShot {
	
	WebDriver wd;
	
	public void initWeb(WebDriver wd)
	{
		this.wd = wd;

	}
	
	public void launchWeb()
	{
		wd = new EdgeDriver();
		wd.get("https://automationexercise.com/");
	}

	
	public void captureScreenshot(String fimg1, String screenDir) throws IOException
	{
		File src1 = ((TakesScreenshot) wd).getScreenshotAs(OutputType.FILE);//TakesScreenshot is an interface for automation of screenshot. Outputtype is used to store a file
		Files.copy(src1, new File(screenDir+"/"+fimg1+".png"));//Filepath
	}
	
	public void performScrollDownJs(int scrollValue)
	{
		((JavascriptExecutor) wd).executeScript("scroll(0, " + scrollValue + ")");
	}

}
