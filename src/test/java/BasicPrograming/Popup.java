package BasicPrograming;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://testleaf.herokuapp.com/pages/Alert.html");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//button[text()=\"Alert Box\"]")).click();
		//driver.findElement(By.xpath("//button[text()=\"Confirm Box\"]")).click();
		driver.findElement(By.xpath("//button[text()=\"Prompt Box\"]")).click();

		
		
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("vignesh");
		System.out.println("vignesh is printed");
		

	}
}
