package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.BaseUtil;

public class LoginPage extends BaseUtil {
	

		private WebDriver driver;

		// 1. By Locators: OR
		private By userName = By.id("user-name");
		private By password = By.id("password");
		private By signInButton = By.id("login-button");
		private By errorText = By.xpath("//h3[contains(text(), ' locked out.')]");
		
	

		// 2. Constructor of the page class:
		public LoginPage(WebDriver driver) {
			super(driver);
			this.driver = driver;
		}

		// 3. page actions: features(behavior) of the page the form of methods:

		public String getLoginPageTitle() {
			return driver.getTitle();
		}


		public void enterUserName(String username) {
			waitUntilElementVisible(userName).sendKeys(username);
			
		}
		public boolean validateError() {
			return waitUntilElementVisible(errorText).isDisplayed();
			
		}

		public void enterPassword(String pwd) {
			waitUntilElementVisible(password).sendKeys(pwd);
			
		}

		public ProductPage clickOnLogin() {
			waitUntilElementVisible(signInButton).click();
			return new ProductPage(driver);
		}
		public String  getImage(String productName) {
			By imageTag=By.xpath("//img[@alt='" + productName + "']");
			return waitUntilElementVisible(imageTag).getAttribute("src");
			
		}

	
	}



