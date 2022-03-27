package com.StudentEnrollment.scripts;

import java.io.IOException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.stdentenrollment.testbase.TestBase;
import com.studentenrollment.constants.AutomationConstants;
import com.studentenrollment.pages.LoginPage;
import com.studentenrollment.utilities.ExcelUtility;


public class TestClassLogin extends TestBase {
	
	LoginPage objLogin;   //creating object for LoginPage
	
	@Test(priority=1)   //Verifying valid username and invalid password by selecting Admin
	public void verifyVuIp() throws IOException {  
		//Create Login Page object	   
		objLogin = new LoginPage(driver);
	    objLogin.clickLoginH();	    
	    String username = ExcelUtility.getCellData(1, 0);
	    String password = ExcelUtility.getCellData(1, 1);
	    String role = ExcelUtility.getCellData(1, 2);
	    objLogin.setUserName(username);
	    objLogin.setPassword(password);
	    objLogin.setRole(role);	 
	    objLogin.clickLogin();	    
	    WebDriverWait wait=new WebDriverWait(driver,3);	  
	    wait.until(ExpectedConditions.alertIsPresent());   
	    Alert alert=driver.switchTo().alert();
	    String alertMessage= driver.switchTo().alert().getText();
	    String expectedMessage = AutomationConstants.LOGIN_FAILURE_MESSAGE;
	    String actualMessage =alertMessage;
	    Assert.assertEquals(expectedMessage, actualMessage);
	    alert.accept();				    
	    }
	
	@Test(priority=2)    //Verifying Invalid username and valid password by selecting Admin
	public void verifyIuVp() throws IOException {
	    //Create Login Page object
		objLogin = new LoginPage(driver);
	    objLogin.clearusername();
	    objLogin.clearpassword();
	    String username = ExcelUtility.getCellData(2, 0);
	    String password = ExcelUtility.getCellData(2, 1);
	    String role = ExcelUtility.getCellData(2, 2);
	    objLogin.setUserName(username);
	    objLogin.setPassword(password);
	    objLogin.setRole(role);
	    objLogin.clickLogin();		
	    WebDriverWait wait=new WebDriverWait(driver,3);	  
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert=driver.switchTo().alert();
	    String alertMessage= driver.switchTo().alert().getText();
	    String expectedMessage = AutomationConstants.LOGIN_FAILURE_MESSAGE2;
	    String actualMessage =alertMessage;
	    Assert.assertEquals(expectedMessage, actualMessage);
	    alert.accept(); 
	    }
	
	@Test(priority=3)  //Verifying invalid username and invalid password by selecting Admin
	public void verifyIuIp() throws IOException {
		
		objLogin = new LoginPage(driver);
	    objLogin.clearusername();
	    objLogin.clearpassword();
	    String username = ExcelUtility.getCellData(3, 0);
	    String password = ExcelUtility.getCellData(3, 1);
	    String role = ExcelUtility.getCellData(3, 2);
	    objLogin.setUserName(username);
	    objLogin.setPassword(password);
	    objLogin.setRole(role);
	    objLogin.clickLogin();		
	    WebDriverWait wait=new WebDriverWait(driver,3);	  
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert=driver.switchTo().alert();
	    String alertMessage= driver.switchTo().alert().getText();
	    String expectedMessage = AutomationConstants.LOGIN_FAILURE_MESSAGE2;
	    String actualMessage =alertMessage;
	    Assert.assertEquals(expectedMessage, actualMessage);
	    alert.accept(); 
	    }
	@Test(priority=4)  //Verifying valid username and valid password by selecting student
	public void verifyVuVpS() throws IOException {
		
		objLogin = new LoginPage(driver);
	    objLogin.clearusername();
	    objLogin.clearpassword();
	    String username = ExcelUtility.getCellData(4, 0);
	    String password = ExcelUtility.getCellData(4, 1);
	    String role = ExcelUtility.getCellData(4, 2);
	    objLogin.setUserName(username);
	    objLogin.setPassword(password);
	    objLogin.setRole(role);
	    objLogin.clickLogin();		
	    WebDriverWait wait=new WebDriverWait(driver,3);	  
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert=driver.switchTo().alert();
	    String alertMessage= driver.switchTo().alert().getText();
	    String expectedMessage = AutomationConstants.LOGIN_FAILURE_MESSAGE2;
	    String actualMessage =alertMessage;
	    Assert.assertEquals(expectedMessage, actualMessage);
	    alert.accept(); 
	    }
	
	@Test(priority=5)   //Verifying valid username and valid password by selecting Employee
	public void verifyVuVpE() throws IOException {
	    //Create Login Page object
		objLogin = new LoginPage(driver);
	    objLogin.clearusername();
	    objLogin.clearpassword();
	    String username = ExcelUtility.getCellData(5, 0);
	    String password = ExcelUtility.getCellData(5, 1);
	    String role = ExcelUtility.getCellData(5, 2);
	    objLogin.setUserName(username);
	    objLogin.setPassword(password);
	    objLogin.setRole(role);
	    objLogin.clickLogin();		
	    WebDriverWait wait=new WebDriverWait(driver,3);	  
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert=driver.switchTo().alert();
	    String alertMessage= driver.switchTo().alert().getText();
	    String expectedMessage = AutomationConstants.LOGIN_FAILURE_MESSAGE2;
	    String actualMessage =alertMessage;
	    Assert.assertEquals(expectedMessage, actualMessage);
	    alert.accept(); 
	    }
	
	@Test(priority=6) //Verifying valid username and valid password by selecting Admin
	public void verifyValidLogin() throws IOException {
	    //Create Login Page object
		objLogin = new LoginPage(driver);
	    objLogin.clearusername();
	    objLogin.clearpassword();
	    String username = ExcelUtility.getCellData(0, 0);
	    String password = ExcelUtility.getCellData(0, 1);
	    String role = ExcelUtility.getCellData(0, 2);
	    objLogin.setUserName(username);
	    objLogin.setPassword(password);
	    objLogin.setRole(role);
	    objLogin.clickLogin();
		
	    WebDriverWait wait=new WebDriverWait(driver,3);	  
	    wait.until(ExpectedConditions.alertIsPresent());
	    Alert alert=driver.switchTo().alert();
	    String alertMessage= driver.switchTo().alert().getText();
	    String expectedMessage = AutomationConstants.LOGIN_SUCCESS_MESSAGE;
	    String actualMessage =alertMessage;
	    Assert.assertEquals(expectedMessage, actualMessage);
	    alert.accept();
	    }
	}

