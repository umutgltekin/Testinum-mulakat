package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import util.DriverFactory;

public class HomePages {
    HomePage homepage=new HomePage(DriverFactory.getDriver());
    @Given("Should see home page")
    public void shouldSeeHomePage() {
        homepage.shouldSeeHomePage();
    }
    @When("Search {string}")
    public void search(String text) {
        homepage.Searchtext(text);
    }

    @When("click Search")
    public void clickSearch() {
        homepage.clickSearch();
    }

    @Then("Should see product page")
    public void shouldSeeProductPage() {
        homepage.shouldSeeProductPage();
    }

    @When("click product name {string}")
    public void clickProductName(String productName) {
        homepage.clikcProduct(productName);
    }

    @Then("Should see product detail page")
    public void shouldSeeProductDetailPage() {
        homepage.shouldProductDtailPage();
    }

    @When("click add cart")
    public void clickAddCart() {
        homepage.clickCart();
    }

    @Then("Cart icon equals {int}.")
    public void cartIconEquals(int num) {
        homepage.checkCartEquals(num);
    }

    @When("click cart")
    public void clickCart() {
        homepage.clickcart();
    }

    @When("click go to cart")
    public void clickGoToCart() {
        homepage.clickGoToCart();
    }

}
