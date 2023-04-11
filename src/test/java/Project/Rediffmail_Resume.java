package Project;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rediffmail_Resume 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Study\\Java\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		Actions act=new Actions(driver);
		//login code
		driver.findElement(By.id("login1")).sendKeys("vigneshmohan453@rediffmail.com");
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("UuBer3Q@").build().perform();
		driver.findElement(By.xpath("//input[@name='proceed']")).click();
		
		//compose mail code
		driver.findElement(By.xpath("//b[text()='Write mail']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@class='rd_inp_to as-input']")).sendKeys("vigneshmohan453@gmail.com");
		Thread.sleep(3000);
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("Assignment successfully done..........!!!").build().perform();
		act.sendKeys(Keys.TAB).build().perform();
		act.sendKeys("Dear sir,\n").build().perform();
		act.sendKeys("\t Good Morning sir, I am successfully write code and done the assignment. Review my resume if any mistake please let me know.\n\n\n ").build().perform();
		act.sendKeys("Thanks & Regards,\n S. vignesh.").build().perform();

		//attachment code
		driver.findElement(By.xpath("//a[@class='attch_fil']")).click();
		Thread.sleep(3000);
		StringSelection s1= new StringSelection("C:\\Users\\VIGNESH S\\Desktop\\vignesh\\Resume_vignesh.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);

		Robot rb =new Robot();
		rb.delay(2000);
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_ENTER);

		//send code
		Thread.sleep(1000);		
		driver.findElement(By.xpath("//a[@class='send_ng_compo rd_btn_cmp_send']")).click();

		Thread.sleep(20000);
		driver.close();
	}
}







