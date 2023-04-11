package Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.edge.driver","D:\\Study\\Java\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("9025498264");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("16212808");
		driver.findElement(By.xpath("//button[@name='login']")).click();	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("(//i[@class='gneimcpu b0w474w7'])[1]")).click();
		driver.findElement(By.xpath("(//img[@class='gneimcpu p9wrh9lq'])[7]")).click();
		driver.findElement(By.xpath("(//i[@class='gneimcpu b0w474w7'])[9]")).click();
		
		String text = driver.findElement(By.xpath("(//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas m2nijcs8 hxfwr5lz k1z55t6l oog5qr5w innypi6y pbevjfx6'])[2]")).getText();
		System.out.println("Name is "+ text);
		String text1 = driver.findElement(By.xpath("//span[@class='gvxzyvdx aeinzg81 t7p7dqev gh25dzvf exr7barw b6ax4al1 gem102v4 ncib64c9 mrvwc6qr sx8pxkcf f597kf1v cpcgwwas f5mw3jnl szxhu1pg glosn74e oog5qr5w tes86rjd rtxb060y']")).getText();
		System.out.println("Birthday on "+text1);
	}
}
