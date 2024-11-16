package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;



public class Formy 
{

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "D:\\Workspace Eclipse\\Test1\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get("https://formy-project.herokuapp.com/form");
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.sendKeys("FirstABC");
		
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.sendKeys("LastXYZ");
        
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        jobTitle.sendKeys("QA Engineer");
        
        driver.findElement(By.id("radio-button-2")).click();
        
        driver.findElement(By.id("checkbox-1")).click();
        
        Select se = new Select(driver.findElement(By.xpath("//*[@id=\"select-menu\"]")));
        se.selectByValue("1");
 
        WebElement dateWidget = driver.findElement(By.id("datepicker"));
        dateWidget.clear();
        dateWidget.sendKeys("8/12/2022"); 
        Thread.sleep(5000);
        
        // Javascript funtion for date picker
        //((JavascriptExecutor)driver).executeScript("document.getElementById('datepicker').setAttribute('value','8/12/2022')");
        
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class=\"btn btn-lg btn-primary\"]")).click();
        
        // Close the browser
       // driver.quit();
           
	}
}
