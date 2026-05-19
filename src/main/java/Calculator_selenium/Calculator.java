package Calculator_selenium;

import java.util.Iterator;

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
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='2']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='" + operator[i] + "']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='4']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(500);

            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
    }

    void Trignomatric() throws InterruptedException {
    	String[] Trig = {"sin","cos","tan"};
    	
    	for(int i =0 ; i<Trig.length;i++) {

            cd.findElement(By.xpath("//span[text()='"+Trig[i] + "']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()='4']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()=')']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
    	}

    }
    void Trig_asin()throws InterruptedException {
    	String[] trig2 = {"asin", "acos", "atan"};
    	for(int i=0; i<trig2.length;i++) {
    	    cd.findElement(By.xpath("//span[@onclick=\"r('" + trig2[i] + "')\"]")).click();
    	    Thread.sleep(500);
    	    cd.findElement(By.xpath("//span[text()='0']")).click();
    	    cd.findElement(By.xpath("//span[text()='.']")).click();
    	    cd.findElement(By.xpath("//span[text()='5']")).click();
    	    Thread.sleep(500);
    	    cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(500);
            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
    	}
    }
    // xʸ , x³, x² ,eˣ,10ˣ
    void Square() throws InterruptedException {

        String[] square = {"x3", "x2"};
        for (int i = 0; i < square.length; i++) {

            // Enter 9
            cd.findElement(By.xpath("//span[text()='9']")).click();
            Thread.sleep(500);
            // Click x³ or x²
            cd.findElement(By.xpath("//span[@onclick=\"r('" + square[i] + "')\"]")).click();
            Thread.sleep(500);
            // Equal
            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(1000);
            // Clear
            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
    }
    void Square2() throws InterruptedException {

        String[] square = {"ex", "10x"};
        for (int i = 0; i < square.length; i++) {

            // Enter 9
            cd.findElement(By.xpath("//span[text()='9']")).click();
            Thread.sleep(500);
            // Click x³ or x²
            cd.findElement(By.xpath("//span[@onclick=\"r('" + square[i] + "')\"]")).click();
            Thread.sleep(500);
            // Click 3
            cd.findElement(By.xpath("//span[text()='3']")).click();
            Thread.sleep(500);
            // Equal
            cd.findElement(By.xpath("//span[text()='=']")).click();
            Thread.sleep(1000);
            // Clear
            cd.findElement(By.xpath("//span[text()='AC']")).click();
            Thread.sleep(500);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        Calculator c1 = new Calculator();

        c1.openBrowser();

        c1.Arithmatic();

        c1.Trignomatric();
        
        c1.Trig_asin();
        
        c1.Square();
        
        c1.Square2();

        c1.cd.quit(); // end me browser close
    }
}