package Actions;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Stringexample {
	public static void main(String[] args) throws InterruptedException, AWTException{

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiossH37Zb7AhXDhuYKHd-DD54QPAgI");
		
		StringSelection s = new StringSelection("vigneshmohan@gmmail.com");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s, null);
		
		WebElement e = driver.findElement(By.xpath("//input[@name='q']"));
		
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(e));
		
		e.sendKeys("vignesh");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		
		FluentWait wai = new FluentWait(driver);
		
		wai.pollingEvery(30, TimeUnit.SECONDS);
		
		
		
		
		Thread.sleep(10000);
		driver.close();
		
		
		
		
		
		
		
		
		
	}
}