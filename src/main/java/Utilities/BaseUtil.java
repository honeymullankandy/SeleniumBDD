package Utilities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtil {
	private  WebDriver driver;
	private  WebDriverWait wait;
	private  final Logger logger = LogManager.getLogger(BaseUtil.class);
	public BaseUtil(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement waitUntilElementVisible(By element) {

		
			try {
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				return wait.until(ExpectedConditions.visibilityOf(driver.findElement(element)));
			} catch (Exception e) {
				logger.error("Failed to wait until element is visible: " + element, e);
	            return null;
			}
		
	}
	
}
