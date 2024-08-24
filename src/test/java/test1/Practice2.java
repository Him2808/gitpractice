package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.List;

public class Practice2 {
	
	@Test
	public void fetchMultileElements() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//img[@alt='Mobiles']")).click();
		List<WebElement> elements =  driver.findElements(By.xpath("//div[@class='cPHDOP col-12-12'][20]/div/div/div/div/div/div/div/div"));
		for (WebElement list : elements) {
			
			System.out.println(list.getText());
		}
		driver.close();
	}

}
