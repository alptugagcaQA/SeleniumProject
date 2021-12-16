package steps;

import PageObjectModel.ProductPage;
import io.cucumber.java.en.Given;

public class ProductPageSteps
{
    ProductPage productPage = new ProductPage();


    @Given("I check product page")
    public void ı_check_product_page()
    {
        productPage.check_ProductPage();
    }

    @Given("I click Add to Cart button.")
    public void ı_click_Add_to_Cart_button()
    {
        productPage.click_AddCartBtn();
        productPage.check_viewcartText();
    }

    @Given("I click basket icon.")
    public void ı_click_basket_icon()
    {
        productPage.click_basketIcon();
    }

    @Given("Click Dropdown")
    public void click_drowdown()
    {
        productPage.click_dropdownMenu();
    }

    @Given("Click Add to card buttons")
    public void click_Add_Cart_Buttons()
    {
        productPage.click_AddCartBtns();
    }

}
