package UIProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UIAndActionFacebook {

	WebDriver driver;

	UIAndActionFacebook(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.id("email");
	By password = By.id("pass");
	By login = By.name("login");

	public void enterusername() {
		driver.findElement(username).sendKeys("Hello");
	}

	public void enterpassword() {
		driver.findElement(password).sendKeys("1234");
	}

	public void loginbutton() {
		driver.findElement(login).click();
	}

}
