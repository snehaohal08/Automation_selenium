package Test.Selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String arg[]) {
		// launch the browser,initialize the chromedrive object 
		ChromeDriver driver = new ChromeDriver();
		
		// open the current webpage
		driver.get("https://www.facebook.com/");
		
		// navigation webpage
		driver.navigate().to("https://www.fortunecloudindia.com/");
		
		// to navigate back website
		driver.navigate().back();
		
		// close the webpage
		driver.close();
		
	}
}
		