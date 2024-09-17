package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Day2 {

	@AfterTest
	public void Demo() {
	System.out.println("After Test good profession");	// TODO Auto-generated method stub

	}
	@BeforeSuite
	public void No() {
	System.out.println("Iam the no 1:");
	}
	@Test (groups= {"Smoke"})
	public void aftertest() {
	System.out.println("good profession");	// TODO Auto-generated method stub

	}
}
