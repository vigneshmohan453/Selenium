package Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		Thread.sleep(1000);
		driver.get("http://testleaf.herokuapp.com/home.html");
	
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
	}
}
