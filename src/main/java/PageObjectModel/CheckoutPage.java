package PageObjectModel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;

public class CheckoutPage extends AbstractClass
{
    WebDriver driver;

    public CheckoutPage()
    {
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    //input[@name = "billing_company" ]

    @FindBy(xpath = "//input[@name = \"billing_first_name\"]")
    private WebElement firstNameTxtBox;

    @FindBy(xpath = "//input[@name = \"billing_last_name\"]")
    private WebElement lastNameTxtBox;

    @FindBy(xpath = "//input[@name = \"billing_company\"]")
    private WebElement companyNameTxtBox;

    @FindBy (xpath = "//textarea[@name = \"order_comments\"]")
    private WebElement orderCommentsTxtBox;

    @FindBy (xpath = "//span[@id = \"select2-billing_country-container\"]")
    private WebElement countryDropdown;

    @FindBy (xpath = "//input[@name = \"billing_address_1\"]")
    private WebElement houseTxtBox;

    @FindBy (xpath = "//input[@name = \"billing_address_2\"]")
    private WebElement apartmentTxtBox;

    @FindBy (xpath = "//input[@name = \"billing_postcode\"]")
    private WebElement postcodeTxtBox;

    @FindBy (xpath = "//input[@name = \"billing_city\"]")
    private WebElement townTxtBox;

    @FindBy (xpath = "//span[@id = \"select2-billing_state-container\"]")
    private WebElement provinceDropdown;

    @FindBy (xpath = "//input[@id = \"billing_phone\"]")
    private WebElement phoneTxtBox;

    @FindBy (xpath = "//input[@id = \"billing_email\"]")
    private WebElement emailTxtBox;

    @FindBy (xpath = "//input[@id = \"createaccount\"]")
    private WebElement createaccountCheckbox;

    @FindBy (xpath = "//input[@id = \"mailpoet_woocommerce_checkout_optin\"]")
    private WebElement optionalCheckbox;


    public void set_firstNameTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(firstNameTxtBox));
        sendKeysFunctionRandom(firstNameTxtBox);
    }

    public void set_lastNameTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(lastNameTxtBox));
        sendKeysFunctionRandom(lastNameTxtBox);
    }
    public void set_companyNameTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(companyNameTxtBox));
        sendKeysFunctionRandom(companyNameTxtBox);
    }
    public void select_countryDropdown()
    {
        wait.until(ExpectedConditions.visibilityOf(countryDropdown));
        selectElementFromDropdown(countryDropdown , "Tunisia");
    }
    public void set_orderNotesTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(orderCommentsTxtBox));
        sendKeysFunctionRandom(orderCommentsTxtBox);
    }
    public void set_houseTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(houseTxtBox));
        sendKeysFunctionRandom(houseTxtBox);
    }
    public void set_apartmentTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(apartmentTxtBox));
        sendKeysFunctionRandom(apartmentTxtBox);
    }
    public void set_postCodeTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(postcodeTxtBox));
        sendKeysFunctionRandom(postcodeTxtBox);
    }
    public void set_townTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(townTxtBox));
        sendKeysFunctionRandom(townTxtBox);
    }
    public void select_provinceDropdown()
    {
        wait.until(ExpectedConditions.visibilityOf(provinceDropdown));
        selectElementFromDropdown(provinceDropdown , "İstanbul");
    }
    public void phoneTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(phoneTxtBox));
        sendKeysFunctionRandomNumber(phoneTxtBox);
    }
    public void set_emailTextBox()
    {
        wait.until(ExpectedConditions.visibilityOf(emailTxtBox));
        sendKeysFunctionRandomMail(emailTxtBox);
    }
    public void click_createAccountCheckbox()
    {
        wait.until(ExpectedConditions.visibilityOf(createaccountCheckbox));
        clickFunction(createaccountCheckbox);
    }
    public void click_optionalCheckbox()
    {
        ThreadSleep();
        wait.until(ExpectedConditions.visibilityOf(optionalCheckbox));
        clickFunction(optionalCheckbox);

    }
}
