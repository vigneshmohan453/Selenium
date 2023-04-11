package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_Buttons {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");

		driver.findElement(By.id("home")).click();
		driver.navigate().back();

		Point str = driver.findElement(By.id("position")).getLocation();
		System.out.println(str);

		WebElement ele = driver.findElement(By.id("color"));
		String s = ele.getCssValue("color");
		System.out.println(s);

		Dimension size = driver.findElement(By.id("size")).getSize();
		System.out.println(size);

		Thread.sleep(10000);
		driver.close();

	}
}
