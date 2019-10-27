import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
		
	}
	static Properties prop = new Properties();
	
	public static void readPropertiesFile() {		
		try {
			InputStream input = new FileInputStream("C:\\Java_Projects\\SeleniumJavaFramework\\src\\test\\java\\config.properties");
			
			prop.load(input);	
			System.out.println(prop.getProperty("browser"));
			BrowserTest.browser = prop.getProperty("browser");
			System.out.println("We are reading property from browser " + BrowserTest.browser);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void writePropertiesFile() {
		try {
			OutputStream output = new FileOutputStream("C:\\Java_Projects\\SeleniumJavaFramework\\src\\test\\java\\config.properties");
			prop.setProperty("browser", "Chrome");
			prop.setProperty("result","pass");
			prop.store(output, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}