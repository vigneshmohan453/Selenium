package BasicPrograming;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testleaf.herokuapp.com/pages/Window.html");	
		
		driver.findElement(By.id("color")).click();
		
		List<String> ls = new ArrayList<String>(driver.getWindowHandles());
				
		driver.switchTo().window(ls.get(1));
		
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Find where am supposed to go without clicking me?']")).click();
		
		
		
		
		
		
		
		
		
	}
}
