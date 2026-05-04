package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orhm {
	public static void main(String args[]) {
		ChromeDriver cd = new ChromeDriver();
		
		cd.manage().window().maximize();
		cd.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		cd.findElement(By.id("name")).sendKeys("sneha");
		cd.findElement(By.name("email")).sendKeys("sneha@gmail.com");
//		cd.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
//		cd.findElement(By.id("gender")).click();
//		cd.findElement(By.xpath("//label[text()='Female']")).click();
		cd.findElement(By.id("mobile")).sendKeys("9604064897");
		cd.findElement(By.name("dob")).sendKeys("08-12-2003");
		cd.findElement(By.name("subjects")).sendKeys("Software testing...");
//		cd.findElement(By.xpath("//input[@type='checkbox' and @value='Sports']")).click();
//		cd.findElement(By.id("dob")).click();
//		cd.findElement(By.id("picture")).click();
		cd.findElement(By.xpath("//input[@type='file']")).click();
	}
}
