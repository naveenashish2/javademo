package Demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class alert1 extends TestBase{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		TestBase ah = new TestBase();
		ah.initializeDriver("chrome");
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("ABCD");
		driver.findElement(By.name("submit")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		/*System.out.println(driver.switchTo().alert().getText());
		//driver.switchTo().alert().dismiss();		
		driver.switchTo().alert().accept();
		System.out.println(driver.switchTo().alert().getText());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();*/
		
		System.out.println(alt.getText());
		//driver.switchTo().alert().dismiss();		
		alt.accept();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
	}

}
