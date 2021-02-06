package gluecode;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.HomePage;

public class StepDef2
{
	public HomePage hp;
	public RemoteWebDriver driver;
	public Shared sh;
	
	public StepDef2(Shared sh)
	{
		this.sh=sh;
	}
	
	@Given("launch gmail site with {string}")
	public void method4(String y) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		sh.driver=new ChromeDriver();
		sh.driver.get(y);
		Thread.sleep(5000);
	}
	
	@Given("get all the data from data table")
	public void getData(DataTable dt) 
	{
		List<List<String>> l=dt.asLists();
		for(int i=1;i<l.size();i++)
		{
			for(int j=0;j<l.get(i).size();j++)
			{
				System.out.println(l.get(i).get(j));
			}
		}
		System.out.println("*****************");
		List<Map<String,String>> m=dt.asMaps();
		for(int i=0;i<m.size();i++)
		{
			System.out.println(m.get(i).get("value"));
			System.out.println(m.get(i).get("status"));
			System.out.println(m.get(i).get("result"));
		}
	}
}