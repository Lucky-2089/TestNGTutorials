package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day3 {

	@Test (groups= {"Smoke"})
	public void Login() {

		System.out.println("Login is Successfull");
	}

	@Test
	public void LoanSearch() {

		System.out.println("LoanSearch Login is Successfull");
	}

	@Test (dependsOnMethods={"LoanSearch"})
	public void ServiceAdmin() {

		System.out.println("ServiceAdmin Login is Successfull");
	}
	
	
	public void AfterMethod() {

		System.out.println("AfterMethod is Successfull");
	}
	@Test (enabled=false)
	public void BankRecon() {

		System.out.println("BankRecon Login is Successfull");
	}
	@BeforeTest
	public void Cleanner() {

		System.out.println("Cleaning in progress Please wait");
	}
	
}
