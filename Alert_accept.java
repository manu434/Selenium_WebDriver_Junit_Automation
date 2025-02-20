package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Alert_accept {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://127.0.0.1:5500/file.html");
	}

	@Test
	public void test() {
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		// driver.switchTo().alert().accept();

		Alert a = driver.switchTo().alert();
		String content = a.getText();
		String Expected = "Please enter your first and last name.";
		if (Expected.equals(content)) {
			System.out.println("PASS");

		} else {
			System.out.println("FAIL");
		}
		a.accept();
		// a.dismiss();
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("manu");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("k shibu");
		driver.findElement(By.xpath("//*[@id=\"userForm\"]/input[3]")).click();

		WebElement details = driver.findElement(By.xpath("//*[@id=\"displayArea\"]"));
		System.out.println(details.getText());

	}

}
