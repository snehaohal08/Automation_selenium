package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String args[]) {
		ChromeDriver cd = new ChromeDriver();
		
		cd.get("https://practicetestautomation.com/practice-test-login/");
		cd.manage().window().maximize();
		
//		cd.findElement(By.id("username")).sendKeys("student");
		
//		cd.findElement(By.name("username")).sendKeys("student");
		
//		cd.findElement(By.className("btn")).click();
		
//		cd.findElement(By.tagName("input")).sendKeys("student");
		
		//linltext = multiple ways ni try karyach anchor tag
//		cd.findElement(By.linkText("COURSES")).click();
		
//		cd.findElement(By.partialLinkText("BL")).click();
		
		// 7. xpath =syn = (//tagname[@attribute='value'])
//		cd.findElement(By.xpath("//input[@type='text']")).sendKeys("student");
//		cd.close();		
		
		cd.navigate().to("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		// tag name
		// logical and = //tagname[@attribute='value' and @attribute='value']
		// logical or = //tagname[@attribute='value' or @attribute='value']
		
		
	}
}
