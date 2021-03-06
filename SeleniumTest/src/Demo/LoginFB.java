package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginFB extends TestBase{

	public static void main(String[] args) throws InterruptedException {
		
		TestBase ab = new TestBase();
		ab.initializeDriver("chrome");
		driver.get("https://www.facebook.com/");		
		/*driver.findElement(By.name("firstname")).sendKeys("abcd");
		driver.findElement(By.name("lastname")).sendKeys("name");
		driver.findElement(By.name("reg_email__")).sendKeys("988789");
		driver.findElement(By.name("reg_email__")).sendKeys("qwerty");
		
		Select s = new Select(driver.findElement(By.id("month")));
		s.selectByVisibleText("Apr");
		Thread.sleep(2000);
		s.selectByValue("6");
		Thread.sleep(2000);
		s.selectByIndex(8);
		
		Select s1 = new Select(driver.findElement(By.id("year")));
		s1.selectByIndex(6);
		
		Select s2 =new Select(driver.findElement(By.id("day")));
		s2.selectByValue("8");*/
		ab.waituntil(driver.findElement(By.name("firstname")));
		ab.setText(driver.findElement(By.name("firstname")),"abcd");
		ab.setText(driver.findElement(By.name("lastname")),"name");
		ab.setText(driver.findElement(By.name("reg_email__")), "123456");
		ab.selectDropdown(driver.findElement(By.id("month")), "6","value");
		ab.selectDropdown(driver.findElement(By.id("month")), "Apr","text");
		ab.selectDropdown(driver.findElement(By.id("month")), "8","index");
		ab.selectDropdown(driver.findElement(By.id("year")), "6", "index");
		ab.selectDropdown(driver.findElement(By.id("day")), "8", "value");
		ab.performClick(driver.findElement(By.xpath("//input[@value='Log In']")));
	}

}
