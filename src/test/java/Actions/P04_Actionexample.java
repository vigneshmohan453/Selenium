package Actions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class P04_Actionexample {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwj-w_H72pT7AhVTx3MBHW-JDiUQPAgI");

		Actions act = new Actions(driver);
		act.sendKeys("vignesh").perform();
		act.sendKeys(Keys.TAB).perform();
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File ss = ts.getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File("C:\\Users\\VIGNESH S\\Desktop\\Selenium"+System.currentTimeMillis()+".png"));
		
		System.out.println("hello");
		Thread.sleep(50000);
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
