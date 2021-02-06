package pages;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//Properties for locating elements
	RemoteWebDriver driver;
		
	public HomePage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this); //mandatory
	}
	
	//Operational methods to operate and observe elements
	public String getTitleOfSite()
	{
		return(driver.getTitle());
	}
	
	public void closeSite()
	{
		driver.close();
	}
}
	