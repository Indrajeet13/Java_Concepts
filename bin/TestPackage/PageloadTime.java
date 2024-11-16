package TestPackage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PageloadTime 
{
@SuppressWarnings("deprecation")
public static void getLoadTime() throws IOException 
{
        // Start the timer
        long startTime = System.currentTimeMillis();
       
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
        //driver.quit();
    }
}
