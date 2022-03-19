package com.StudentEnrollment.scripts;

import org.testng.annotations.Test;

import com.stdentenrollment.testbase.TestBase;
import com.studentenrollment.pages.LandingPage;

public class TestClassLanding extends TestBase {
	
	LandingPage objland;  //creating object for LandingPage

	@Test(priority=1)   //verifying the landing/home page navigation by clicking home button

	 public void verifyLandingPage() {
		
		objland=new LandingPage(driver);		
		objland.home();			   
		objland.gothrough();
		
	}
	
	@Test(priority=2)    // verifying social media icon navigations 
	public void socialmediaicon()  {
			
			objland.facebook();					
			objland.twitter();		
			objland.instagram();
			objland.showmoreH();
						 
		    
					    
		}
	}
		
	
