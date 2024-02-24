import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Latest Selenium Jar
		 * Driver Initialization
		 * Latest Browser version installed on your machine
		 * Latest Browser Executable file
		 */
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		ChromeDriver driver = new ChromeDriver();
		//WebDriver driver2 = new ChromeDriver();
		driver.get("https://gmail.com/");
		driver.quit();
		
		

	}

}
