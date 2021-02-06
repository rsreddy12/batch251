package gluecode;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

import pages.HomePage;

public class StepDef1 
{
	public HomePage hp;
	public RemoteWebDriver driver;
	public Shared sh;
	public Scenario sc;
		
	public StepDef1(Shared sh)
	{
		this.sh=sh;
	}
	@Before()
	public void m1()
	{
		//System.out.println("Before in stepdefclass1");
	}
	@Given("launch google site with {string}")
	public void method1(String x) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		sh.driver=new ChromeDriver();
		sh.driver.get(x);
		Thread.sleep(5000);
		hp=new HomePage(sh.driver);
	}
	@When("validate title as {word}")
	public void method2(String y)
	{
		hp=new HomePage(sh.driver);
		String title=hp.getTitleOfSite();
		if (title.equalsIgnoreCase(y))
		{
			sh.sc.log(title+" title test passed");
			Assert.assertTrue(true);
		}
		else
		{
			sh.sc.log(title+" title test failed");
			Assert.assertTrue(false);
		}
	}
	@Then("close site")
	public void method3()
	{
		hp.closeSite();
	}
	@After
	public void m2()
	{
		//System.out.println("After in stepdefclass1");
		
	}
}