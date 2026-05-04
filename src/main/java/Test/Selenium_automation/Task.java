package Test.Selenium_automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String args[]) {

		// chromedriver ko initialize
		ChromeDriver cd = new ChromeDriver();
		// to maximize the window
		cd.manage().window().maximize();
		// SPPU url get
		cd.get("https://www.cdoe.sppuef.in/Home");
		//url of Myntra
		cd.navigate().to("https://www.myntra.com/?utm_source=gh_hmedia_mash&utm_medium=hmedia_rev&utm_campaign=gh_hmedia_mash&gad_source=1&gad_campaignid=23532554061&gbraid=0AAAABBG5P4T8aMOc-grDXBOdA8q2O8VEs&gclid=Cj0KCQjw77bPBhC_ARIsAGAjjV-8QJsM1ha4Y5DPOW3xe2-QMXxYdLU1Kd4tzRzoH3ECrzwJUxxjNEQaAmpbEALw_wcB");
		
		System.out.println("Title of Myntra: "+cd.getTitle()); //print the title of myntra
		// get url of SBI bank
		cd.navigate().to("https://onlinesbi.sbi.bank.in/");
		// navigate to sppu
		cd.get("https://www.cdoe.sppuef.in/Home");
		// refresh the page 
		cd.navigate().refresh();
		// print the url
		System.out.println("URL Of SPPU : "+cd.getCurrentUrl()); //print the URL of SPPU
		cd.close();
	}

}
