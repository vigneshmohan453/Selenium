package BasicPrograming;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Alert.html");
		
		driver.findElement(By.xpath("//button[text()='Prompt Box']")).click();
		Thread.sleep(5000);
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		

	}
}
