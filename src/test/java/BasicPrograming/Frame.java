package BasicPrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testleaf.herokuapp.com/pages/frame.html");	
		
		WebElement findElement = driver.findElement(By.xpath("//iframe[@src='default.html']"));
		
		driver.switchTo().frame(findElement);
		
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.id("Click"));
		ele.click();
		Thread.sleep(2000);
		System.out.println(ele.getText());
		
		
		
		
		
		
		
		
		
	}
}
