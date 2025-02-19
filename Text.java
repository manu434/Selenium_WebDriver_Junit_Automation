package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Text {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test() {
		WebElement button = driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		String actual = button.getAttribute("value");
		String expec = "Create my account >>";
		if (actual.equals(expec)) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

	}

	@After
	public void after() {
		driver.quit();
	}

}