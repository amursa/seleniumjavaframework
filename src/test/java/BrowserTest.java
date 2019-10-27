import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserTest {
	public static String browser;
	static WebDriver driver;
	//
	//setBrowser
	//setBrowserconfig
	//runTest
	public static void main(String[] args) {
		//setBrowser();
		PropertiesFile.readPropertiesFile();
		setBrowserConfig();
		runTest();
		PropertiesFile.writePropertiesFile();
	}
	/**
	 * Description
	 * @author=AlexMursa
	 */
	public static void setBrowser(){
		browser = "Firefox";
	}
	public static void setBrowserConfig(){
		
		String projectLocation = System.getProperty("user.dir");
		
		//This block will set configuration for Firefox browser(tested with browser 70)
		if(browser.contains("Firefox")) {	
		System.setProperty("webdriver.gecko.driver", projectLocation + "/drivers/geckodriver/geckodriver.exe");
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver = new FirefoxDriver();
		}
		//This block will set configuration for Chrome browser(tested with browser 78)
		if(browser.contains("Chrome")) {
		System.setProperty("webdriver.chrome.driver", projectLocation + "/drivers/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new MarionetterDriver();
		}
	}
	public static void runTest(){
		driver.get("http://seleniumhq.org");
		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		driver.close();
	}
}