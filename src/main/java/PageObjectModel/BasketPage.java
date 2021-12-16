package PageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;

public class BasketPage extends AbstractClass
{
    WebDriver driver;

    public BasketPage()
    {
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy(linkText = "Empire Waist Red Dress")
    private WebElement productText1;

    @FindBy(linkText = "Yellow Stripe Coat")
    private WebElement productText2;

    @FindBy(linkText = "Blue Lace Dress")
    private WebElement productText3;

    @FindBy(linkText = "Yellow Cropped Jacket")
    private WebElement productText4;

    @FindBy(xpath = "//input[@class=\"input-text qty text\"]")
    private WebElement inputNumeric;

    @FindBy(xpath = "//input[@name=\"cart[1534b76d325a8f591b52d302e7181331][qty]\"]")
    private WebElement inputNumeric2;

    @FindBy(name = "update_cart")
    private WebElement updateCarBtn;

    @FindBy(xpath = "//*[@id=\"post-90\"]/div/div/form/table/tbody/tr[1]/td[6]/span/bdi")
    private WebElement amountText;

    @FindBy(xpath = "//*[@id=\"post-90\"]/div/div/div[2]/div/table/tbody/tr[2]/td/strong/span/bdi/")
    private WebElement totalAmountText;

    @FindBy(className = "remove")
    private WebElement removeIcon;

    @FindBy(xpath = "//p[@class=\"cart-empty woocommerce-info\"]")
    private WebElement emptyText;

    @FindBy(xpath = "//div[@class=\"woocommerce-message\"]")
    private WebElement updateText;

    @FindBy(xpath = "//a[@class=\"checkout-button button alt wc-forward\"]")
    private WebElement proceedBtn;

    public void check_basketPage()
    {
        String expectedTitle = "Cart - Sample Shop";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Condition true", actualTitle, expectedTitle);
        System.out.println("My Message : " + actualTitle);
    }


    public void check_product()
    {
        AssertionText(productText1,"Empire Waist Red Dress");
    }

    public void select_Quantity()
    {
        mouseClick(inputNumeric);
        keyboardInput(inputNumeric);
        sendKeysFunction(inputNumeric , "3");
        clickFunction(updateCarBtn);
    }
    public void check_amount()
    {
        wait.until(ExpectedConditions.visibilityOf(updateText));
        AssertionText(amountText , "₺ 1.800,00");
    }
    public void click_remove_Icon()
    {
            clickFunction(removeIcon);
    }
    public void click_remove_Icons()
    {
        for (int i = 0; i<3; i++)
        {
            ThreadSleep();
            clickFunction(removeIcon);
        }
    }
    public void check_emptyText()
    {
        AssertionText(emptyText , "Your cart is currently empty.");
    }

    public void check_products()
    {
        AssertionText(productText2,"Yellow Stripe Coat");
        AssertionText(productText3,"Blue Lace Dress");
        AssertionText(productText4,"Yellow Cropped Jacket");
    }

    public void select_Quantitys()
    {
        mouseClick(inputNumeric2);
        keyboardInput(inputNumeric2);
        sendKeysFunction(inputNumeric2 , "2");
        clickFunction(updateCarBtn);
        wait.until(ExpectedConditions.visibilityOf(updateText));
        mouseClick(inputNumeric);
        keyboardInput(inputNumeric);
        sendKeysFunction(inputNumeric , "4");
        clickFunction(updateCarBtn);
        wait.until(ExpectedConditions.visibilityOf(updateText));
    }
    public void check_amounts()
    {
        AssertionText(totalAmountText , "₺ 4.900,00");
    }

    public void click_proceedButton()
    {
        ThreadSleep();
        clickFunction(proceedBtn);
    }


}
