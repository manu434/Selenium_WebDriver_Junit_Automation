package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Id_Locator {
	ChromeDriver driver;

	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

	@Test
	public void test() {
		driver.findElement(By.id("email")).sendKeys("manukshibu@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("aswe1235");
		driver.findElement(By.name("login")).click();
	}

}
