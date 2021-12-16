package steps;

import PageObjectModel.CheckoutPage;
import io.cucumber.java.en.Given;

public class CheckoutPageSteps
{
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("Click checkout elements")
    public void click_shopLink()
    {
        checkoutPage.set_firstNameTextBox();
        checkoutPage.set_lastNameTextBox();
        checkoutPage.set_orderNotesTextBox();
        checkoutPage.set_companyNameTextBox();
        checkoutPage.set_houseTextBox();
        checkoutPage.set_apartmentTextBox();
        checkoutPage.set_postCodeTextBox();
        checkoutPage.set_townTextBox();
        checkoutPage.phoneTextBox();
        checkoutPage.set_emailTextBox();
        checkoutPage.click_createAccountCheckbox();
        checkoutPage.click_optionalCheckbox();
    }


}
