package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Get_Text {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	}

	@Test
	public void test() {
		String loginbutton = driver.findElement(By.name("login")).getText();
		// String textname = loginbutton.getText();
		System.out.println(loginbutton);
	}

	@After
	public void after() {
		driver.quit();
	}

}
