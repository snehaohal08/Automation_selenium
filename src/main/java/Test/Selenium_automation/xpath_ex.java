package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_ex {

	public static void main(String args[]) throws InterruptedException  {
		ChromeDriver cd = new ChromeDriver();
		
		cd.manage().window().maximize();
		cd.get("https://demoqa.com/automation-practice-form");
//********************************* 1. by using attribute = //tagname[@attributename='value']*******************
		// username
		cd.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("sneha");
		Thread.sleep(2000); 
		
		// password
		cd.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("ohal");
		Thread.sleep(2000); 
		
		// 2. by using parenttag name and chiledtag name = //parenttagname//childtagname
		
// ******************************3. by using indexing = (//tagname[@attribute='value'])[indexing]**************
		// Email
		cd.findElement(By.xpath("//input[@placeholder='name@example.com'][1]")).sendKeys("sneha@gmail.com");
		Thread.sleep(2000); 
		// Gender 
//**************************************4. by using text = (//tagname[text()='value'])**********************
		cd.findElement(By.xpath("//label[text()='Female']")).click();
		Thread.sleep(2000); 
		
//******************by using attribute**********************************
		// mobile number
		cd.findElement(By.xpath("//input[@id='userNumber']")).sendKeys("9604064897");
		Thread.sleep(2000); 
//		subject
		cd.findElement(By.xpath("//input[@id='subjectsInput']"))
		  .sendKeys("automation testing");
		Thread.sleep(2000);
//		hobbies
		cd.findElement(By.xpath("//input[@id='hobbies-checkbox-2']")).click();
		Thread.sleep(2000); 
//		address
		cd.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("kasurdi khedshivapur...");
		Thread.sleep(2000); 
		
// **********************by using text()*************************
		cd.findElement(By.xpath("//button[text()='Submit']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//button[text()='Close']")).click();
//		Thread.sleep(2000);
		cd.close();
		
	}
}
