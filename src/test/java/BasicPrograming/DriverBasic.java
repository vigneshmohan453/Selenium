package BasicPrograming;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverBasic {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");
				
		Thread.sleep(2000);
		driver.navigate().to("http://testleaf.herokuapp.com/home.html");
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		driver.navigate().forward();
		
		Thread.sleep(2000);
		driver.navigate().refresh();
		
		Thread.sleep(2000);
		System.out.println(driver.getCurrentUrl());
		
		Thread.sleep(2000);
		System.out.println(driver.getTitle());

	}
}
