package gluecode;

import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Shared 
{
	public RemoteWebDriver driver;
	public Scenario sc;
	@Before()
	public void beforemethod(Scenario sc)
	{
		driver=null;
		this.sc=sc;
		//System.out.println("This is shared class before method");
	}
	@After
	public void aftermethod(Scenario sc)
	{
		sc.log(sc.getName()+" "+ sc.getStatus().name());
		//System.out.println("This is shared class after method");
	}
}
