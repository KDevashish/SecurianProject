package genericUtility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseClass {

	public WebDriver driver;
	public ExcelUtility excelutil = new ExcelUtility();
	
	@BeforeClass
	public void launchBrowserAndOpenApp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.securian.com/insights-tools/retirement-calculator.html");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	
}
