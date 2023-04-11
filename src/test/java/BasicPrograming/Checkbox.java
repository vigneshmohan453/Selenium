package BasicPrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/webhp?hl=en&sa=X&ved=0ahUKEwiNxtzzt5H7AhXkZWwGHT8DCUgQPAgI");

		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("hello");
	}
}
