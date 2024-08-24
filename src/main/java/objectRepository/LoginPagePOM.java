package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {

	@FindBy(xpath = "//input[@name='user_name']")
	private WebElement username;

	@FindBy(xpath = "//input[@name='user_password']")
	private WebElement password;

	@FindBy(id = "[id='submitButton']")
	private WebElement loginBtn;

	//Constructor
	public LoginPagePOM(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	//Getters

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	//Business Library
	public void EnterLoginCredentials(String username, String password) {

		getUsername().sendKeys(username);
		getPassword().sendKeys(password);
	}
	public void ClickOnLoginBtn() {

		getLoginBtn().click();
	}
}

