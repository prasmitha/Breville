package website.pagefactory;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.aventstack.extentreports.Status;
import website.base.BaseTest;
import website.generic.GenericUtility;

public class MyBreville extends BaseTest {

  //private static MyBreville mybreville = null;

  @FindBy(id = "js-my-breville-label")
  private WebElement mybrevilleMenu;

  @FindBy(xpath = "(//a[contains(@href,'personal')])[1]")
  private WebElement personalDetails;

  @FindBy(css = "button[class='editUserDetails btn-save' ]")
  private WebElement editButtonInPersonalDetails;

  @FindBy(css = "button[class*='saveUserDetails' ]")
  private WebElement savePersonalDetails;

  @FindBy(id = "phoneNumber")
  private WebElement phonenumber_personalDetails;

  @FindBy(xpath = "//p[contains(@class,'phoneText')]")
  private WebElement phoneNumberText_PersonalDetails;

  @FindBy(xpath = "(//a[contains(@class,'breville')])[1]")
  private WebElement myBrevilleHubPage;

  @FindBy(xpath = "(//a[contains(@href, '#orders')])[3]")
  private WebElement orders_hubpage;

  @FindBy(xpath = "(//a[contains(@href, '#subscriptions')])[3]")
  private WebElement subscriptions_hubpage;

  @FindBy(xpath = "(//a[contains(@href, '#personal')])[3]")
  private WebElement personal_hubpage;

  @FindBy(xpath = "(//img[contains(@alt,'Create Support Ticket')])[3]")
  private WebElement createSupportTicket_hubpage;

  @FindBy(xpath = "(//img[contains(@alt,'Update Support Ticket')])[3]")
  private WebElement updateSupportTicket_hubpage;

  /*
	 * Subscription page
	 */
  @FindBy(xpath = "(//div[contains(@id, 'subscriptionsData')]/div//span[contains(@class,'order-model-id')])[1]")
  private WebElement firstSubscriptionModelNumber;

  @FindBy(xpath = "(//div[contains(@id, 'subscriptionsData')]//div[contains(@class,'order-status')])[2]//span[2]")
  private WebElement nextDeliveryDateOfSubscriptions;

  @FindBy(xpath = "(//div[contains(@class,'quantityEveryEdited')]//img)[1]")
  private WebElement editSubscriptionplanDetails;

  @FindBy(css = "span[class*='quantityText-0']")
  private WebElement quanityValue;

  @FindBy(css = "span[class*='frequencyText-0']")
  private WebElement planValue;

  @FindBy(id = "quantity-0")
  private WebElement quantityDropdown;

  @FindBy(id = "item-subscription-0")
  private WebElement subscriptionDropdown;

  @FindBy(xpath = "(//button[contains(@class,'save-subscriptionDetail')])[1]")
  private WebElement saveSubscriptionButton;

  @FindBy(xpath = "(//div[contains(@class,'addressSave')])[1]//span[2]")
  private WebElement shippingAddr_value;

  @FindBy(name = "s_Address_Line_1")
  private WebElement shippingAddr_Addr1;

  @FindBy(xpath = "(//button[contains(@class,'postShippingAddress')])[1]")
  private WebElement saveShippingAddress;

  @FindBy(xpath = "(//div[contains(@class,'open')]//span)[1]")
  private WebElement firstOrderNumber_OrdersPage;

  @FindBy(xpath = "(//a[contains(@class,'editAddress')])[1]")
  private WebElement editButtonForShippingAddress;

  @FindBy(xpath = "(//button[contains(@class,'cancelSubBtn')])[1]")
  private WebElement cancelButton_subscription;

  @FindBy(css = "button[class*='canceItBtn']")
  private WebElement cancelButton_ConfirmationPopUp;

  @FindBy(xpath = "(//span[contains(text(),'Cancelled')])[2]")
  private WebElement cancelledStatus;

  @FindBy(css = "div[class*='no-orders-data']")
  private WebElement noOrdersMsg;

  @FindBy(xpath = "(//button[contains(@class,'logout')])[1]")
  private WebElement logoutButton;

