package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assign {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		// Pause the test to manually solve CAPTCHA
		// Please solve the CAPTCHA manually
		// Thread.sleep(10000); // 30 seconds to solve CAPTCHA
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles");
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']")).click();
		driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"ap_email_login\"]")).sendKeys("abcgmal.ccom");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.navigate().back();
		driver.navigate().back();
		// driver.navigate().back();
		driver.findElement(By.xpath("//a[normalize-space()='Sell']")).click();
		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();

	}

}
