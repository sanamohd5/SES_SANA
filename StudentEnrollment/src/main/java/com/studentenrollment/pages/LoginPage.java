package com.studentenrollment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LoginPage  { 
	// All WebElements are identified by @FindBy annotation
	WebDriver driver;
	// xpath for Admin login credentials
	@FindBy(xpath="//a[@routerlink='/login/studentlogin']")
    private WebElement loginH;    
    @FindBy(name="email")
    private WebElement username;    
    @FindBy(name="password")
    private WebElement password;       
    @FindBy(name="role")
    private WebElement role;        
    @FindBy(name="sign-in")
    private WebElement login;
    
    public LoginPage(WebDriver driver) {    
    	this.driver = driver;    
        PageFactory.initElements(driver, this); //This initElements method will create all WebElements
        }        
    public void clickLoginH() {
    	loginH.click();
    	}
    public void setUserName(String strUserName){
 	   username.sendKeys(strUserName);          	
 	   }   
    public void setPassword(String strPassword){
 	   password.sendKeys(strPassword);
 	   }            
    public void setRole(String strRole)   {            
 	   Select drop=new Select(role);
 	   drop.selectByVisibleText(strRole);
 	   }
    public void clearusername() {
 	   username.clear();
 	   }
    public void clearpassword() {
 	   password.clear();                
 	   }
    public CoursePage clickLogin() {
 	   login.click();
 	   return new CoursePage(driver);
 	   }
    }

       