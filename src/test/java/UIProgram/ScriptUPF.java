package UIProgram;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class ScriptUPF {

	WebDriver driver;

	@BeforeMethod
	public void browse() {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void testFaceBook() {
		driver.get("http://facebook.com");
		UIAndActionFB sfb = PageFactory.initElements(driver,UIAndActionFB.class);
		sfb.enterUn();
		sfb.enterPW();
		sfb.clickLogin();
		
	}
}
