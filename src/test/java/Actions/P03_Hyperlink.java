package Actions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_Hyperlink {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");

		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='example']//input"));

		for (WebElement e : ele) {
			if(e.isSelected()==false)
				e.click();
			System.out.println(e.isSelected());
		}
		
		Thread.sleep(10000);
		driver.close();

	}
}
