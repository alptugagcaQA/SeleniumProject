package PageObjectModel;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.Driver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public abstract class AbstractClass
{
    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);
    private char alphabet;

    public void go_to_URL()
    {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("https://training.qastorming.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    public void clickFunction(WebElement clickElement)
    {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
    }

    public void sendKeysFunction(WebElement sendKeysElement , String value)
    {
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(value);
    }

    public void sendKeysFunctionRandom(WebElement sendKeysElement )
    {
        String random = RandomStringUtils.randomAlphabetic(7);
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(random);
    }
    public void sendKeysFunctionRandomMail(WebElement sendKeysElement )
    {
        String random = RandomStringUtils.randomAlphabetic(7);
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(random + "@gmail.com");
    }
    public void sendKeysFunctionRandomNumber(WebElement sendKeysElement )
    {

        String random = RandomStringUtils.randomNumeric(11);
        wait.until(ExpectedConditions.visibilityOf(sendKeysElement));
        sendKeysElement.sendKeys(random);
    }


    public void selectElementFromDropdown(WebElement dropdown , String element)
    {
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }


    public void selectElementList(WebElement list , int index)
    {
        List<WebElement> liElements = driver.findElements(By.xpath(".//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li"));
        System.out.println(liElements);

        for(int i=1; i <= liElements.size(); i++)
        {
            WebElement linkElement = driver.findElement(By.xpath(".//*[@id='fk-mainhead-id']/div[2]/div/div/ul/li[" + i + "]/a"));
            System.out.println(linkElement.getText());

        }
    }

    public void AssertionText(WebElement actual , String expected)
    {
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText() , expected);

        System.out.println("My Message : "+ actual.getText());
    }

    public void mouseClick(WebElement mouseClick)
    {
        wait.until(ExpectedConditions.visibilityOf(mouseClick));
        mouseClick.submit();
        mouseClick.submit();
    }
    public void keyboardInput(WebElement keyboaardInput)
    {
        keyboaardInput.sendKeys(Keys.DELETE);
    }

    public void ThreadSleep()
    {
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException ie){
        }
    }

    public void quitDriver()
    {
        driver.quit();
    }






}
