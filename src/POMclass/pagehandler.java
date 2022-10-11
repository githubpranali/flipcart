package POMclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagehandler 
{
     WebDriver driver;    //cross
	@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']")
	 WebElement cross;
	public void cross()
	{
		cross.click();
	}
//	 --------------------------------------------------------
	          //serachbox click
	 @FindBy(xpath="//input[@class='_3704LK']")
	 WebElement searchbox;
	 public void searchbox()
	 {
		 searchbox.sendKeys("apple");
	 }
//------------------------------------------------------------------
	      //searchkey click
	@FindBy(xpath="//button[@class='L0Z3Pu']")
	WebElement searchkey;
	public void searchkey()
	{
	searchkey.click();	
	}
//------------------------------------------------------------	
	         //apple
	 @FindBy(xpath="(//div[@class='_4rR01T'])[7]")
	 WebElement apple;
	 public void apple()
	 {
		 apple.click();
	 }
//---------------------------------------------------------	
//	 @FindBy(xpath="//button[@class='_2KpZ6l _2uS5ZX _2Dfasx']")
//	 WebElement notifyme;
//	 public void notifyme()
//	 {
//		 notifyme.click();
//	 }
//-----------------------------------------------------------	 
	 public pagehandler(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver,this);
	 }
}
