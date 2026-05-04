package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
class Demo{
	void Dispaly() {
		// Open browser
		ChromeDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		 // Open page
		cd.get("https://practicetestautomation.com/practice-test-login/");
		// get username
		cd.findElement(By.id("username")).sendKeys("student");
		//get password
		cd.findElement(By.id("password")).sendKeys("Password123");
		// submit data 
		cd.findElement(By.id("submit")).click();
		// print the current url 
		System.out.println("URL of: "+ cd.getCurrentUrl());
	//*************************************************************************
		
		String currenturl = cd.getCurrentUrl();
		if(currenturl.contains("https://practicetestautomation.com/logged-in-successfully/")) {
			System.out.println("URL Verification is passed");
		}else {
			System.out.println("URL Verification is failed");
		}
//		***********************************************************************
		
		String pageText = cd.getCurrentUrl();
		if(pageText.contains("Congratulations") || pageText.contains("successfully logged in")) {
			System.out.println("Text Verification is passed");
		}else {
			System.out.println("Text Verification is failed");
		}
		cd.close();
		
	}
}

public class Task2 {
	public static void main(String args[]) {
//		ChromeDriver cd = new ChromeDriver();
//		cd.manage().window().maximize();
//		
//		cd.get("https://practicetestautomation.com/practice-test-login/");
//		cd.close();
		Demo d= new Demo();
		d.Dispaly();
		
	}

}
