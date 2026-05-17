package Test.Selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Ex {
public static void main(String[] args) {
	ChromeDriver cd = new ChromeDriver();
	cd.get("https://www.calculator.net/");
	cd.manage().window().maximize();
}

}
