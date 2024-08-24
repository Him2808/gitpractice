package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonArrayListUsage {
	@SuppressWarnings("unchecked")
	@org.testng.annotations.Test
	public void Test() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		List<WebElement> All = driver.findElements(By.xpath("//select[@title='Search in']/child::option"));
		
		
		for (WebElement i : All) {
			
			System.out.println(i.getText());
		}
		driver.close();
		
	}

}