  @FindBy(xpath = "//a[contains(@href,'home')]")
  private WebElement brevilleHomeLink;
  
  // Multiple Address Xpaths
  
  @FindBy(css = "a[class*='addAnotherShippingAddr']")
  private WebElement addAnotherShippingAddrLink;
  
  // Alternate Address One
  
  @FindBy(id = "Address1_1")
  private WebElement altAddrOneAddressLine1;
  
  @FindBy(id = "City_1")
  private WebElement altAddrOneCity;
  
  @FindBy(id = "Zip_1")
  private WebElement altAddrOneZip;
  
  @FindBy(id = "State_1")
  private WebElement altAddrOneState;
  
  @FindBy(xpath = "//div[contains(@class,'saveDetails_1')]/a")
  private WebElement altAddrOneSaveLink;
  
  
//Alternate Address Two
  
 @FindBy(id = "Address1_2")
 private WebElement altAddrTwoAddressLine1;
 
 @FindBy(id = "City_2")
 private WebElement altAddrTwoCity;
 
 @FindBy(id = "Zip_2")
 private WebElement altAddrTwoZip;
 
 @FindBy(id = "State_2")
 private WebElement altAddrTwoState;
  
 @FindBy(xpath = "//div[contains(@class,'saveDetails_2')]/a")
 private WebElement altAddrTwoSaveLink;
 
 // Get Order Details
 
 @FindBy(xpath = "(//div[contains(@class,'col-md-2 col-xs-3 text-right no-gutters')]/span)[1]")
 private WebElement firstLineItemPrice;
 
 @FindBy(xpath = "(//div[contains(@class,'col-md-2 col-xs-3 text-right no-gutters')]/span)[2]")
 private WebElement secondLineItemPrice;
 
 @FindBy(xpath = "(//div[contains(@class,'col-md-2 col-xs-4 text-right no-gutters pb-xs-1')])[1]")
 private WebElement orderTaxes;
 
 @FindBy(xpath = "(//div[contains(@class,'col-md-2 col-xs-4 text-right no-gutters pb-xs-1')])[3]")
 private WebElement orderTotal;
 
 @FindBy(xpath = "(//div[@class='col-xs-12 col-grey fontsize-16 pt-xs-2 no-gutters c-order-add']//span)[2]")
 private WebElement streetAddress;
 
 @FindBy(xpath = "(//div[@class='col-xs-12 col-grey fontsize-16 pt-xs-2 no-gutters c-order-add']//span)[3]")
 private WebElement city_State_Zipcode;
 
 @FindBy(xpath = "(//div[@class = 'col-xs-12 col-grey fontsize-16 pt-xs-1 no-gutters'])[1]")
 private WebElement paymentMethod; 


 	private String subscriptionQuantity;
	private String subscriptionPrice;
	  private String fgQuantity;
	  private String fgPrice;
	  private String paymentMethodType;
	  private String orderTax;
	  private String orderTotalAmount;
	  private String shippingAddrSt;
	  private String shippingAddrcity;
	  private String shippingAddrZipCode;
  
  
  
  

  public MyBreville() {
    PageFactory.initElements(driver, this);
  }


  public boolean verifyNoOrdersDisplayedMsg() {
    return verifyElementIsDisplayed(noOrdersMsg);
  }

  public void clickMyBrevilleMenu() {
    waitForElementToBeClickable(mybrevilleMenu);
    clickElementUsingJavaScriptExecutor(mybrevilleMenu);
    logger.log(Status.INFO, "Clicked on My Breville menu on home page.");
  }

  public void clickPersonalDetails() {
    waitForElementToBeClickable(personalDetails);
    personalDetails.click();
    logger.log(Status.INFO, "Clicked on Personal Details option");
  }

  public void clickEditPersonalDetails() {
    waitForElementToBeClickable(editButtonInPersonalDetails);
    editButtonInPersonalDetails.click();
    logger.log(Status.INFO, "clicked on Edit button in personal details");
  }

