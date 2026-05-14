package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyBord_action {
	public static void main(String args[]) throws InterruptedException{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.google.com/");
		cd.manage().window().maximize();
		cd.findElement(By.tagName("textarea"));
		WebElement serch = cd.findElement(By.id("APjFqb"));
		serch.sendKeys("Software tesing");
		serch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		// navigate to another page
		cd.navigate().to("https://demowebshop.tricentis.com/");
		WebElement se= cd.findElement(By.id("small-searchterms"));
		se.sendKeys("books");
		se.sendKeys(Keys.ENTER);
		
		cd.findElement(By.linkText("Register")).click();
		WebElement fname = cd.findElement(By.id("FirstName"));
		fname.sendKeys("Sneha");
		fname.sendKeys(Keys.CONTROL+"A");
		fname.sendKeys(Keys.CONTROL+"C");
		
		WebElement lname = cd.findElement(By.id("LastName"));
		lname.sendKeys(Keys.CONTROL+"V");
		lname.sendKeys(Keys.TAB);
	}
}
