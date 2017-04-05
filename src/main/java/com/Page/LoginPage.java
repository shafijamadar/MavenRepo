package com.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private String USERNAME_XPATH="//*[@id='input' and @type='email']";
	private String PASSWORD_XPATH="//*[@id='input' and @type='password']";
	private String SIGNIN_BUTTON_ID="signinButton";
	private String FORGETPASSWORD_XPATH="";
	private String CHANGEPASSWORD_XPATH="";

	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}

	public void setuserName(){
	driver.findElement(By.xpath(USERNAME_XPATH)).sendKeys("mohammad.shafi@ssg.com");	
	}
	
	public void setpassword(){
		driver.findElement(By.xpath(PASSWORD_XPATH)).sendKeys("Password1234$");
	}
	
	public void clickSignin(){
		driver.findElement(By.id(SIGNIN_BUTTON_ID)).click();
	}
}
