package UIProgram;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScriptFacebook {

	WebDriver driver;

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://facebook.com");

		UIAndActionFacebook fb = new UIAndActionFacebook(driver);
		fb.enterusername();
		fb.enterpassword();
		fb.loginbutton();
		
		TakesScreenshot  ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("‪C:\\Users\\VIGNESH S\\Desktop\\Selenium");
		try {
			Files.copy(source, target);
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}
}
