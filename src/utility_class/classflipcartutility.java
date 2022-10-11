package utility_class;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
public class classflipcartutility 
{
	public static void swichtowindow(WebDriver driver)
	{
	 List<String>address=new ArrayList<String>(driver.getWindowHandles());
	 driver.switchTo().window(address.get(1));
	 
	 
	}
}