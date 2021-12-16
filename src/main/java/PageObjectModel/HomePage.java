package PageObjectModel;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.Driver;

public class HomePage extends AbstractClass
{
    WebDriver driver;

    public HomePage()
    {
        driver = Driver.getDriver();
        PageFactory.initElements(driver,this);
    }


    @FindBy(className = "elementor-button-content-wrapper")
    private WebElement shopNowBtn;

    @FindBy(xpath = "//*[@id=\"custom_html-2\"]/div")
    private WebElement contactInfo;

    @FindBy(xpath = "//a[@id = \"tg-scroll-to-top\"]")
    private WebElement scroolButton;

    @FindBy(xpath = "//img[@class = \"custom-logo\"]")
    private WebElement logoImg;

    @FindBy(linkText = "Shop")
    private WebElement shopLink;

    public void click_shopNowButton()
    {
        clickFunction(shopNowBtn);
    }
    public void check_HomePage()
    {
        String expectedTitle = "Home - Sample Shop";
        String actualTitle = driver.getTitle();
        Assert.assertEquals("Condition true", actualTitle, expectedTitle);
        System.out.println("My Message : " + actualTitle);

    }

    public void scrool_down()
    {
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,10000)", "");
        ThreadSleep();
    }

    public void check_contackInfo()
    {
        wait.until(ExpectedConditions.visibilityOf(contactInfo));

    }
    public void scrool_upButton()
    {
        wait.until(ExpectedConditions.visibilityOf(scroolButton));
        clickFunction(scroolButton);
        ThreadSleep();
    }
    public void check_Logo()
    {
        wait.until(ExpectedConditions.visibilityOf(logoImg));
        clickFunction(logoImg);
    }
    public void click_shopLink()
    {
        wait.until(ExpectedConditions.visibilityOf(shopLink));
        clickFunction(shopLink);
    }

}
