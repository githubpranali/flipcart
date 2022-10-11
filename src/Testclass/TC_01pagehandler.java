package Testclass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import POMclass.pagehandler;
import utility_class.classflipcartutility;

public class TC_01pagehandler
{
@Test
public void windowhandling()
{
	System.setProperty("webdriver.chrome.driver","C:\\Chrome\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	pagehandler x= new pagehandler(driver);
	x.cross();
	x.searchbox();
	x.searchkey();
	x.apple();
	classflipcartutility.swichtowindow(driver);

	driver.quit();
	System.out.println("end of program");
}
}
