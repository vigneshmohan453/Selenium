package BasicPrograming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSelection {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/radio.html");

		List <WebElement> findElements = driver.findElements(By.xpath("//div[@class='large-6 small-12 columns']//child::input"));

		for (WebElement ele : findElements) {
			ele.click();
			System.out.println(ele.isDisplayed());
			System.out.println(ele.isSelected());
			
		}
	}
}
