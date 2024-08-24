package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FlipkartSearch { 
	@Test
	public void test() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("nothing 2a", Keys.ENTER);
		WebElement element = driver.findElement(By.xpath("//div[@class='KzDlHZ' and .='Nothing Phone (2a) 5G (White, 128 GB)']/../following-sibling::div/div/div//div[.='₹23,999']"));
		System.out.println(element.getText());
		WebElement element1 = driver.findElement(By.xpath("//div[@class='DOjaWF gdgoEp']/div[6]/div/div/div/a/div[2]/div/div[.='Nothing Phone (2a) 5G (White, 128 GB)']"));
		System.out.println(element1.getText());
		driver.close();
	}

}
