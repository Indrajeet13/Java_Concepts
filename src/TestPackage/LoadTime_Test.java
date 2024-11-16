package TestPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class LoadTime_Test
{
	public static void main(String[] args) throws IOException {
        
        // Set the path of the chromedriver executable
        //System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        
        // Create a new instance of the ChromeDriver
        //ChromeOptions options = new ChromeOptions();
		//options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver();
        
        // Start the timer
        long startTime = System.currentTimeMillis();
        
        // Navigate to the URL of the web application
        driver.get("https://www.example.com");
        
        // Wait for the page to fully load
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        
        // Stop the timer
        long endTime = System.currentTimeMillis();
        
        // Calculate the page load time in seconds
        long pageLoadTime = (endTime - startTime) / 1000;
        
        // Print the page load time
        System.out.println("Page load time: " + pageLoadTime + " seconds");
        
        // Write the page load time to a file
        BufferedWriter writer = new BufferedWriter(new FileWriter("\"C:\\Users\\YADAIN\\OneDrive - Cyncly\\Desktop\\page_load_time.txt\""));
        writer.write("Page load time: " + pageLoadTime + " seconds");
        writer.close();
        
        // Close the browser
       // driver.quit();
    }
}
