package packgm;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googlepgm {

	public static void main(String[] args) {
		// chrome browser opening my Url:
		ChromeDriver drive = new ChromeDriver();
		drive.get("https://manu434.github.io/ManuPortfolio/");
		// drive.close();
		// drive.quit();
		// edge browser opening my Url:
		// EdgeDriver edge = new EdgeDriver();
		// edge.get("https://manu434.github.io/ManuPortfolio/");
		// for closing tabs in browser
		// edge.close();
		// for entire quit of browser
		// edge.quit();

		// Title verify:

		// Get the actual page title
		String actualTitle = drive.getTitle();
		System.out.println("Actual Title: " + actualTitle);

		// Expected title
		String expectedTitle = "Manu K Shibu - Portfolio";

		// Verify the title
		if (actualTitle.equals(expectedTitle)) {
			System.out.println("Title verification passed: " + actualTitle);
		} else {
			System.out.println("Title verification failed. Expected: " + expectedTitle + ", but got: " + actualTitle);
		}

		// Close the browser
		drive.quit();
	}
}
