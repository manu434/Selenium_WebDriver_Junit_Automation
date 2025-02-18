package junit;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Tagename {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}

	@Test
	public void test() {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println("Total links in the google Site :" + li.size());
		for (WebElement link : li) {
			// Getting the href attribute
			// String href = link.getAttribute("href");
			String href = link.getDomAttribute("href");
			// Getting the text of the link
			String text = link.getText();

			System.out.println("Link Text: " + text);
			System.out.println("Href: " + href);
		}

	}

	@After
	public void after() {
		driver.quit();
	}
}
