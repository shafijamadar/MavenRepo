package com.Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumUtils {

	private WebDriver driver;
	
	public String baseurl="http://southseasgaming.microgaming.com/Web/App/CasinoTournaments/";
	
	public WebDriver OpenBrowser(String browsername){
		if(browsername.equalsIgnoreCase("firefox"))
		{
		driver= new FirefoxDriver();	
		}
		else if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "Server/chromedriver.exe");
			System.out.println("Currently Browser not supported");
		}
		else if(browsername.equalsIgnoreCase("internetexplore"))
		{
			System.setProperty("Webdriver.ie.driver", "Server/IEDriver.exe");
			driver=new InternetExplorerDriver();
		}
		driver.get(baseurl);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public void closeBrowser(){
		if(driver!=null)
		{
		driver.quit();
		}
	}
}