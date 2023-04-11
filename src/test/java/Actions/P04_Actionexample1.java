package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P04_Actionexample1 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");

		WebElement ele = driver.findElement(By.xpath("//button[text()='Copy Text']"));

		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();

		WebElement e1 = driver.findElement(By.id("draggable"));
		WebElement e2 = driver.findElement(By.id("droppable"));

		WebElement e4 = driver.findElement(By.id("trash"));
		WebElement e3 = driver.findElement(By.xpath("//h5[text()='Mr John']"));
		WebElement e5 = driver.findElement(By.xpath("//h5[text()='Mary']"));

		act.dragAndDrop(e1, e2).perform();

		act.dragAndDrop(e3, e4).perform();
		act.dragAndDrop(e5, e4).perform();

		Thread.sleep(10000);
		driver.close();

	}
}
