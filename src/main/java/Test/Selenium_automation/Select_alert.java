package Test.Selenium_automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Select_alert {
	
	void select() {
		ChromeDriver cd = new ChromeDriver(); 
		cd.get("https://demo.automationtesting.in/Register.html");
		cd.manage().window().maximize();
		
		// use for drop-down we use Select
		// ONLY FINDOUT THAT ELEMENT (kontya element la select karaych ahe te )
		
		 Select sel = new Select(cd.findElement(By.id("Skills")));
		 
		 // Three ways to findout the element
		 // 1. Select by index
//		 sel.selectByIndex(5);
		 
		 // 2. select by visibilityText
//		 sel.selectByVisibleText("Design");
		 
		 // 3. Select by value 
		 sel.selectByValue("Content Management Systems (CMS)");
	}

    void alert() throws InterruptedException {

        ChromeDriver cd = new ChromeDriver();
        cd.get("https://demo.automationtesting.in/Alerts.html");
        cd.manage().window().maximize();

        // 1st Alert with OK
        cd.findElement(By.xpath("//button[@onclick='alertbox()']")).click();

        Alert al = cd.switchTo().alert();
        Thread.sleep(1000);
        al.accept();

        Thread.sleep(3000);
//***********************************************************************************************
        // 2nd Alert with OK & Cancel
        cd.findElement(By.xpath("//a[@href='#CancelTab']")).click();
        Thread.sleep(2000);

        cd.findElement(By.xpath("//button[@onclick='confirmbox()']")).click();
        Thread.sleep(2000);

        Alert al2 = cd.switchTo().alert();
        al2.accept(); // OK
        // al2.dismiss(); // Cancel

        Thread.sleep(3000);
        
//***********************************************************************************************
        // 3rd Alert with Textbox
        cd.findElement(By.xpath("//a[@href='#Textbox']")).click();
        Thread.sleep(2000);

        cd.findElement(By.cssSelector("button[onclick='promptbox()']")).click();
        Thread.sleep(2000);

        Alert al3 = cd.switchTo().alert();
        al3.sendKeys("Sneha Ohal");
        Thread.sleep(2000);
        al3.accept();

        Thread.sleep(2000);

        String text = cd.findElement(By.id("demo1")).getText();
        System.out.println(text);

        cd.quit();
    }
	
	
	
	public static void main(String args[]) throws InterruptedException {
		Select_alert sa = new Select_alert();
//		sa.select();
		sa.alert();
	}
}
