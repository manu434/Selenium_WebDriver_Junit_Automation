package junit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Response_Code_Assign {

	EdgeDriver driver;
	String baseurl = "https://www.google.com/";

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get(baseurl);
	}

	@Test
	public void test() throws IOException {
		List<WebElement> li = driver.findElements(By.tagName("a"));
		for (WebElement link : li) {
			String href = link.getDomAttribute("href");
			Verify(href);

		}
	}

	private void Verify(String href) {
		try {
			URL ob = new URL(href);
			HttpURLConnection con = (HttpURLConnection) ob.openConnection();
			con.connect();
			if (con.getResponseCode() == 200) {
				System.out.println("Valid URL :" + href);
			} else if (con.getResponseCode() == 404) {
				System.out.println("invalid url : " + href);
			} else if (con.getResponseCode() == 300) {
				System.out.println("Redirection messages :" + href);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
