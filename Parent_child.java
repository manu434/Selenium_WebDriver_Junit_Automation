package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parent_child {
	ChromeDriver driver;

	@Before
	public void before() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(50000);
		// Thread.sleep((long) (Math.random() * 3000) + 1000); // Wait for 1–4 seconds

	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
		// driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
	}

	@After
	public void after() {
		driver.quit();
	}
}
