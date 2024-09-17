package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

public class Day1 {

	@Test
	public void Demo() {
	System.out.println("Software Tester Day1");	// TODO Auto-generated method stub

	}
	
	@AfterSuite
	public void Last() {
	System.out.println("Iam the LAST  1:");
	}
	@Test (groups= {"Smoke"})
	public void Demo1() {
		System.out.println("In IT Sector Day 1 smoke test");	// TODO Auto-generated method stub

		}

}
