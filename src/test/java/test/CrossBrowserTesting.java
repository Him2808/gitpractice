package test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void test(String browser) {
		
		if (browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
			driver.get("https://www.google.com/");
			System.out.println("Chrome Browser Launched Successfully..");
		}
		if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			driver.get("https://www.google.com/");
			System.out.println("Edge Browser Launched Successfully..");
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	}
}
