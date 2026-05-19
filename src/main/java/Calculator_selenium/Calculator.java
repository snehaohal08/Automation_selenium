package Calculator_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calculator {

    ChromeDriver cd;

    void openBrowser() {

        cd = new ChromeDriver();
        cd.get("https://www.calculator.net/");
        cd.manage().window().maximize();
    }

    void Arithmatic() throws InterruptedException {

    	String[] operator = {"+","–","/","×"};

        for (int i = 0; i < operator.length; i++) {

            cd.findElement(By.xpath("//span[text()='2']")).click();
            Thread.sleep(1000);

            cd.findElement(By.xpath("//span[text()='2']")).click();
            Thread.sleep(1000);

            cd.findElement(By.xpath("//span[text()='" + operator[i] + "']")).click();
            Thread.sleep(1000);

            cd.findElement(By.xpath("//span[text()='4']")).click();
            Thread.sleep(1000);

            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(2000);

            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(1000);
        }
    }

    void Trignomatric() throws InterruptedException {

        cd.findElement(By.xpath("//span[text()='sin']")).click();
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {

        Calculator c1 = new Calculator();

        c1.openBrowser();

        c1.Arithmatic();

        c1.Trignomatric();

        c1.cd.quit(); // end me browser close
    }
}