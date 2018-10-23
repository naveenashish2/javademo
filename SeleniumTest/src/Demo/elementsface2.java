package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class elementsface2 extends TestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		TestBase ab = new TestBase();
		ab.initializeDriver("chrome");
		driver.get("https://www.facebook.com/");
		
		List<WebElement> editBoxes= driver.findElements(By.className("inputtext"));
		for(WebElement editB:editBoxes){
			//System.out.println(editBoxes.size());
			System.out.println(editB.getAttribute("name"));
		}
	}

}
