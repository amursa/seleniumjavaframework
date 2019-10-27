package HtmlUnitDriverTest;
import java.lang.reflect.Field;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

//import com.meterware.httpunit.WebClient;

public class htmlunitEmulateChrome {
	public static void main(String[] args) throws Exception {
		
	HtmlUnitDriver driver = new HtmlUnitDriver(BrowserVersion.CHROME);
	driver.get("http://seleniumhq.com");
	
	System.out.println("Title is: " + driver.getTitle());
	//How to confirm that headless driver ran as chrome driver?
	WebClient webClient = (WebClient) get(driver, "webClient");
	System.out.println("Browser version is : "+ webClient.getBrowserVersion());
	System.out.println("Is browser Chrome: "+ webClient.getBrowserVersion().isChrome());
	System.out.println("Is browser Firefox: "+ webClient.getBrowserVersion().isFirefox52());
	driver.quit();
	}
	private static Object get(Object object, String field) throws Exception{
		Field f = object.getClass().getDeclaredField(field);
		f.setAccessible(true);
		return f.get(object);
	}
	
}