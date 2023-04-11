package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Facebook {

	WebDriver driver;

	@BeforeMethod
	@Parameters("Browser")
	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void PositiveTest() throws InterruptedException {
		String[] names = new String[] { "vignesh", "ramesh", "kumar" };

		for (int i = 0; i < names.length; i++) {
			driver.get("https://practicetestautomation.com/practice-test-login/");

			WebElement name = driver.findElement(By.id("username"));
			WebElement pass = driver.findElement(By.id("password"));
			WebElement login = driver.findElement(By.id("submit"));

			pass.sendKeys("password");
			name.sendKeys(names[i]);
			login.click();
			Thread.sleep(2000);
		}

	}

}