  public void ClickSaveOption_PersonalDetails() {
    waitForElementToBeClickable(savePersonalDetails);
    hardWait(2000);
    savePersonalDetails.click();
    while (transactionpage.verifyLoaderImage()) {
      hardWait(2000);
    }
    waitForElementToBeClickable(editButtonInPersonalDetails);
    hardWait(3000);
    logger.log(Status.INFO, "Waiting for few seconds to reflect the changes");

  }

  public void updatePhoneNumber_PersonalDetails() {
    waitForElementToBeClickable(phonenumber_personalDetails);
    phonenumber_personalDetails.clear();
    phonenumber_personalDetails.sendKeys(GenericUtility.generateRandomPhoneNumber());
  }

  public String getPhoneNumber_personalDetails() {
    hardWait(4000);
    waitForElementToBeClickable(phoneNumberText_PersonalDetails);
    return phoneNumberText_PersonalDetails.getText();
  }

  public void clickOnBrevilleHubPage() {
    waitForElementToBeClickable(myBrevilleHubPage);
    myBrevilleHubPage.click();
    logger.log(Status.INFO, "Clicked on hub page from the menu drop down");
  }

  public boolean verifyOrders_hubpage() {
    waitForElementToBeVisible(orders_hubpage);
    boolean flag = isElementPresent(orders_hubpage);
    return flag;
  }

  public void clickOnOrders_hubpage() {
    waitForElementToBeClickable(orders_hubpage);
    orders_hubpage.click();
  }

  public boolean verifySubscriptions_hubpage() {
    waitForElementToBeVisible(subscriptions_hubpage);
    boolean flag = isElementPresent(subscriptions_hubpage);
    return flag;
  }

  public void clickOnSubscription_hubpage() {
    waitForElementToBeClickable(subscriptions_hubpage);
    subscriptions_hubpage.click();
    logger.log(Status.INFO, "Clicked on the subscriptions on the hub page");
  }

  public boolean verifyPersonalDetails_hubpage() {
    waitForElementToBeVisible(personal_hubpage);
    boolean flag = isElementPresent(personal_hubpage);
    return flag;
  }

  public boolean verifyCreateSupportTicket_hubPage() {
    waitForElementToBeVisible(createSupportTicket_hubpage);
    boolean flag = isElementPresent(createSupportTicket_hubpage);
    logger.log(Status.INFO, "Is Create support ticket hyperlink displayed in the hub page: " + flag);
    return flag;
  }

  public boolean verifyUpdateSupportTicket_hubpage() {
    waitForElementToBeVisible(updateSupportTicket_hubpage);
    boolean flag = isElementPresent(updateSupportTicket_hubpage);
    logger.log(Status.INFO, "Is Update support ticket hyperlink displayed in the hub page: " + flag);
    return flag;
  }

  public boolean verifyLinksInHubpage() {
    if (verifyOrders_hubpage() && verifySubscriptions_hubpage() && verifyPersonalDetails_hubpage() && verifyCreateSupportTicket_hubPage() && verifyUpdateSupportTicket_hubpage()) return true;
    else return false;
  }

  public String getFirstSubscriptionModelNumber() {
    waitForElementToBeVisible(firstSubscriptionModelNumber);
    String value = firstSubscriptionModelNumber.getText();
    logger.log(Status.INFO, "The Subscription product model number is: " + value);
    return value;
  }

  public String getNextDeliveryDateOfSubscription() {
    waitForElementToBeVisible(nextDeliveryDateOfSubscriptions);
    String value = nextDeliveryDateOfSubscriptions.getText();
    logger.log(Status.INFO, "The Subscription product next delivery date is: " + value);
    return value;
  }

  public boolean verifyQuantityValue() {
    return verifyElementIsDisplayed(quanityValue);
  }

  public String getQuantityValue() {
    String value = "";
    if (verifyQuantityValue()) {
      value = quanityValue.getText();
    }
    return value;
  }

  public String getPlanValue() {
    waitForElementToBeVisible(planValue);
    String value = planValue.getText();
    logger.log(Status.INFO, "The Subscription plan value is: " + value);
    System.out.println("The Subscription plan value is: " + value);
    return value;
  }

