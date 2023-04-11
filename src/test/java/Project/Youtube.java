package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Youtube {
	@Test
	public static void name() {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/feed/channels");
		
		Actions act = new Actions(driver);

		act.sendKeys("vigneshmohan453@gmail.com").perform();
		WebElement findElement = driver.findElement(By.xpath("(//span[@class=\"VfPpkd-vQzf8d\"])[2]"));
		act.click(findElement).perform();
	}
	


}
