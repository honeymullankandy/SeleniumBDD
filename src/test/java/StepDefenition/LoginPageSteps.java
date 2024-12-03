package StepDefenition;

import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.DriverFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Pages.CartPage;
import Pages.LoginPage;
import Pages.ProductPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPageSteps {

	private static String title;
	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	private ProductPage productPage;
	private CartPage cartPage;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("https://qa-challenge.codesubmit.io/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		title = loginPage.getLoginPageTitle();
		//System.out.println("Page title is: " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("user validate the error msg")
	public void user_validate_the_error_msg() {
		Assert.assertTrue("error msg not displayed for invalid user",loginPage.validateError());
	    
	}
	@Then("user validate the {string} is loaded correctly for {string}")
	public void user_validate_the_image_is_loaded_correctly(String image,String productName) {
		System.out.println("*******************");
		System.out.println(loginPage.getImage(productName));
		System.out.println("*******************");
		Assert.assertTrue(loginPage.getImage(productName).contains(image));
	}
	
	@When("user enters username {string}")
	public void user_enters_username(String username) {
		loginPage.enterUserName(username);
	}

	@When("user enters password {string}")
	public void user_enters_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("user clicks on Login button")
	public void user_clicks_on_login_button() {
		productPage = loginPage.clickOnLogin();
	}

	@When("user validate the menu of the product page")
	public void user_validate_the_menu_of_the_product_page() {
		productPage.clickOnMenu();
		Assert.assertTrue("menu not displayed", productPage.isDisplayedMenu());
		Assert.assertTrue("all item menu not disaplyed", productPage.isDisplayedallItem());
		Assert.assertTrue("about is not dispalyed", productPage.isDisplayedabout());

	}

	@When("user added the product {string} to cart")
	public void user_added_the_product_to_cart(String Productname) throws InterruptedException {
		productPage.addproduct(Productname);
	}

	@When("user the validated {string} amount {string} as price")
	public void user_the_validated_amount_as_price(String product, String price) {
		Assert.assertTrue("product count is wrong", productPage.isPriceCorrect(price,product));
	}

	@When("user validated the product count as {string} in basket")
	public void user_validated_the_product_count_as_in_basket(String price) {
		Assert.assertTrue("product count is wrong", productPage.isCountisCorrect(price));

	}

	@When("user is in cart page")
	public void user_is_in_cart_page() throws InterruptedException {
		cartPage = productPage.clickOncart();
		
	}

	@When("user validated product name as {string} in cart")
	public void user_validated_product_name_as_in_cart(String productName) throws InterruptedException {
		//System.out.println(cartPage.getProduct());
		Assert.assertEquals( "The values do not match!",cartPage.getProduct(), productName);
	}

	@When("user check out the product")
	public void user_check_out_the_product() {
		cartPage.clickCheckout();
		
	}
	@When("{string},{string},{string} as input")
	public void as_input(String fname, String lname, String postcode) {
		cartPage.fillForm(fname, lname, postcode);
	}
	@When("user click on continue")
	public void user_click_on_continue() {
		cartPage.clickContinue();
	}
	@When("user validated the ammount {string} as total")
	public void user_validated_the_ammount_as_total(String total) {
		Assert.assertTrue(cartPage.getTotalPrice().endsWith(total));
				

	}
	@Then("user click on Finish")
	public void user_click_on_finish() throws InterruptedException {
		Thread.sleep(2000);
		cartPage.clickFinish();
	}
	
	@Then("user click on back to home")
	public void user_click_on_back_to_home() {
		cartPage.backHome();
	}


}
