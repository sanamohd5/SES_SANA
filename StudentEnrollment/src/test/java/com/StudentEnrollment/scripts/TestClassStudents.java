package com.StudentEnrollment.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.stdentenrollment.testbase.TestBase;
import com.studentenrollment.pages.AllStudentsPage;

public class TestClassStudents extends TestBase {
			
		AllStudentsPage objallstds;  //creating object for AllStudentsPage
		
		@Test(priority=1)    //Verifying the AllStudentsPage functionalities
		public void verifyallstudents() throws IOException {
			objallstds=new AllStudentsPage(driver);
			objallstds.clickallstudents();
			objallstds.search();
			objallstds.clearsearch();
			objallstds.search1();
			objallstds.clearsearch();
			objallstds.search2();
			objallstds.clearsearch();
			objallstds.search3();
			objallstds.clearsearch();
			objallstds.showdetails();
			objallstds.delete();
			}
		}



