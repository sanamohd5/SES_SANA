package com.StudentEnrollment.scripts;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.stdentenrollment.testbase.TestBase;
import com.studentenrollment.constants.AutomationConstants;
import com.studentenrollment.pages.CoursePage;
import com.studentenrollment.utilities.ExcelUtility;

public class TestClassCourse extends TestBase {
	
	CoursePage objcourse;   //creating object for CoursePage
	
	@Test(priority=1)     //Verifying add course functionality by taking data from excel sheet
	public void verifyAddCourse() throws IOException {
		objcourse = new CoursePage(driver);		
		objcourse= new CoursePage(driver);
		objcourse.course();
		objcourse.Addcourse();
		String coursename = ExcelUtility.getCellData(0, 3);
	    String certifyname = ExcelUtility.getCellData(0, 4);
	    String coursecode = ExcelUtility.getCellData(0, 5);
	    String coursedetail = ExcelUtility.getCellData(0, 6);
	    double courseprice = ExcelUtility.getCellData1(0, 7);	  
	    String eligibility = ExcelUtility.getCellData(0, 8);	    
	    objcourse.setcoursename(coursename);				    
	    objcourse.setcertifyname(certifyname);				    
	    objcourse.setcoursecode(coursecode);				   
	    objcourse.setcoursedetail(coursedetail);				   
	    objcourse.setcourseprice(courseprice);				    
	    objcourse.seteligibility(eligibility);				 
	    objcourse.simageupload();
	    objcourse.addcourse();	    
	    }           
				
	 @Test(priority=2)    //Verifying update course functionality by taking data from excel sheet
	 public void VerifyUpdateCourse() throws IOException {
		 objcourse.edit();
		 objcourse.clearcoursename();
		 String coursename = ExcelUtility.getCellData(1, 3);
		 objcourse.clearcertifyname();		
		 String certifyname = ExcelUtility.getCellData(1, 4);
		 objcourse.clearcoursecode();	
		 String coursecode = ExcelUtility.getCellData(1, 5);
		 objcourse.clearcoursedetail();
		 String coursedetail = ExcelUtility.getCellData(1, 6);
		 objcourse.clearcourseprice();
		 double courseprice = ExcelUtility.getCellData1(1, 7);
		 objcourse.cleareligibility();
		 String eligibility = ExcelUtility.getCellData(1, 8);
		 objcourse.clearimage();
		 objcourse.setcoursename(coursename);				    
		 objcourse.setcertifyname(certifyname);				    
		 objcourse.setcoursecode(coursecode);				   
		 objcourse.setcoursedetail(coursedetail);				   
		 objcourse.setcourseprice(courseprice);				    
		 objcourse.seteligibility(eligibility);				 
		 objcourse.simageupload();
		 objcourse.addcourse();
		 }
	  
	 @Test(priority=3)   //Verifying whether data added is updated in knowmore
	 public void VerifyKnowMore() {
		 objcourse.knowmore();
		 }
	 
	 @Test(priority=4)  //Verifying whether a course can be deleted from courses list
	 public void Verifydelete() {
		 objcourse.course();		 
		 objcourse.delete();		
		 WebDriverWait wait=new WebDriverWait(driver,3);	  
		 wait.until(ExpectedConditions.alertIsPresent());
		 Alert alert=driver.switchTo().alert();
		 String alertMessage= driver.switchTo().alert().getText();
		 String expectedMessage = AutomationConstants.DELETE_COURSE_MESSAGE;
		 String actualMessage =alertMessage;
		 Assert.assertEquals(expectedMessage, actualMessage);
		 alert.dismiss();
		 }  
	 }	    
