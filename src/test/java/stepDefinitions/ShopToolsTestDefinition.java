package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.shopToolsTest.automation.util.CommonMethods;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.ShopToolsTestPage;


public class ShopToolsTestDefinition extends CommonMethods{
	
	public WebDriver driver;
	private ShopToolsTestPage shopToolsTestPage = new ShopToolsTestPage(driver);
	
	
	@When("^I select an item$")
	public void iSelectAnItem() throws Throwable {
		PageFactory.initElements(driver, ShopToolsTestPage .class);
		shopToolsTestPage.selectItem();
	}

	@When("^I choose color$")
	public void iChooseColor() throws Throwable {
		shopToolsTestPage.selectColor();
	}

	@When("^I choose size$")
	public void iChooseSize() throws Throwable {
		shopToolsTestPage.selectSize();
	}

	@When("^I click Add to cart$")
	public void iClickAddToCart() throws Throwable {
		shopToolsTestPage.clickButton(ShopToolsTestPage.addToCartClass);
	}

	@Then("^I validate successfull message$")
	public void iValidateSuccessfullMessage() throws Throwable {
		shopToolsTestPage.validateSuccessMessage(shopToolsTestPage.SuccessMsg, ShopToolsTestPage.successMessageClass);
	}

	@When("^I click View cart$")
	public void iClickViewCart() throws Throwable {
		shopToolsTestPage.clickButton(ShopToolsTestPage.viewCartLink);
	}

	@Then("^I validate the addition od the item on the cart$")
	public void iValidateTheAdditionOdTheItemOnTheCart() throws Throwable {
		shopToolsTestPage.elementDisplayed(ShopToolsTestPage.productClass);
	}

	@Then("^I validate the price$")
	public void iValidateThePrice() throws Throwable {
		shopToolsTestPage.elementDisplayed(ShopToolsTestPage.priceClass);
	}

	@When("^I click Proceed to checkout$")
	public void iClickProceedToCheckout() throws Throwable {
		shopToolsTestPage.clickButton(ShopToolsTestPage.proceedToCeckout);
	}

	@Then("^I validate the payment form$")
	public void iValidateThePaymentForm() throws Throwable {
		shopToolsTestPage.elementDisplayed(ShopToolsTestPage.formName);
	}

	@When("^I print firstname$")
	public void i_print_firstname() throws Throwable {
		shopToolsTestPage.enterString("test", ShopToolsTestPage.firsName);
	}
	
	@When("^I print lastname$")
	public void i_print_lastname() throws Throwable {
		shopToolsTestPage.enterString("test", ShopToolsTestPage.lastName);
	}
	
	@When("^I select country$")
	public void iSelectCountry() throws Throwable {
		shopToolsTestPage.selectCountry();
	}

	@When("^I print address$")
	public void iPrintAddress() throws Throwable {
		shopToolsTestPage.enterString("France, av 3", ShopToolsTestPage.addressId);
		shopToolsTestPage.enterString("75001", ShopToolsTestPage.postCodeId);
		shopToolsTestPage.enterString("Paris", ShopToolsTestPage.cityId);
	}

	@When("^I print phone number$")
	public void iPrintPhoneNumber() throws Throwable {
		shopToolsTestPage.enterString("0000000", ShopToolsTestPage.phoneNumberId);
	}
	
	@When("^I print Email$")
	public void i_print_Email() throws Throwable {
		shopToolsTestPage.enterString("test@test.fr", ShopToolsTestPage.emailId);
	}
	
	@When("^I select I HAVE READ AND AGREE TO THE WEBSITE TERMS AND CONDITIONS$")
	public void iSelectIHAVEREADANDAGREETOTHEWEBSITETERMSANDCONDITIONS() throws Throwable {
		shopToolsTestPage.clickButton(ShopToolsTestPage.termsId);
	}

	@When("^I click PLACE ORDER$")
	public void iClickPLACEORDER() throws Throwable {
		shopToolsTestPage.clickButton(ShopToolsTestPage.placeOrder);
	}

	@Then("^I validate the commande$")
	public void iValidateTheCommande() throws Throwable {
		shopToolsTestPage.elementDisplayed(ShopToolsTestPage.commandOk);
	}



}
