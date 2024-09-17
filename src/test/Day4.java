package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day4 {
	@Test (dataProvider="getUserDetails")
	public void SignUp(String username,String password) {
	//System.out.println("Software Tester with URL");	
	System.out.println(username);
	System.out.println(password);

	}	
	
	
@Parameters({"URL","Credentials"})
	@Test 
	public void Demo(String urlname,String Cred) {
	System.out.println("Software Tester with URL");	
System.out.println(urlname);
System.out.println(Cred);

	}
	
	@AfterSuite
	public void Last() {
	System.out.println("Iam the LAST  1:");
	}
	@Test (groups= {"Smoke"})
	public void Demo1() {
		System.out.println("In IT Sector");	// TODO Auto-generated method stub

		}
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod of Day 4");	// TODO Auto-generated method stub

		}
	@org.testng.annotations.AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod day 4 test");	// TODO Auto-generated method stub

		}
	
	//Consider for login we need to check one positive negative testcases
	@DataProvider
	public Object[][] getUserDetails()
{
		
		//1st username,password for good credit history
		//2nd username,password with no credit history
		//3rd-fraudlent credit history
 Object obj [][] =new Object[3][2];
 //FIRST SET
 obj[0][0]="FirstSetusername";
 obj[0][1]="FirstSetpassword";
 
 //Second SET
 obj[1][0]="SecondSetusername";
 obj[1][1]="SecondSetpassword";
 
 
 //Third SET
 obj[2][0]="ThirdSetusername";
 obj[2][1]="ThirdSetpassword";
 
 return obj;
}
	

}
