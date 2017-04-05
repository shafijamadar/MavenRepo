package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LandingScreen {
	
	public WebDriver driver=null;
	
	private String ROUNDSETUP_XPATH=".//*[@id='tabsContent']/paper-tab[3]/div";
	private String FAB_BUTTON_XPATH=".//*[@id='contentContainer']/mg-application-standard-fab/div[1]/paper-fab";
	
	public	WebDriverWait explicitwait = null;
	
	public LandingScreen(WebDriver driver)
	{
		explicitwait = new WebDriverWait(driver, 10);
		this.driver=driver;
	}
	
	public void clickonRoundSetup(){
		driver.findElement(By.xpath(ROUNDSETUP_XPATH)).click();
	}
	
	public void clickonPlusButton(){
		
		explicitwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(FAB_BUTTON_XPATH))).click();
		//driver.findElement(By.xpath(FAB_BUTTON_XPATH)).click();
	}
}
