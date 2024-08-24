package generic_Utility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

public class WebDriverUtility {

	public void maximizeWindow(WebDriver driver) {

		driver.manage().window().maximize();
	}
	
	public void implicitWait(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	public void explicitWait(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void explicitWaitForAnElement(WebDriver driver, WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	//DropDown Handling Methods
	public void selectOptionByIndexValue(WebElement element, int indexvalue) {

		Select s = new Select(element);
		s.selectByIndex(indexvalue);
	}
	
	public void selectOptionByStringValue(WebElement element, String value) {

		Select s = new Select(element);
		s.selectByValue(value);
	}
	
	public void selectOptionByVisibleText(WebElement element, String visibletext) {

		Select s =new Select(element);
		s.selectByVisibleText(visibletext);
	}
	
	public void deselectAllOption(WebElement element) {

		Select s =new Select(element);
		s.deselectAll();
	}
	
	public void checkElementIsMultiSelect(WebElement element) {

		Select s =new Select(element);
		s.isMultiple();
	}
	
	public void deselectOptionByIndexValue(WebElement element,int indexValue) {

		Select s=new Select(element);
		s.deselectByIndex(indexValue);
	}
	
	public void deselectoptionByValue(WebElement element,String value) {

		Select s=new Select(element);
		s.deselectByValue(value);

	}
	
	public void deselectByVisibleText(WebElement element,String visibleText) {

		Select s=new Select(element);
		s.deselectByVisibleText(visibleText);
	}
	
	//Mouse Handling Methods
	public void movingTowardsAnElement(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}
	
	public void rightClickOperation(WebDriver driver) {

		Actions act = new Actions(driver);
		act.contextClick().perform();
	}
	
	public void rightClickOperationOnElement(WebDriver driver, WebElement element) {

		Actions act = new Actions(driver);
		act.contextClick(element);
	}
	
	public void clickOperation(WebDriver driver) {
		Actions act =new Actions(driver);
		act.click().perform();
	}
	
	public void clickOperation(WebDriver driver,WebElement element) {
		Actions act =new Actions(driver);
		act.click(element).perform();
	}
	
	public void doubleClickOperation(WebDriver driver) {
		Actions act=new Actions(driver);
		act.doubleClick().perform();
	}
	
	public void doubleClickOperation(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.doubleClick(element).perform();
	}
	
	public void dragAndDropOperation(WebDriver driver,WebElement src,WebElement target) {
		Actions act=new Actions(driver);
		act.dragAndDrop(src, target).perform();
	}
	
	public void dragAndDropSlider(WebDriver driver,WebElement src, int x,int y) {
		Actions act=new Actions(driver);
		act.dragAndDropBy(src, x, y).perform();
	}
	
	public void scrollToElement(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.scrollToElement(element);
	}
	
	public void scrollDownOperation(WebDriver driver,String jsValue) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript(jsValue);
	}
	
	//Window Handling Methods
	public void switchToWindow(WebDriver driver,String ParentId) {
		
		Set<String>childIds=driver.getWindowHandles();
		Iterator<String> itr=childIds.iterator();
		
		while (itr.hasNext()) {
			
			String IDS=itr.next();
			String ALLIDS=driver.switchTo().window(IDS).getTitle();
			
			if (ParentId.contains(ALLIDS)) {
				
				break;
			}
		}
	}
	
	//CaptureScreenShot
	public String captureScreenShotMethod(WebDriver driver,String screenShotName) throws IOException {
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String path = ".\\ScreenshotFolder\\"+"screenshotname"+".png";
		File dest = new File(path);
		Files.copy(src, dest);
		String finalPath=dest.getAbsolutePath();
		return finalPath;
	}
	
	//customizeClick
	public void customizeClickOnElement(WebElement element) throws Exception {
		int count=1;
		while (count<10) {
			try {
				element.click();
				break;
			} catch (Exception e) {
				Thread.sleep(3000);
				count++;
			}
		}
	}
}