package BasicPrograming;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxUsingCollection {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		List <WebElement> findElements =  driver.findElements(By.xpath("(//div[@class='example'])[1]//child::input"));
		System.out.println(findElements.size());
		int a=0;
		for(WebElement ele:findElements)
		{
			a++;
			ele.click();
			System.out.println(a);
		}
	}
}

