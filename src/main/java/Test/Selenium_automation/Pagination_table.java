package Test.Selenium_automation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Pagination_table {
	public static void main(String args[]) throws InterruptedException {
		
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://testautomationpractice.blogspot.com/");
		cd.manage().window().maximize();
		Thread.sleep(2000);
		// only one checkbox will be clicked 
//		cd.findElement(By.xpath("(//input[@type='checkbox'])[8]")).click();
		// get all check boxes 
		// find element
		List<WebElement> checkbox =  cd.findElements(By.xpath("//input[@type='checkbox']"));
		
		// click all the checkboxes 
		for (int i = 7; i < checkbox.size(); i++) {

            checkbox.get(i).click();
            System.out.println("Checkbox selected: " + (i + 1));
        }
		Thread.sleep(2000);
		 
		cd.findElement(By.xpath("//ul[@id='pagination']//li[2]")).click();
		
	}
}

