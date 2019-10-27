package HtmlUnitDriverTest;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class htmlunitDriverTest {
	public static void main(String[] args) {
		
		HtmlUnitDriver driver = new HtmlUnitDriver();
		driver.get("http://seleniumhq.com");
		System.out.println("Title is: " +driver.getTitle());
		driver.quit();
	}
}