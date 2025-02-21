package junit;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.edge.EdgeDriver;

public class Respond_code {
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
		URL ob = new URL(baseurl);
		HttpURLConnection con = (HttpURLConnection) ob.openConnection();
		con.connect();
		if (con.getResponseCode() == 200) {
			System.out.println("Valid URL:");
		} else {
			System.out.println("Invalid URL:");
		}
	}

}