  public void clickOnEditSubscription() {
    waitForElementToBeClickable(editSubscriptionplanDetails);
    editSubscriptionplanDetails.click();
    logger.log(Status.INFO, "Clicked on the edit button to update the quantity & plan of the subscription.");
  }

  public void updateSubscriptionQty(String value) {
    waitForElementToBeClickable(quantityDropdown);
    Select select = new Select(quantityDropdown);
    logger.log(Status.INFO, "Clicked on the quantity drop down to update the quantity of the subscription.");
    List < WebElement > options = select.getOptions();
    for (WebElement webElement: options) {
      String option = webElement.getText();
      if (!value.equalsIgnoreCase(option)) {
        select.selectByVisibleText(option);
        break;
      }
    }
  }

  public void updateSubscriptionPlan(String value) {
    waitForElementToBeClickable(subscriptionDropdown);
    Select select = new Select(subscriptionDropdown);
    logger.log(Status.INFO, "Clicked on Subscription drop down");
    System.out.println("Clicked on Subscription drop down");
    List < WebElement > options = select.getOptions();
    for (WebElement webElement: options) {
      String option = webElement.getText();
      logger.log(Status.INFO, "Option value is: " + option);
      System.out.println("Option value is: " + option);
      if (!value.equalsIgnoreCase(option)) {
        select.selectByVisibleText(option);
        break;
      }
    }
  }

  public void saveSubscriptionDetail() {
    waitForElementToBeClickable(saveSubscriptionButton);
    saveSubscriptionButton.click();
    logger.log(Status.INFO, "Clicked on the save subscription button to save the changes.");
    while (transactionpage.verifyLoaderImage()) {
      hardWait(2000);
    }
  }

  public void clickEditButtonForSubscriptionShippingAddr() {
    waitForElementToBeClickable(editButtonForShippingAddress);
    editButtonForShippingAddress.click();
    logger.log(Status.INFO, "Click on edit shipping address button for the subscription product");
  }

  public boolean verifyShippingAddr_value() {
    return verifyElementIsDisplayed(shippingAddr_value);
  }

  public String getShippingAddr_Addr1_Value() {
    String value = "";
    if (verifyShippingAddr_value()) {
      waitForElementToBeClickable(shippingAddr_value);
      value = shippingAddr_value.getText().split(",")[0].trim();
    }
    return value;
  }

  public void updateShippingAddress_subscriptions(String str) {
    waitForElementToBeClickable(shippingAddr_Addr1);
    shippingAddr_Addr1.clear();
    shippingAddr_Addr1.sendKeys(str);
    waitForElementToBeClickable(saveShippingAddress);
    saveShippingAddress.click();
    logger.log(Status.INFO, "Clicked on the save button to save the changes.");
    while (transactionpage.verifyLoaderImage()) {
      hardWait(2000);
    }
  }

  public boolean verifyQuantityAndPlanUpdate() {
    while (transactionpage.verifyLoaderImage()) {
      hardWait(2000);
    }
    waitForElementToBeClickable(editSubscriptionplanDetails);
    String qty = getQuantityValue();
    String value = "";
    clickOnEditSubscription();
    updateSubscriptionQty(qty);
    saveSubscriptionDetail();
    hardWait(5000);
    int count = 0;
    while (count < 3) {
      value = getQuantityValue();
      if ("" != value && !qty.equalsIgnoreCase(value)) break;
      hardWait(2000);
      count++;
    }
    boolean quantity = false;
    if (!qty.equalsIgnoreCase(value)) {
      logger.log(Status.INFO, "The subscription product quantity before and after update is: " + qty + " & " + value);
      quantity = true;
    }
    return quantity;

  }

  public boolean verifyUpdateShippingAddr(String str) {
    while (transactionpage.verifyLoaderImage()) {
      hardWait(2000);
    }
    waitForElementToBeClickable(editButtonForShippingAddress);
    String value = getShippingAddr_Addr1_Value();
    waitForElementToBeClickable(editButtonForShippingAddress);
    hardWait(2000);
    clickElementUsingJavaScriptExecutor(editButtonForShippingAddress);
    logger.log(Status.INFO, "Clicked on the edit button to update the shipping address of the subscription.");
    updateShippingAddress_subscriptions(str);
    hardWait(5000);
    int count = 0;
    String address = "";
    while (count < 3) {
      address = getShippingAddr_Addr1_Value();
      if ("" != address && !value.equalsIgnoreCase(address)) break;
      hardWait(2000);
      count++;
    }
    if (!value.equalsIgnoreCase(address)) return true;
    return false;
  }

