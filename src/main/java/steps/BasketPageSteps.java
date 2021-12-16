package steps;

import PageObjectModel.BasketPage;
import io.cucumber.java.en.Given;

public class BasketPageSteps
{
    BasketPage basketPage = new BasketPage();

    @Given("I check basket")
    public void ı_check_basket()
    {
        basketPage.check_basketPage();
        basketPage.check_product();
    }

    @Given("I select quantity")
    public void ı_select_quantity()
    {
        basketPage.select_Quantity();
    }

    @Given("I check amount")
    public void ı_check_amount()
    {
        basketPage.check_amount();
    }

    @Given("I click delete button.")
    public void ı_click_delete_button()
    {
        basketPage.click_remove_Icon();
    }

    @Given("I check  warning")
    public void ı_check_warning()
    {
        basketPage.check_emptyText();
    }

    @Given("Check Basket Page")
    public void check_BasketPage()
    {
        basketPage.check_basketPage();
        basketPage.check_products();
    }

    @Given("Select quantity")
    public void select_quantitys()
    {
        basketPage.select_Quantitys();
    }

    @Given("Check Amounts")
    public void check_amounts()
    {
        basketPage.check_amounts();
    }

    @Given("Click Proceed Button")
    public void click_proceedButton()
    {
        basketPage.click_proceedButton();
    }
    @Given("Delete products.")
    public void click_remove_Icons()
    {
        basketPage.click_remove_Icons();
    }


}
