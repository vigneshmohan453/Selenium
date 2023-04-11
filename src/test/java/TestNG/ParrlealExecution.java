package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParrlealExecution {
	public class Validation {

		WebDriver driver;

		@BeforeMethod
		@Parameters("Browser")
		public void launchBrowser(String browserType) {
			if (browserType.contains("Chrome")) {
				System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browserType.contains("Edge")) {
				System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.get("https://practicetestautomation.com/practice-test-login/");
		}

		@Test
		public void PositiveTest() {
			driver.findElement(By.id("username")).sendKeys("student");
			driver.findElement(By.id("password")).sendKeys("Password123");
			driver.findElement(By.id("submit")).click();
		}

		@AfterMethod
		public void closeDriver() {
			driver.close();
		}

	}
}
