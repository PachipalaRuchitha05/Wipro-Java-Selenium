
public class SeleniumTest {
	public static void main(Stringg[] args) {
		
		// Set the path to your browser driver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe"); 
        WebDriver driver = new ChromeDriver(); // Initialize the browser
        driver.get("https://www.google.com"); // Navigate to a website
        System.out.println("Title: " + driver.getTitle()); // Print the page title
        driver.quit(); // Close the browser
	}

}