  public String getFirstOrderNumber_OrdersPage() {
    String orderNumber = "";
    hardWait(5000);
    waitForElementToBeVisible(firstOrderNumber_OrdersPage, 90);
    if(verifyElementIsDisplayed(firstOrderNumber_OrdersPage)) {
        String value = firstOrderNumber_OrdersPage.getText();
        String words[] = value.split("\\.");
        orderNumber = words[words.length-1].trim();
    }    return orderNumber;
  }

  public boolean verifyCancelSubscription() {
    waitForElementToBeClickable(cancelButton_subscription);
    cancelButton_subscription.click();
    logger.log(Status.INFO, "Clicked on the cancel button in the subscription page to cancel the subscription.");
    waitForElementToBeClickable(cancelButton_ConfirmationPopUp);
    cancelButton_ConfirmationPopUp.click();
    while (transactionpage.verifyLoaderImage()) {
      hardWait(2000);
    }
    waitForElementToBeClickable(cancelledStatus);
    if (verifyCancelledStatus()) return true;
    return false;

  }

  public boolean verifyCancelledStatus() {
    try {
      if (cancelledStatus.isDisplayed()) return true;
    } catch(Exception e) {
      logger.log(Status.ERROR, "Exception occured while verifiying the Cancelled Status");
    }
    return false;
  }

  public void logout() {
    waitForElementToBeClickable(brevilleHomeLink);
    brevilleHomeLink.click();
    logger.log(Status.INFO, "Clicked on My Breville home link");
    waitForElementToBeClickable(mybrevilleMenu);
    mybrevilleMenu.click();
    logger.log(Status.INFO, "Clicked on My Breville Menu");
    waitForElementToBeClickable(logoutButton);
    logoutButton.click();
    logger.log(Status.INFO, "Clicked on Logout Button");
    hardWait(8000);
  }

  public boolean verifyMyBrevilleMenu() {
    return verifyElementIsDisplayed(mybrevilleMenu);
  }
  
  public boolean verifyAddAnotherShippingAddrLink() {
	  return verifyElementIsDisplayed(addAnotherShippingAddrLink);
  }
  
  public void clickOnAddAnotherShippingAddrLink() {
	  addAnotherShippingAddrLink.click();
	  logger.log(Status.INFO, "Clicked on Add Another Shipping Addr Link");
  }
  
  public String getSubscriptionQuantity() {
		return subscriptionQuantity;
	}


	public void setSubscriptionQuantity(String subscriptionQuantity) {
		this.subscriptionQuantity = subscriptionQuantity;
	}


	public String getSubscriptionPrice() {
		return subscriptionPrice;
	}


	public void setSubscriptionPrice(String subscriptionPrice) {
		this.subscriptionPrice = subscriptionPrice;
	}


	public String getFgQuantity() {
		return fgQuantity;
	}


	public void setFgQuantity(String fgQuantity) {
		this.fgQuantity = fgQuantity;
	}


	public String getFgPrice() {
		return fgPrice;
	}


	public void setFgPrice(String fgPrice) {
		this.fgPrice = fgPrice;
	}


	public String getPaymentMethodType() {
		return paymentMethodType;
	}


	public void setPaymentMethodType(String paymentMethodType) {
		this.paymentMethodType = paymentMethodType;
	}


	public String getOrderTax() {
		return orderTax;
	}


	public void setOrderTax(String orderTax) {
		this.orderTax = orderTax;
	}


	public String getOrderTotalAmount() {
		return orderTotalAmount;
	}


	public void setOrderTotalAmount(String orderTotalAmount) {
		this.orderTotalAmount = orderTotalAmount;
	}


	public String getShippingAddrSt() {
		return shippingAddrSt;
	}


