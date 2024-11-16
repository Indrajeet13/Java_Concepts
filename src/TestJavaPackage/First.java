package TestJavaPackage;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import TestPackage.PageloadTime;
import io.github.bonigarcia.wdm.WebDriverManager;

public class First extends PageloadTime
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		PageloadTime plt = new PageloadTime();
	
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
		driver.get("https://apps-canary.2020.net/launcher/index.html");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40)); 
		driver.findElement(By.id("env-qat")).click();
		driver.findElement(By.id("launch-option-customer")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("app-2020_metric")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("app-preset_creator")).click();
		
		Set<String> pcid = driver.getWindowHandles();
		Iterator<String> iterator = pcid.iterator();
		String parentId = iterator.next();
		//System.out.println(parentId);
		String childId = iterator.next();
		//System.out.println(parentId);
		Thread.sleep(10000);
		driver.switchTo().window(childId);
		
		//driver.switchTo().frame(0);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.findElement(By.id("email")).sendKeys("iactests@dispostable.com");
		driver.findElement(By.id("password")).sendKeys("2020Tech!!");
		
		driver.findElement(By.xpath("//*[@id='r-main']/div/section/form/button")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("search-text")).sendKeys("IY");
		driver.findElement(By.id("search-btn")).click();
		
	}

	
}
