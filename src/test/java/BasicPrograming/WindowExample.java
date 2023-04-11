package BasicPrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExample {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		String windowHandle = driver.getWindowHandle();

		driver.manage().window().maximize();
		driver.get("https://testleaf.herokuapp.com/pages/Window.html");

		 driver.findElement(By.id("home")).click();

		Thread.sleep(2000);

		System.out.println(windowHandle);

	}
}
