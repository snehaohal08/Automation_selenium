package Test.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ohrm {
	ChromeDriver cd;
	@Test
	void logintest() {
		cd = new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		cd.findElement(By.name("username")).sendKeys("Admin");
		cd.findElement(By.name("password")).sendKeys("admin123");
		cd.findElement(By.xpath("//button[text()=' Login ']")).click();
	}
	@Test
	void logout() {
//		cd= new ChromeDriver();
		cd.findElement(By.xpath("//img[@alt='profile picture']")).click();
		cd.findElement(By.linkText("Logout")).click();
	}
}
