package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Test2 {
	@Test
	public void m() {


		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ref=nav_logo");

		/**List<WebElement> elements = driver.findElements(By.xpath("//label[@id='searchDropdownDescription']/../select/option"));

		for (WebElement categories : elements) {

			System.out.println(categories.getText());
		}
		
		driver.findElement(By.xpath("//a[.='Mobiles']")).click();
		List<WebElement> options = driver.findElements(By.xpath("//span[.='Brand']/../following-sibling::ul/li"));
		
		for (WebElement mobileoptions : options) {
			
			System.out.println(mobileoptions.getText());
		}
		**/
		driver.findElement(By.xpath("//a[.='Mobiles']")).click();
		
		List<WebElement> list = driver.findElements(By.xpath
				("//h1[@class='a-size-base a-color-base a-text-bold']"
						+ "/../../following-sibling::div[12]/div/"
						+ "following-sibling::ul/li"));
		for (WebElement seller : list) {
			
			System.out.println(seller.getText());
		}
		List<WebElement> mobiles = driver.findElements(By.xpath("//h1[@class='a-size-base a-color-base a-text-bold']"
				+ "/../../../div[6]/div/"
				+ "following-sibling::ul/li"));
		for (WebElement list1 : mobiles) {
			
			System.out.println(list1.getText());
		}
		driver.findElement(By.cssSelector("id=\"sobe_d_b_23_1\"")).click();
		
		driver.close();


	}
}
