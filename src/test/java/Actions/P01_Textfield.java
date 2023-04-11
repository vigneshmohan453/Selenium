package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_Textfield {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");

		driver.findElement(By.id("email")).sendKeys("vigneshmohan453@gmail.com");
		driver.findElement(By.xpath("//input[@value='Append ']")).sendKeys("vignesh");
		String str = driver.findElement(By.xpath("//input[@value='TestLeaf']")).getAttribute("value");
		System.out.println(str);
		driver.findElement(By.xpath("//input[@value='Clear me!!']")).clear();
		System.out.println(driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled());

		Thread.sleep(10000);
		driver.close();
	}
}
