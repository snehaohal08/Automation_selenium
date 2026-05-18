package Calculator_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ex {
	
	void Arithmatic() throws InterruptedException{
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.calculator.net/");
		cd.manage().window().maximize();
		cd.findElement(By.xpath("//span[@onclick='r(1)']")).click();
		Thread.sleep(2000);
//		cd.findElement(By.xpath("//span[text()='Back']")).click();
		cd.findElement(By.xpath("//span[text()='+']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//span[text()='2']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//span[text()='=']")).click();
		WebElement ans = cd.findElement(By.id("sciOutPut"));
		String result = ans.getText();
		System.out.println("Addition = "+result);
	}
	void footer()throws InterruptedException {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.calculator.net/");
		cd.manage().window().maximize();
		cd.findElement(By.linkText("Mortgage Calculator")).click();
		Thread.sleep(2000);
		cd.navigate().back();
		cd.findElement(By.linkText("Loan Calculator")).click();
		Thread.sleep(2000);
		cd.navigate().back();
		cd.findElement(By.linkText("Auto Loan Calculator")).click();
		Thread.sleep(2000);
		cd.navigate().back();
		cd.findElement(By.linkText("Interest Calculator")).click();
		Thread.sleep(2000);
		cd.navigate().back();
	}
	public static void main(String[] args) throws InterruptedException{
		ex e1 = new ex();
//		e1.Arithmatic();
		e1.footer();
		
	}
}
