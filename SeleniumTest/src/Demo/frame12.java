package Demo;

import org.openqa.selenium.By;

public class frame12 extends TestBase{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestBase ab = new TestBase();
		ab.initializeDriver("chrome");
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html");	
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.switchTo().defaultContent();
		//driver.switchTo().frame("packageFrame");
		driver.switchTo().frame(1);
		driver.findElement(By.linkText("Selenium")).click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("DefaultSelenium")).click();
		driver.findElement(By.linkText("Selenium")).click();
		
		
	

	}

}
