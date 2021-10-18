package pageObjects;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class ShopToolsTestPage {

	WebDriver driver;

	public ShopToolsTestPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	final static String ITEM_CLASS = "noo-thumbnail-product hover-device";
	final static String COLOR_ID = "pa_color";
	final static String SIZE_ID = "pa_size";
	final static String ADD_TO_CART_CLASS = "single_add_to_cart_button button alt";
	final static String SUCCESSMESSAGE_CLASS = "woocommerce-message";
	public String SuccessMsg = "pink drop shoulder oversized t shirt” has been added to your cart.";
	final static String VIEWCART_LINK = "https://shop.demoqa.com/cart/";
	final static String PRODUCT_CLASS = "product-thumbnail";
	final static String PRICE_CLASS = "woocommerce-Price-amount amount";
	final static String PROCEED_TO_CHECKOUT = "checkout-button button alt wc-forward";
	final static String FORM_NAME = "checkout";
	final static String FIRST_NAME_ID = "billing_first_name";
	final static String LAST_NAME_ID = "billing_last_name";
	final static String COUNTRY_ID = "billing_country";
	final static String ADDRESS_ID = "billing_address_1";
	final static String CITY_ID = "billing_city";
	final static String POST_CODE_ID = "billing_postcode";
	final static String PHONE_NUMBER_ID = "billing_phone";
	final static String EMAIL_ID = "billing_email";
	final static String TERMS_ID = "terms";
	final static String PLACE_ORDER_ID= "place_order";
	final static String COMMAND_OK_CLASS = "woocommerce-thankyou-order-received";
	
	
	/* @FindBy */
	@FindBy(how = How.CLASS_NAME, using = ITEM_CLASS)
	public static WebElement itemClass;
	/* @FindBy */
	@FindBy(how = How.ID, using = COLOR_ID)
	public static WebElement colorId;
	/* @FindBy */
	@FindBy(how = How.ID, using = SIZE_ID)
	public static WebElement sizeId;
	/* @FindBy */
	@FindBy(how = How.CLASS_NAME, using = ADD_TO_CART_CLASS)
	public static WebElement addToCartClass;
	/* @FindBy */
	@FindBy(how = How.CLASS_NAME, using = SUCCESSMESSAGE_CLASS)
	public static WebElement successMessageClass;
	/* @FindBy */
	@FindBy(how = How.LINK_TEXT, using = VIEWCART_LINK)
	public static WebElement viewCartLink;
	/* @FindBy */
	@FindBy(how = How.CLASS_NAME, using = PRODUCT_CLASS)
	public static WebElement productClass;
	/* @FindBy */
	@FindBy(how = How.CLASS_NAME, using = PRICE_CLASS)
	public static WebElement priceClass;
	/* FindBY */
	@FindBy(how = How.CLASS_NAME, using = PROCEED_TO_CHECKOUT)
	public static WebElement proceedToCeckout;
	/* FindBy */
	@FindBy(how = How.NAME , using = FORM_NAME)
	public static WebElement formName;
	/* FindBy */ 
	@FindBy(how = How.ID, using = FIRST_NAME_ID)
	public static WebElement firsName;
	/* FindBy */ 
	@FindBy(how = How.ID, using = LAST_NAME_ID)
	public static WebElement lastName;
	/* FindBy */
	@FindBy(how = How.ID , using = COUNTRY_ID)
	public static WebElement countryId;
	/* FindBy */
	@FindBy(how = How.ID , using = ADDRESS_ID)
	public static WebElement addressId;
	/* FindBy */
	@FindBy(how = How.ID , using = CITY_ID)
	public static WebElement cityId;
	/* FindBy */
	@FindBy(how = How.ID , using = POST_CODE_ID)
	public static WebElement postCodeId;
	/* FindBy */
	@FindBy(how = How.ID , using = PHONE_NUMBER_ID)
	public static WebElement phoneNumberId;
	/* FindBy */
	@FindBy(how = How.ID , using = EMAIL_ID)
	public static WebElement emailId;	
	/* FindBy */
	@FindBy(how = How.ID , using = TERMS_ID)
	public static WebElement termsId;	
	/* FindBy */
	@FindBy(how = How.ID , using = PLACE_ORDER_ID)
	public static WebElement placeOrder;	
	/* FindBy */
	@FindBy(how = How.ID , using = COMMAND_OK_CLASS)
	public static WebElement commandOk;	

	
	/* Methods */
	public void selectItem() {
		itemClass.click();
	}

	public void selectColor() {
		Select selectElement = new Select(colorId);
		selectElement.selectByValue("pink");
	}

	public void selectSize() {
		Select selectElement = new Select(sizeId);
		selectElement.selectByValue("36");
	}

	public void clickButton(WebElement button) {
		button.click();
	}

	public void validateSuccessMessage(String msg, WebElement element) throws IOException, InterruptedException {
		String success_message = element.getText();
		Assert.assertTrue(success_message.contains(msg));
	}

	public void elementDisplayed(WebElement element) {
		Assert.assertTrue(element.isDisplayed());
	}
	
	public void enterString (String str, WebElement element) {
		element.sendKeys(str);
	}
	
	public void selectCountry() {
		Select selectElement = new Select(countryId);
		selectElement.selectByValue("FR");
	}


}
