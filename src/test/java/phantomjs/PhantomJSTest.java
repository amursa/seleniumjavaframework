package phantomjs;

import org.openqa.selenium.phantomjs.PhantomJSDriver;

public class PhantomJSTest {
	public static void main(String[] args) {
		System.setProperty("phantomjs.binary.path", "C:\\Java_Projects\\SeleniumJavaFramework\\lib\\phantomjs.exe");
		PhantomJSDriver driver  = new PhantomJSDriver();
		
		
		//test
		driver.get("http://seleniumhq.org");
		System.out.println("Totle of web page is: " + driver.getTitle());
		driver.quit();
	}
}
