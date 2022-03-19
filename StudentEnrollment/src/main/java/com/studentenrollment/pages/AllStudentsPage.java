package com.studentenrollment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllStudentsPage {
	
	WebDriver driver;
	// locate elements in all students 
	@FindBy(xpath="//a[@routerlink='students']")
    private WebElement allstudents;   
    @FindBy(id="listSearch")
    private WebElement search;
    @FindBy(xpath="//h3[contains(.,'saranya')]//following::button[@class=\"btn btn-primary\"][1]")
    private WebElement showdetails;        
    @FindBy(xpath="//h3[contains(.,'saranya')]//following::button[@class=\"btn btn-danger\"][1]")
    private WebElement delete;
    
public AllStudentsPage(WebDriver driver) {
	this.driver = driver;
        //This initElements method will create all WebElement
	PageFactory.initElements(driver, this);
	}
    public void clickallstudents() {
    	allstudents.click();
    	}
    public void search() {
    	search.sendKeys("saranya");    
    	}
    public void search1() {
    	search.sendKeys("MERN"); 
    	}
    public void search2() {
    	search.sendKeys("riji@gmail.com"); 
    	}
    public void search3() {
    	search.sendKeys("980904133"); 
    	}
    public void clearsearch() {
    	search.clear(); 
    	}
    public void showdetails() {
    	showdetails.click();
    	}  
    public void delete() {
    	delete.click();
    	}
    }      
 
