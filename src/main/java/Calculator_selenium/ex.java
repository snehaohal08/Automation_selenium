package Calculator_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class ex {
	public static void main(String[] args) {
		ChromeDriver cd = new ChromeDriver();
		cd.get("https://www.calculator.net/");
	}
}
