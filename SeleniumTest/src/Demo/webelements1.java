package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class webelements1 extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestBase ab = new TestBase();
		ab.initializeDriver("chrome");
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");
		driver.switchTo().frame("packageListFrame");
		List<WebElement>alllinks=driver.findElements(By.tagName("a"));
		
		for(WebElement mylink:alllinks){
			
			
			String xyz = (mylink.getText());
			
			if(xyz.equals("com.thoughtworks.selenium")){
				
				mylink.click();
			}
			
		}
		
	}

}
