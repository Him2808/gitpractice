package test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsingListCollection {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		WebElement searchquery = driver.findElement(By.xpath("//textarea[@name='q']"));
		searchquery.sendKeys("cristiano ronaldo");
		List<WebElement> suggestions = driver.findElements(By.xpath("//li[@class='sbct sbre PZPZlf']"));
		for (WebElement element : suggestions) {

			String suggest = element.getText();
			System.out.println(suggest);
		}
		Iterator <WebElement> itr=suggestions.iterator();
		while(itr.hasNext())
		{
			String s1=itr.next().getText();
			System.out.println(s1);
		}


		driver.quit();
		 
		/*WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("iphone 11");
		Thread.sleep(3000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//li[@class='_3D0G9a']"));
		Thread.sleep(3000);
		for(WebElement elements:suggestions)
		{
			String s=elements.getText();
			System.out.println(s);
		}

		Iterator <WebElement> itr=suggestions.iterator();
		while(itr.hasNext())
		{
			String s1=itr.next().getText();
			System.out.println(s1);
		}*/




	}
}
