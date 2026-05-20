package Test.Selenium_automation;
import org.testng.annotations.Test;
public class Priority {
	
	// same priority

//	@Test 
//	void first()  {
//		System.out.println("This is no priority");
//	}
//	@Test(priority = -5)
//	void second() {
//		System.out.println("This is -5 priority");
//	}
//	@Test (priority = 0)
//	void Third() {
//		System.out.println("This is 0 priority");
//	}
	
//	@Test (priority = 0)
//	void zebra()  {
//		System.out.println("This is zebra priority");
//	}
//	@Test(priority = 0)
//	void tom() {
//		System.out.println("This is tom priority");
//	}
//	@Test (priority = 10)
//	void Third() {
//		System.out.println("This is 10 priority");
//	}
	@Test (priority = -2)
	void zebra()  {
		System.out.println("This is first priority");
	}
	@Test(priority = -2)
	void tom() {
		System.out.println("This is second priority");
	}
	@Test (priority = -2)
	void Third() {
		System.out.println("This is third priority");
	}
}
