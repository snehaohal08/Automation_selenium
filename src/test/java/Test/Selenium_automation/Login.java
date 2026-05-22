package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
public class Login {
	EdgeDriver ed ;
	@Test
	void launch_brow() {
		EdgeDriver ed = new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://www.saucedemo.com/");
	}
	@AfterTest
	void fuser() {
		ed.findElement(By.id("user-name")).sendKeys("standard_user");
		ed.findElement(By.id("password")).sendKeys("secret_sauce");
		ed.findElement(By.id("login-button")).click();
	}
}
