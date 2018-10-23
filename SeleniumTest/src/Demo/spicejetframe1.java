package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class spicejetframe1 extends TestBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestBase ac = new TestBase();
		ac.initializeDriver("chrome");
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("(//a[@value='DEL'])[2]")).click();
		
		
	}

}
