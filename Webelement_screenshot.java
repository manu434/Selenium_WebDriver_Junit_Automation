package junit;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;

public class Webelement_screenshot {
	EdgeDriver driver;

	@Before
	public void before() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}

	@Test
	public void test() throws IOException {
		WebElement screenshot1 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		File sc = screenshot1.getScreenshotAs(OutputType.FILE);
		// FileHandler.copy(sc, new File("D:\\screenshot\\image2.png"));
		FileHandler.copy(sc, new File("./screenshot/elementscreenshot3.png"));
	}
}
