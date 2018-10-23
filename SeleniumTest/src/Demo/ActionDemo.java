package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo extends TestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestBase ab = new TestBase();
		ab.initializeDriver("chrome");
		driver.get("https://www.facebook.com/");
		
		Actions builder = new Actions(driver);
		Action act = builder	
						.moveToElement(driver.findElement(By.partialLinkText("Why do I need to")))
						/*.moveToElement(driver.findElement(By.name("firstname")))
						.click()
						.keyDown(driver.findElement(By.name("firstname")), Keys.SHIFT)
						.sendKeys(driver.findElement(By.name("firstname")), "hello")
						.keyUp(driver.findElement(By.name("firstname")), Keys.SHIFT)
						.doubleClick(driver.findElement(By.name("firstname")))
						.contextClick(driver.findElement(By.name("firstname")))*/
						.build();
		act.perform();

	}

}
