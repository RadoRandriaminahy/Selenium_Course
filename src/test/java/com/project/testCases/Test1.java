package com.project.testCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;

public class Test1 {
	
  public static WebDriver driver;
  
  @Test
  public void test_1() {
	  System.out.println("this is Test 1.");
  }
  
  @Test
  public void test_2() {
	  System.out.println("this is Test 2.");
  }
  
  @BeforeSuite
  public void setup() {
	  
	  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/Drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  
      driver.get("https://google.fr");
      driver.manage().window().maximize();
      
      WebElement btnaccept =  driver.findElement(By.xpath("//*[@id=\"L2AGLb\"]"));
      
      btnaccept.click();   
  }

  @AfterSuite
  public void teardown() {
	  
	  System.out.println("Test teardown if ok.");
      driver.quit();
  }

}
