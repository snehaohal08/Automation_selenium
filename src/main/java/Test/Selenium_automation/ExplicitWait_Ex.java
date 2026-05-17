package Test.Selenium_automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait_Ex {
	void implicit_ex() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://demo.automationtesting.in/Register.html");
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		cd.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("sneha");
		cd.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("ohal");
		}
	void explixitwait_ex() {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://demo.automationtesting.in/Register.html");
		cd.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(cd,Duration.ofSeconds(10));
		WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@ng-model='EmailAdress']")));
		email.sendKeys("sneha@gmail.com");
	}
	public static void main(String args[]) {
		ExplicitWait_Ex  ex= new ExplicitWait_Ex();
		ex.implicit_ex();
//		ex.explixitwait_ex();
	}

}
