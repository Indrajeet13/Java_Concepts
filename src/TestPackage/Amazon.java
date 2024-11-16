package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "\"D:\\Selenium\\Chrome Driver\\chromedriver.exe\"");

        // Create a new ChromeDriver
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);

        // Navigate to Amazon
        driver.get("https://www.amazon.com/");

        // Find the search box and enter a search query
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Selenium Book");

        // Click the search button
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();
        Thread.sleep(3000);
        
        // Click on the first search result
        WebElement firstResult = driver.findElement(By.xpath("(//div[@class='s-product-image-container aok-relative s-text-center s-image-overlay-grey s-padding-left-small s-padding-right-small puis-spacing-small s-height-equalized'])[2]"));
        firstResult.click();

        // Click the "Add to Cart" button
        WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
        addToCartButton.click();

        //Click on proceed to checkout button
        WebElement proceedToCheckOutButton = driver.findElement(By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input"));
        proceedToCheckOutButton.click();
        
        WebElement EmailEnter = driver.findElement(By.id("ap_email"));
        EmailEnter.sendKeys("abc@gmail.com");
        
        // Click the "Proceed to checkout" button
        WebElement proceedToCheckoutButton = driver.findElement(By.id("hlb-ptc-btn-native"));
        proceedToCheckoutButton.click();

        // Click the "Continue" button on the "Select a payment method" page
        WebElement continueButton = driver.findElement(By.xpath("//input[@aria-labelledby='continue-announce']"));
        continueButton.click();

        // Click the "Cash on Delivery" radio button
        WebElement cashOnDeliveryRadioButton = driver.findElement(By.xpath("//input[@id='delivery-cash']"));
        cashOnDeliveryRadioButton.click();

        // Close the browser
        //driver.quit();

	}

}
