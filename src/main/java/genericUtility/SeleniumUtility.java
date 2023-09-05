package genericUtility;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtility {

	private WebDriver driver;
	
	public SeleniumUtility(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterTextByJavascript(WebElement element, String text) {
		
		JavascriptExecutor jse = (JavascriptExecutor)this.driver;
		jse.executeScript("arguments[0].value='" + text +"'", element);
	}
	
	public void waitUntilVisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
