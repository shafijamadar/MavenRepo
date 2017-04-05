package testScripts;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Page.LandingScreen;
import com.Page.LoginPage;
import com.Utilities.SeleniumUtils;

public class loginTestAuthorisedUser {
	
	public WebDriver driver= null;
  
	@BeforeMethod
	public void setUp(){
		
		SeleniumUtils sel=new SeleniumUtils();
		driver=sel.OpenBrowser("firefox");
		
	}
	
	@Test
	public void validlogin() {
		LoginPage login=new LoginPage(driver);
		login.setuserName();
		login.setpassword();
		login.clickSignin();
		
		Assert.assertEquals(driver.getTitle(), "Casino Tournaments");  
		
		LandingScreen landing = new LandingScreen(driver);
				
		landing.clickonRoundSetup();
		landing.clickonPlusButton();
		
		Assert.assertEquals(driver.getTitle(), "Casino Tournaments");
		
	}
	
	@AfterMethod
	public void close() throws InterruptedException{
		Thread.sleep(3000);
		driver.close();
	}
}
