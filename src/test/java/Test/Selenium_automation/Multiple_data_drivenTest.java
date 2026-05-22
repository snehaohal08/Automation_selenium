package Test.Selenium_automation;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;

public class Multiple_data_drivenTest {
	EdgeDriver ed ;
  @Test(dataProvider = "data")
  public void f(String uname, String pass) throws InterruptedException {
//		EdgeDriver ed = new EdgeDriver();
//		ed.manage().window().maximize();
//		ed.get("https://www.saucedemo.com/");
		ed.findElement(By.id("user-name")).sendKeys(uname);
		ed.findElement(By.id("password")).sendKeys(pass);
		ed.findElement(By.id("login-button")).click();
		Thread.sleep(2000);
		ed.close();
  }
  @BeforeSuite
  public void User() {
		EdgeDriver ed = new EdgeDriver();
		ed.manage().window().maximize();
		ed.get("https://www.saucedemo.com/");
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] {"problem_user", "secret_sauce" },
      new Object[] {"performance_glitch_user", "secret_sauce" },
    };
  }
}
