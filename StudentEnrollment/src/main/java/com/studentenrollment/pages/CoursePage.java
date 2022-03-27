package com.studentenrollment.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoursePage {

WebDriver driver;
    //locate elements in add course
    @FindBy(xpath="//a[@routerlink='courses']")
    private WebElement course; 
    @FindBy(linkText="Add Course")
    private WebElement Addcourse;
    @FindBy(id="cname")
    private WebElement coursename;
    @FindBy(id="certification")
    private WebElement certifyname;
    @FindBy(id="code")
    private WebElement coursecode;  
    @FindBy(id="details")
    private WebElement coursedetail;
    @FindBy(xpath="//input[@name=\"price\"]")
    private WebElement courseprice;
    @FindBy(xpath="//input[@name=\"eligibility\"]")
    private WebElement eligibility; 
    @FindBy(xpath="//input[@type=\"file\"]")
    private WebElement imageupload;
    @FindBy(xpath="//button[@type=\"submit\"]")
    private WebElement addcourse;
    @FindBy(xpath="//app-courses//div[2]//button[3]//a")
    private WebElement deleteC;
    @FindBy(xpath="//app-courses//div[2]//button[1]//a") 
    private WebElement knowmore;
    @FindBy(xpath="//*[@id=\"courses\"]/div/div/div[2]/div[1]/img")
    private WebElement img;
    @FindBy(xpath="//*[@id=\"courses\"]/div/div/div[3]/div[1]/div/div/button[2]/a")
    private WebElement edit;


public CoursePage(WebDriver driver) {
	this.driver = driver;
  //This initElements method will create all WebElements
	PageFactory.initElements(driver, this);
	}
public void course() {
	course.click();
	}
public void Addcourse() {
	Addcourse.click();
	}
public void setcoursename(String scoursename){
	coursename.sendKeys(scoursename);     	
	}
public void setcertifyname(String scertifyname){
	certifyname.sendKeys(scertifyname);              	
	}
public void setcoursecode(String scoursecode){
	coursecode.sendKeys(scoursecode);              	
	}
public void setcoursedetail(String scoursedetail){
	coursedetail.sendKeys(scoursedetail);              	
	}
public void setcourseprice(String scourseprice){
	courseprice.sendKeys(scourseprice);
	}
public void seteligibility(String seligibility){
	eligibility.sendKeys(seligibility);              	
	}
public void simageupload(){
	imageupload.sendKeys("C:\\Users\\DELL\\Desktop\\image\\ETL.png");       
	}        
public void addcourse() {
	addcourse.click();
	}

public void clearcoursename() {
	coursename.clear();
	}
public void clearcertifyname() {
	certifyname.clear();
	}
public void clearcoursecode() {
	coursecode.clear();
	}  
public void clearcoursedetail() {
	coursedetail.clear();
	}
public void clearcourseprice() {
	courseprice.clear();
	}
public void cleareligibility() {
	eligibility.clear();
	}
public void clearimage() {
	imageupload.clear();
	}
public void edit() {      //method to hover the mouse on course and click edit
	Actions actions = new Actions(driver);
	actions.moveToElement(img).build().perform();
	actions.moveToElement(edit).build().perform();
    edit.click();
    }
public void knowmore() {      //method to hover the mouse on course and click knowmore
	Actions actions = new Actions(driver);
	actions.moveToElement(img).build().perform();
	actions.moveToElement(knowmore).build().perform();
	knowmore.click();
	}
public AllStudentsPage delete() {     //method to hover the mouse on course and click delete
	Actions actions = new Actions(driver);
	actions.moveToElement(img).build().perform();
	actions.moveToElement(deleteC).build().perform();
	deleteC.click();
	return new AllStudentsPage(driver);     
	}
}
      


