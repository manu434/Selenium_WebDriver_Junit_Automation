package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {
	ChromeDriver driver;

	@Before
	public void before() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void test() {
		driver.findElement(By.name("q")).sendKeys("selenium", Keys.ENTER);
		// driver.findElement(By.name("btnK")).click();
	}

	@After
	public void after() {
		// driver.close();
	}

}
