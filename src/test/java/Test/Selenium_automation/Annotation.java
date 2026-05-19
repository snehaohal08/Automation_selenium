package Test.Selenium_automation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterMethod;
public class Annotation {
	//1 
	@AfterClass
	void annotation1() {
		System.out.println("AfterClass");
	}
	// 2
	@AfterTest
	void AfterTestex() {
		System.out.println("AfterTest");
	}
	// 3
	@AfterSuite
	void AfterSuite() {
		System.out.println("AfterSuite");
	}
	// 4
	@AfterMethod
	void AfterMethod() {
		System.out.println("AfterMethod");
	}
	// 5
	@BeforeClass
	void annotation2() {
		System.out.println("BeforeClass");
	}
	// 6
	@BeforeTest
	void beforeTest() {
		System.out.println("Before Test");
	}
	// 7
	@BeforeSuite
	void BeforeSuite() {
		System.out.println("BeforeSuite");
	} 
	// 8
	@BeforeMethod
	void beforMethod() {
		System.out.println("BeforeMethod");
	}
	// 9
	@Test
	void annotation3() {
		System.out.println("Test");
	}
}
