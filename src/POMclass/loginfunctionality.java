
package POMclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginfunctionality 
{
WebDriver driver;

@FindBy(xpath="//a[@class='_1_3w1N']")
WebElement loginbutton;
public void login()
{
	loginbutton.click();
}
//---------------------------
@FindBy(xpath="//input[@class='_2IX_2- VJZDxU']")
WebElement username;
public void username()
{
	username.sendKeys("9464576432");
}
//--------------------------------------------
@FindBy(xpath="//input[@type='password']")
WebElement password;
public void password()
{
	password.sendKeys("rekha@5866");
}
//------------------------------------------
@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
WebElement login;
public void clickonlogin()
{
	login.click();
}
//-----------------------------------------------
public loginfunctionality(WebDriver driver)
{
	this.driver=driver;
	PageFactory.initElements(driver,this);
}
}
