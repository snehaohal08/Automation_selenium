package Calculator_selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ex {
	ChromeDriver cd;
	
	void Arithmatic() throws InterruptedException{
		cd = new ChromeDriver();
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
		cd.close();
	}
	void footer()throws InterruptedException {
		cd = new ChromeDriver();
		cd.get("https://www.calculator.net/");
		cd.manage().window().maximize();
		cd.findElement(By.linkText("Mortgage Calculator")).click();
		System.out.println("1st url= "+cd.getCurrentUrl());
		Thread.sleep(2000);
		cd.navigate().back();
		cd.findElement(By.linkText("Loan Calculator")).click();
		System.out.println("2nd url= "+cd.getCurrentUrl());
		Thread.sleep(2000);
		cd.navigate().back();
		cd.findElement(By.linkText("Auto Loan Calculator")).click();
		System.out.println("3rd url= "+cd.getCurrentUrl());
		Thread.sleep(2000);
		cd.navigate().back();
		cd.findElement(By.linkText("Interest Calculator")).click();
		System.out.println("4th url= "+cd.getCurrentUrl());
		Thread.sleep(2000);
		cd.navigate().back();
		cd.close();
	}
	
	void Trigonometric_Functions()throws InterruptedException {
		cd=new ChromeDriver();
		cd.get("https://www.calculator.net/");
		cd.manage().window().maximize();
		Thread.sleep(2000);
//		cd.findElement(By.xpath("//span[text()='cos']")).click();
		cd.findElement(By.xpath("//span[@onclick=\"r('asin')\"]")).click();
//		\"(Backslash escape) = “quote ko normal character ki tarah treat karo”
//		System.out.println("She said \"Hello\"");
		Thread.sleep(2000);
		cd.findElement(By.xpath("//span[@onclick='r(0)']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//span[text()='.']")).click();
		cd.findElement(By.xpath("//span[@onclick='r(9)']")).click();
		Thread.sleep(2000);
		cd.findElement(By.xpath("//span[text()='=']")).click();
		WebElement ans = cd.findElement(By.id("sciOutPut"));
		String result = ans.getText();
		System.out.println("Ans = "+ result);
		cd.close();
	}
	
	public static void main(String[] args) throws InterruptedException{
		ex e1 = new ex();
////		e1.Arithmatic();
////		e1.footer();
//		e1.Trigonometric_Functions();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice: ");
        System.out.println("1: Arithmetic");
        System.out.println("2: Footer");
        System.out.println("3: Trigonometric");
		int sw = sc.nextInt();
		switch (sw) {
		case 1: {
			e1.Arithmatic();
			break;
		}
		case 2: {
			e1.footer();;
			break;
		}
		case 3: {
			e1.Trigonometric_Functions();;
			break;
		}
		default:
			System.out.println("Invalid exception");
		}
	
	}
}
