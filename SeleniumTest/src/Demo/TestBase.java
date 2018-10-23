package Demo;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBase {
	public static WebDriver driver;
	public WebDriver initializeDriver(String browser){
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
		return driver;
		
	}
	
	public void setText(WebElement obj, String value){
		obj.sendKeys(value);
	}
	
	public void performClick(WebElement obj){
		obj.click();
	}
	
	public void selectDropdown(WebElement obj,String value,String valueType){
		Select s = new Select(obj);
		if(valueType.equals("text")){
			s.selectByVisibleText(value);
		}
		else if(valueType.equals("value")){
			s.selectByValue(value);
		}
		else if(valueType.equals("index")){
			s.selectByIndex(Integer.parseInt(value));
		}
	}
	
	public void takeSnapShot(String fileName) throws Exception{

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

                File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

            //Move image file to new destination

                File DestFile=new File("C:\\Users\\ADMIN\\workspace\\SeleniumTest\\screenshot\\"+ fileName + ".png");

                //Copy file at destination

               // FileUtils.copyFile(SrcFile, DestFile);
                FileHandler.copy(SrcFile, DestFile);

    }
	public void waituntil(WebElement obj){
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		wait.until(ExpectedConditions.visibilityOf(obj));
		
		
		
	}
}
	
