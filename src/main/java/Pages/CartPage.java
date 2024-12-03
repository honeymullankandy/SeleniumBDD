package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.BaseUtil;

public class CartPage extends BaseUtil {
	private WebDriver driver;

	// 1. By Locators: OR
	private By productName = By.xpath("//div[@class='inventory_item_name']");
	private By checkoutButton = By.id("checkout");
	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By postCode = By.id("postal-code");
	private By btnContinue = By.id("continue");
	private By btnFinish = By.id("finish");
	private By backHome = By.id("back-to-products");
	private By totalPrice = By.xpath("//div[@class='summary_total_label']");

	public CartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	public String getCartPageTitle() {
		return driver.getTitle();
	}

	public String getProduct() {

		return waitUntilElementVisible(productName).getText();

	}

	public void clickCheckout() {
		waitUntilElementVisible(checkoutButton).click(); // Wait for the element to be visible
	}

	public void fillForm(String fName, String lName, String postcode) {
		waitUntilElementVisible(firstName).sendKeys(fName);
		waitUntilElementVisible(lastName).sendKeys(lName);
		waitUntilElementVisible(postCode).sendKeys(postcode);
	}

	public void clickContinue() {
		waitUntilElementVisible(btnContinue).click(); // Wait for the element to be visible
	}

	public void clickFinish() {
		waitUntilElementVisible(btnFinish).click(); // Wait for the element to be visible
	}

	public void backHome() {
		waitUntilElementVisible(backHome).click(); // Wait for the element to be visible
	}

	public String getTotalPrice() {
		return waitUntilElementVisible(totalPrice).getText(); // Wait for the element to be visible
	}

}
