package BasicPrograming;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testleaf.herokuapp.com/pages/Window.html");

		//System.out.println(driver.getWindowHandle());
		driver.findElement(By.id("home")).click();
		
		//Set<String> windowHandles = driver.getWindowHandles();
		List <String> ls = new ArrayList<String>(driver.getWindowHandles());
		
		System.out.println(ls.get(0));	
		System.out.println(ls.get(1));
	
		driver.switchTo().window(ls.get(1));
		driver.findElement(By.xpath("//h5[text()='Edit']")).click();		
		System.out.println(ls.get(1));

	}

}
