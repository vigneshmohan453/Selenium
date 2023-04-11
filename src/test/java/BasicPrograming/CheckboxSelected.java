package BasicPrograming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxSelected {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");

		List<WebElement> findElements = driver.findElements(By.tagName("label"));
		for (WebElement ele : findElements) {
			System.out.println(ele.getText());
		}

		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		List<WebElement> findElements2 = driver.findElements(By.xpath("//div[@class='example']//input"));

		for (WebElement ele : findElements2) {
			System.out.println(ele.isSelected());
			ele.click();
			System.out.println(ele.isSelected());
		}
	}
}