package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class LaunchBrowser {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browser = "chrome";
		
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Desktop\\New Folder\\chromedriver.exe");
			//interface obj= new Class();
			driver = new ChromeDriver();	//launch an instance of chrome browser
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Desktop\\New Folder\\geckodriver.exe");
			//interface obj= new Class();
			driver = new FirefoxDriver();	//launch an instance of chrome browser
		}
		else if(browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "C:\\Users\\ADMIN\\Desktop\\New Folder\\MicrosoftWebDriver.exe");
			//interface obj= new Class();
			driver = new InternetExplorerDriver();	//launch an instance of chrome browser
		}
		
		driver.get("http://newtours.demoaut.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println(driver.getPageSource());
		
		/*chrome		webdriver.chrome.driver		ChromeDriver
		firefox		webdriver.gecko.driver		FirefoxDriver
		IE			webdriver.ie.driver			InternetExplorerDriver*/
	}
	public void initializeDriver(String string) {
		// TODO Auto-generated method stub
		
	}

}
