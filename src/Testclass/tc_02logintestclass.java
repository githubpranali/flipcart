package Testclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POMclass.loginfunctionality;


public class tc_02logintestclass
{    
	WebDriver driver;
	@Test
	public void validation()
	{
	 String expectedurl="https://www.flipkart.com/";
     String actualurl=driver.getCurrentUrl();
     Assert.assertEquals(expectedurl, actualurl);
    }
}
	
