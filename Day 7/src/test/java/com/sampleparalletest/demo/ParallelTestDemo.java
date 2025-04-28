package com.sampleparalletest.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTestDemo {
//  WebDriver wd;
  @Test
  public void function_1() {
	  WebDriver wd = new FirefoxDriver();
	  wd.get("https://www.google.com");
	  System.out.println(Thread.currentThread().getId());
  }
  
  @Test
  public void function_2()
  {
	  WebDriver wd = new ChromeDriver();
	  wd.get("https://www.google.com");
	  System.out.println(Thread.currentThread().getId());
  }
}
