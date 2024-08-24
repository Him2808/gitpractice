package test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Practice1 {
	
	@Test
	public void AmazonMobiles() {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");
		
		driver.findElement(By.xpath("//a[@class='nav-a  ' and @data-csa-c-slot-id=\"nav_cs_4\"]")).click();
		List<WebElement> mobiles = driver.findElements(By.xpath("//h1[@class='a-size-base a-color-base a-text-bold']"
				+ "/../../../div[6]/div/following-sibling::ul/li"));
		for (WebElement list : mobiles) {
			
			System.out.println(list.getText());
		}
		driver.close();
		
	}

}
