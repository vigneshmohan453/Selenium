package BasicPrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement findElement = driver.findElement(By.id("dropdown1"));
		
		new Select (findElement).selectByIndex(1);
		Thread.sleep(2000);
		new Select (findElement).selectByValue("3");
		Thread.sleep(2000);
		new Select (findElement).selectByVisibleText("Selenium");
		
		
		

	}
}
