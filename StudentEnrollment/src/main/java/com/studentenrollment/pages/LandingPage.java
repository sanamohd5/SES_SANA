package com.studentenrollment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
WebDriver driver;
            //xpath for home page functionalities
    @FindBy(xpath="//a[@routerlink='home']")  
    private WebElement home;   
    @FindBy(xpath="//*[@id=\"home\"]/div/div/div/div/div/div/a")  
    private WebElement gothrough;
    @FindBy(xpath="//button[@class=\"btn btn-primary\"]")
    private WebElement showmoreH;     
    @FindBy(xpath="//i[@class=\"icon ion-social-facebook\"]")
    private WebElement facebook;
    @FindBy(xpath="//i[@class=\"icon ion-social-twitter\"]")
    private WebElement twitter;
    @FindBy(xpath="//i[@class=\"icon ion-social-instagram\"]")
    private WebElement instagram;
            
public LandingPage(WebDriver driver) {
	this.driver = driver;
     //This initElements method will create all WebElements
	PageFactory.initElements(driver, this);
	}
public void home() {
	home.click();    
	}
public void gothrough() {	
	gothrough.click();	
    }
public void facebook() {	
	facebook.click();
	}
public void twitter() {	
	twitter.click();
	}
public void instagram() {	
	instagram.click();
	}
public LoginPage showmoreH() {
	showmoreH.click(); 
	return new LoginPage(driver);
	}      
}



