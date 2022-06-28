package practiceTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ToolsQA {
	
	WebDriver driver;
	@Test
	public void ToolsQA_Automation() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("firstName")).sendKeys("Ahmed");
		//driver.findElement(By.xpath("//input[@id='firstName']"));
		driver.findElement(By.id("lastName")).sendKeys("Khan");
		driver.findElement(By.id("userEmail")).sendKeys("name@example.com");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		driver.findElement(By.id("userNumber")).sendKeys("8881234566");
		driver.findElement(By.xpath("//div[@id='subjectsInput']")).sendKeys("Practice");
		
		

}
}
