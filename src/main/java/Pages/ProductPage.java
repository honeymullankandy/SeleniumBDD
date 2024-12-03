package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.BaseUtil;
import org.openqa.selenium.JavascriptExecutor;
public class ProductPage extends BaseUtil {
	private WebDriver driver;
	private By menu = By.id("react-burger-menu-btn");
	private By allItem = By.id("inventory_sidebar_link");
	private By about = By.id("about_sidebar_link");
	private By Logout = By.id("logout_sidebar_link");
	private By cart = By.xpath("//a[@class='shopping_cart_link']");
//	private By cart =//div[@class='inventory_item_name']
			
	//div[text()='Sauce Labs Backpack']//following::button[text()='Add to cart'][1]

	public ProductPage(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	public String getProductssPageTitle() {
		return driver.getTitle();
	}

	public void clickOnMenu() {
		waitUntilElementVisible(menu).click(); // Wait for the element to be visible
	}

	public boolean isDisplayedMenu() {
		return waitUntilElementVisible(allItem).isDisplayed();

	}

	public boolean isDisplayedallItem() {
		return waitUntilElementVisible(about).isDisplayed();

	}

	public boolean isDisplayedabout() {
		return waitUntilElementVisible(Logout).isDisplayed();

	}
	public void addproduct(String ProductName) 
	
	{
		By addToCart=By.xpath("//div[text()='" + ProductName + "']//following::button[text()='Add to cart'][1]");
		waitUntilElementVisible(addToCart).click();
	}
	public boolean isCountisCorrect(String dynamicText) {
		By itemCount=By.xpath("//span[contains(@class, 'shopping_cart_badge') and text()='" + dynamicText + "']");
		return  waitUntilElementVisible(itemCount).isDisplayed();

	}
	public boolean isPriceCorrect(String price,String Product) {
		By itemCount=By.xpath("//div[text()='"+ Product+ "']//following::div[text()='"+price+ "']");
		return  waitUntilElementVisible(itemCount).isDisplayed();

	}
	public CartPage clickOncart() {	
		
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
	    jsExecutor.executeScript("arguments[0].click();", waitUntilElementVisible(cart));
		return new CartPage(driver);
		
	}
	}

