package steps;


import PageObjectModel.HomePage;
import PageObjectModel.ProductPage;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class HomePageSteps
{
    private WebDriver driver;
    HomePage homePage = new HomePage();

    @Given("Go to URL")
    public void go_to_URL()
    {
        homePage.go_to_URL();
    }

    @Given("I should see home page")
    public void ı_should_see_home_page()
    {
        homePage.check_HomePage();
    }

    @Given("I click Shop Now Button.")
    public void ı_click_Shop_Now_Button()
    {
        homePage.click_shopNowButton();
    }
    @Given("Quit Driver")
    public void quit_driver()
    {
        homePage.quitDriver();
    }


    @Given("It is scrolled to the bottom of the page.")
    public void scrool_buttom_page()
    {
        homePage.scrool_down();
    }

    @Given("I check Contact Info")
    public void check_contact_ınfo()
    {
        homePage.check_contackInfo();
    }

    @Given("I Go to the top of the page.")
    public void click_top_page()
    {
        homePage.scrool_upButton();
    }

    @Given("I check the top of the page.")
    public void check_top_page()
    {
        homePage.check_Logo();
    }

    @Given("Click shop link")
    public void click_shopLink()
    {
        homePage.click_shopLink();
    }









}
