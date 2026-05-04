package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblogintest {
	public static void main(String args[]) {
		ChromeDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		dr.findElement(By.id("_R_oiqjbjb9pb6amH1_")).sendKeys("sneha@gmail.com");
		dr.findElement(By.id("_R_oqqjbjb9pb6amH1_")).sendKeys("Sneha@123");
//		dr.findElement(By.className("x1lliihq x193iq5w x6ikm8r x10wlt62 xlyipyv xuxw1ft")).click();
		dr.close();
	}

}
