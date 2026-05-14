package Test.Selenium_automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_drag_drop {
	ChromeDriver cd;
	Actions  at;
	void mouse_hover() throws InterruptedException {
		cd = new ChromeDriver();
		cd.get("https://demo.nopcommerce.com/");
		cd.manage().window().maximize();
		
		// Action class 
		at = new Actions(cd);
		// WebElement which is used serch the webelement comp is used to store the element
		WebElement comp=cd.findElement(By.linkText("Computers"));
		at.moveToElement(comp).build().perform();
		Thread.sleep(2000);
	}
	void serch()throws InterruptedException {
		WebElement serchbox = cd.findElement(By.id("small-searchterms"));
		WebElement button = cd.findElement(By.xpath("//button[text()='Search']"));
		at.sendKeys(serchbox ,"laptop").click(button).perform();
	}
 public static void main(String args[]) throws InterruptedException{
	 Action_drag_drop ad= new Action_drag_drop();
	 ad.mouse_hover();
	 ad.serch();
 }
}
