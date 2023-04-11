package UIProgram;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class UIAndActionFB {

	@FindBy(how = How.ID, using = "email")
	public WebElement Username;

	@FindBy(how = How.ID, using = "pass")
	public WebElement password;

	@FindBy(how = How.NAME, using = "login")
	public WebElement loginButton;

	public void enterUn() {
		Username.sendKeys("Hello");
	}

	public void enterPW() {
		password.sendKeys("123");
	}

	public void clickLogin() {
		loginButton.click();
	}

}
