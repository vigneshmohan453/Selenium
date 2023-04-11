package BasicPrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");


		WebElement un = driver.findElement(By.id("email"));
		un.sendKeys("9025498264");
		WebElement pw = driver.findElement(By.id("pass"));
		pw.sendKeys("16212808");
		driver.findElement(By.name("login")).click();
		
		
		
	}
}
