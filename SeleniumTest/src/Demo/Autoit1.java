package Demo;

import java.io.IOException;

import org.openqa.selenium.By;

public class Autoit1 extends TestBase{

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		TestBase ab = new TestBase();
		ab.initializeDriver("chrome");
		
		driver.get("http://the-internet.herokuapp.com/");
		driver.findElement(By.linkText("File Upload")).click();
		driver.findElement(By.id("file-upload")).click();
		
		//driver.findElement(By.xpath("//span[@id='postjob']")).click();
		
		/*driver.findElement(By.name("q3_name")).sendKeys("ABCD");
		driver.findElement(By.name("input_4")).sendKeys("Pass");
		driver.findElement(By.id("input_5")).click();*/
		
		
		Thread.sleep(5000);
		Runtime.getRuntime().exec("C:\\Users\\ADMIN\\Documents\\FileUpload.exe");
	
		driver.findElement(By.id("file-submit")).click();
		//ab.waituntil(driver.findElement(By.xpath("//strong[contains(text(),'Thank You!')]")));
	}

}
