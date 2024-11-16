package TestPackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ComponentTest 
{
    public static void main(String[] args) {
        // Specify the path to the ChromeDriver executable (change it according to your system)
        System.setProperty("webdriver.chrome.driver", "D:\\Workspace Eclipse\\Test1\\chromedriver.exe");

        // Set up the Chrome WebDriver
        ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
        
        // Navigate to the web app
        String url = "https://presetcreator-qat.2020-platform.net/index.html?appContext=demometric&vendorPath=idealspaces-demometric-qat.2020-platform.net#setup";
        driver.get(url);

        // Wait for the background components to be present
        sleep(10000); // Wait for 10 seconds

        // Identify the background components and their functionality
        WebElement backgroundComponent1 = driver.findElement(By.cssSelector("your_background_component1_selector"));
        // Perform actions on the first background component
        String component1Text = backgroundComponent1.getText();
        System.out.println("Background Component 1 Text: " + component1Text);

        WebElement backgroundComponent2 = driver.findElement(By.cssSelector("your_background_component2_selector"));
        // Perform actions on the second background component
        String component2Text = backgroundComponent2.getText();
        System.out.println("Background Component 2 Text: " + component2Text);

        // Quit the WebDriver
        driver.quit();
    }
    private static void sleep(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	 }
}
