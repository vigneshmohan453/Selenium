package BasicPrograming;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesclose {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testleaf.herokuapp.com/pages/Window.html");

		driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button")).click();

		List<String> ls = new ArrayList<String>(driver.getWindowHandles());

		System.out.println(ls.get(0));
		System.out.println(ls.get(1));
		System.out.println(ls.get(2));

		System.out.println("_____________________________");

		for (String str : ls) {
			System.out.println(str);
			driver.switchTo().window(str);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			driver.close();
			System.out.println("******************");
		}

	}
}
