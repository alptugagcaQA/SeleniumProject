package PageObjectModel;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;

import javax.xml.xpath.XPath;
import java.util.List;

public class ProductPage extends AbstractClass
{
    WebDriver driver;

    public ProductPage()
    {
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(xpath = "//*[@id=\"primary\"]/ul/li[1]/a[2]")
    private WebElement addCartBtn1;

    @FindBy(xpath = "//*[@id=\"primary\"]/ul/li[2]/a[2]")
    private WebElement addCartBtn2;

    @FindBy(xpath = "//*[@id=\"primary\"]/ul/li[3]/a[2]")
    private WebElement addCartBtn3;

    @FindBy(xpath = "//*[@id=\"primary-menu\"]/li[8]/a/i")
    private WebElement basketIcon;

    @FindBy(xpath ="//a[@class=\"added_to_cart wc-forward\"]")
    private WebElement viewcartText;

    @FindBy(xpath = "//select[@class=\"orderby\"]")
    private WebElement dropdown;



    public void click_AddCartBtn()
    {
        clickFunction(addCartBtn1);
    }

    public void check_ProductPage()
    {
        String expectedTitle = "Shop - Sample Shop";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Condition true", actualTitle, expectedTitle);
        System.out.println("My Message : " + actualTitle);

    }

    public void click_basketIcon()
    {
        clickFunction(basketIcon);

    }

    public void check_viewcartText()
    {
        AssertionText(viewcartText , "View cart");
    }

    public void click_dropdownMenu()
    {
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        selectElementFromDropdown(dropdown , "Sort by latest");
    }
    public void click_AddCartBtns()
    {

        clickFunction(addCartBtn1);
        clickFunction(addCartBtn2);
        clickFunction(addCartBtn3);
        ThreadSleep();
        clickFunction(viewcartText);
    }







}
