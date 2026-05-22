package Test.Selenium_automation;


import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.chrome.ChromeDriver;

public class Externalfilereading {

	@org.testng.annotations.Test
	void fileread() throws IOException, InterruptedException {
		FileReader fr = new FileReader("C:\\Users\\Sneha\\eclipse-workspace\\Selenium_automation\\base.properties");
		
		Properties p = new Properties();
		p.load(fr);
		
		ChromeDriver  cd = new ChromeDriver();
		cd.get(p.getProperty("fcturl"));
		Thread.sleep(2000);
		cd.close();
	}
}