	public void setShippingAddrSt(String shippingAddrSt) {
		this.shippingAddrSt = shippingAddrSt;
	}


	public String getShippingAddrcity() {
		return shippingAddrcity;
	}


	public void setShippingAddrcity(String shippingAddrcity) {
		this.shippingAddrcity = shippingAddrcity;
	}


	public String getShippingAddrZipCode() {
		return shippingAddrZipCode;
	}


	public void setShippingAddrZipCode(String shippingAddrZipCode) {
		this.shippingAddrZipCode = shippingAddrZipCode;
	}
  // Get Order Details
  
  public void setOrderDetails() {
	  waitForElementToBeVisible(firstLineItemPrice, 30);
	  String firstLineItemValue = firstLineItemPrice.getText();
	  String values[] = firstLineItemValue.replaceAll("\\s+", "").split("x");
	  String price = values[values.length-1].indexOf(".") < 0 ? values[values.length-1] : values[values.length-1].replaceAll("0*$", "")
			  .replaceAll("\\.$", "").replaceAll("[^A-Za-z0-9.]", "");
	  if(Integer.parseInt(values[0])== 1) {
		  setSubscriptionQuantity(values[0]);
		  setSubscriptionPrice(price);
	  }else {
		  setFgQuantity(values[0]);
		  setFgPrice(price);
	  }	
	  String secondLineItemValue = secondLineItemPrice.getText();
	  String val[] = secondLineItemValue.replaceAll("\\s+", "").split("x");
	  String amount = val[val.length-1].indexOf(".") < 0 ? val[val.length-1] : val[val.length-1].replaceAll("0*$", "")
			  .replaceAll("\\.$", "").replaceAll("[^A-Za-z0-9.]", "");
	  if(Integer.parseInt(val[0])== 1) {
		  setSubscriptionQuantity(val[0]);
		  setSubscriptionPrice(amount);
	  }else {
		  setFgQuantity(val[0]);
		  setFgPrice(amount);
	  }
	  setShippingAddrSt(streetAddress.getText().replaceAll("[^A-Za-z0-9]", ""));
	  setShippingAddrcity(city_State_Zipcode.getText().replaceAll("\\s+", "").split(",")[0]);
	  setShippingAddrZipCode(city_State_Zipcode.getText().replaceAll("\\s+", "").split(",")[1].replaceAll("[^0-9]", ""));
	  setOrderTax(orderTaxes.getText().replaceAll("[^A-Za-z0-9.]", ""));
	  setOrderTotalAmount(orderTotal.getText().replaceAll("[^A-Za-z0-9.]", ""));
	  setPaymentMethodType(paymentMethod.getText());
	  /*System.out.println("-------------------------------------------------------------------");
	  System.out.println("First Line Item Price: "+firstLineItemPrice.getText());
	  System.out.println("Second Line Item Price: "+secondLineItemPrice.getText());
	  System.out.println("Order Taxes: "+orderTaxes.getText());
	  System.out.println("Order Total: "+orderTotal.getText());
	  System.out.println("Payment Method: "+paymentMethod.getText());
	  System.out.println("Payment Method: "+streetAddress.getText());
	  System.out.println("Payment Method: "+city_State_Zipcode.getText());
	  System.out.println("-------------------------------------------------------------------");	  
	  System.out.println("-------------------------------------------------------------------");
	  System.out.println("Subscription Quantity: "+getSubscriptionQuantity());
	  System.out.println("Subscription Price: "+getSubscriptionPrice());
	  System.out.println("FG Quantity: "+getFgQuantity());
	  System.out.println("FG Price: "+getFgPrice());
	  System.out.println("Order Tax: "+getOrderTax());
	  System.out.println("Order Total: "+getOrderTotalAmount());
	  System.out.println("Payment Method Type: "+getPaymentMethodType());
	  System.out.println("Shipping Address Street: "+getShippingAddrSt());
	  System.out.println("Shipping Address City: "+getShippingAddrcity());
	  System.out.println("Shipping Address zip Code: "+getShippingAddrZipCode());
	  System.out.println("-------------------------------------------------------------------");*/
	  
	  
  }
  
}