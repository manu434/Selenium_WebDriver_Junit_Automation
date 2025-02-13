package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junit_Execution {
	ChromeDriver driver;

	@Before
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
	}

	@Test
	public void title() {
		String src = driver.getTitle();
		String expected = "google";
		if (src.equalsIgnoreCase(expected)) {
			System.out.println("The tile is correct:");
		} else {
			System.out.println("The Title is incorrect:");
		}
	}

	@Test
	public void contentverify() {
		String con = driver.getPageSource();
		if (con.contains("storee")) {
			System.out.println("content is verified:");
		} else {
			System.out.println("content is wrong:");
		}
	}

	@After
	public void browserclose() {
		driver.close();
		driver.quit();
	}

}
