package TestBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import POMclass.loginfunctionality;

public class testbaseloginflipcart 
{
	WebDriver driver;
	@Parameters("browserName")
	@BeforeMethod
	public void setUP(String browserName)
	{
	if(browserName.equals("chrome"))
	{
     System.setProperty("Webdriver.chrome.driver","C:\\Chrome\\chromedriver.exe\\");
     driver= new ChromeDriver();
     System.out.println("browser is open");
	}
	else
	{
		System.setProperty("Webdriver.gecko.driver","C:\\Chrome\\geckodriver.exe");
	     driver= new FirefoxDriver();
	     System.out.println("browser is open");
	}
     driver.manage().window().maximize();
     System.out.println("browser is maximised");
			
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
     
     driver.get("https://www.flipkart.com/");
     System.out.println("url is open");
     
     loginfunctionality x=new loginfunctionality(driver);
       x.login();
       x.username();
       x.password();
       x.clickonlogin();
    
     
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("browser is closed");
		System.out.println("end of program");
	}
}

