package factory;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baseclass {

	static WebDriver driver;
	static Properties p;

	public static WebDriver initilizeBrowser() throws IOException {
			switch (getProperties().getProperty("browser").toLowerCase()) {
				case "chrome":
					driver = new ChromeDriver();
					break;
				case "firefox":
					driver = new FirefoxDriver();
					break;
				default:
					driver = new EdgeDriver();
			}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		return driver;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static Properties getProperties() throws IOException {
		String propertyFile = System.getProperty("user.dir") + "\\src\\test\\resources\\Config.properties";
		FileReader file = new FileReader(propertyFile);

		p = new Properties();
		p.load(file);
		return p;
	}

}
