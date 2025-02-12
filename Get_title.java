package packgm;

import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver drive = new ChromeDriver();
		drive.get("https://www.amazon.in/");

		String actaultitle = drive.getTitle();
		// System.out.println(actaultitle);
		String Expectedtitle = "amazon.in";
		if (actaultitle.equalsIgnoreCase(Expectedtitle)) {
			System.out.println("Title is correct:");
		} else {
			System.out.println("Title is incorrect:");
		}
		drive.quit();

	}

}
