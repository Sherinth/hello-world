package Brinji_Qedem;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Section_01 {
	public static void main(String[] arg) {
		
		// 1st java pup-up
		System.out.println("Selenium is not a Tool! Just a Jar File! ");
		
		
		// Test in the different browser: Chrome, Firefox
		// 1st step : set property 
		System.setProperty("webdriver.chrome.driver", "/Users/sherinmuhtar/Desktop/Selenium Dependencies/Drivers/chromedriver");
		//System.setProperty("webdriver.gecko.driver", "/Users/sherinmuhtar/Desktop/Selenium Dependencies/Drivers/geckodriver");
		
		// create object for driver class
		WebDriver driver1 = new ChromeDriver();
		WebDriver driver2 =  new FirefoxDriver();
		driver1.get("http://youtube.com");
		driver2.get("http://amazon.com");
		
		System.out.println(driver1.getTitle());
		System.out.println(driver2.getTitle());
		System.out.println("la la la");
		System.out.println("Chiqildim");

	}
}
