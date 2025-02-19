package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign_2 {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg/");
	}

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.name("firstname")).sendKeys("mks");
		driver.findElement(By.name("lastname")).sendKeys("shibu");
		WebElement day = driver.findElement(By.xpath("//*[@id=\"day\"]"));
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]"));
		WebElement year = driver.findElement(By.xpath("//*[@id=\"year\"]"));

		// options select
		Select daysc = new Select(day);
		Select monthsc = new Select(month);
		Select yearsc = new Select(year);

		daysc.selectByValue("10");
		monthsc.selectByValue("8");
		yearsc.selectByValue("1963");

		// count of each elements in day/month/year
		List<WebElement> a = daysc.getOptions();
		List<WebElement> b = monthsc.getOptions();
		List<WebElement> c = yearsc.getOptions();

		System.out.println("day count :" + a.size());
		System.out.println("months count :" + b.size());
		System.out.println("year count :" + c.size());

		driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		// Thread.sleep(20000);
		driver.findElement(By.name("reg_email__")).sendKeys("gafil24556@bitflirt.com");
		driver.findElement(By.id("password_step_input")).sendKeys("aswe3344");
		driver.findElement(By.name("websubmit")).click();

	}

}
