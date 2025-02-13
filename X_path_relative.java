package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Relative {
	ChromeDriver driver;

	@Before
	public void before() {
		driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void test() {
		// driver.findElement(By.xpath("//input[@name='email']")).sendKeys("manukshibu@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("aswe333");
		driver.findElement(By.name("login")).click();
	}

}
