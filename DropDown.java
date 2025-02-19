package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");

	}

	@Test
	public void test() {
		WebElement day = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		WebElement month = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		WebElement year = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));

		Select daysc = new Select(day);
		Select monthsc = new Select(month);
		Select yeaSelect = new Select(year);

		daysc.selectByValue("08");
		monthsc.selectByIndex(4);
		yeaSelect.selectByVisibleText("2006");

		// getoptions to get the count of each day/month/year
		List<WebElement> a = daysc.getOptions();
		List<WebElement> b = monthsc.getOptions();
		List<WebElement> c = yeaSelect.getOptions();

		System.out.println(a.size());
		System.out.println(b.size());
		System.out.println(c.size());

		// i live in dropdown

		WebElement country = driver.findElement(By.xpath("//*[@id=\"country\"]"));

		WebElement city = driver.findElement(By.xpath("//*[@id=\"div_city\"]/table/tbody/tr[1]/td[3]/select"));

		Select countrysc = new Select(country);
		Select citysc = new Select(city);

		countrysc.selectByVisibleText("India");
		citysc.selectByVisibleText("Chennai");
	}

}
