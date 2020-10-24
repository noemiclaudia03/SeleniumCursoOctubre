package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demo {
	static WebDriver driver;
	
	public static void main(String[] args) {
		ChromeOptions opcion = new ChromeOptions();
		opcion.addArguments("--incognito");
		opcion.addArguments("--star-maximized");
		
		System.setProperty("webdriver.chrome.driver", "\\C:\\Users\\NOEMI\\eclipse-workspace\\Proyecto1\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver(opcion);
		driver.get("https://twitter.com/");
		driver.close();
	}
}
