package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.cartPage;
import util.DriverFactory;

public class cartPageSteps {
    cartPage cartpage=new cartPage(DriverFactory.getDriver());

    @When("click incresa product")
    public void clickIncresaProduct() {
        cartpage.ClickAddProduct();
    }

    @When("click refresh")
    public void clickRefresh() {
        cartpage.clickRefresh();
    }

    @Then("cart update write")
    public void cartUpdateWrite() {
        cartpage.checkCartUpdateWrite();
    }

    @When("Delete product")
    public void deleteProduct() {
        cartpage.clickDelete();
    }

    @Then("should see empty carty")
    public void shouldSeeEmptyCarty() {
        cartpage.checkEmptyCart();
    }
}
