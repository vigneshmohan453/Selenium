package BasicPrograming;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxAssignement {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			WebElement findElement = driver
					.findElement(By.xpath("(//div[@class='example'])[1]//child::input[" + i + "]"));
			findElement.click();
			Thread.sleep(2000);
			boolean selected = findElement.isSelected();
			Thread.sleep(2000);
			System.out.println(selected);
		}
	}
}