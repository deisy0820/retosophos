package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import questions.MessageRegisteredProduct;
import tasks.EnterPageWeb;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import tasks.OpenTheBrowser;
import userinterfaces.CrmHome;
import utils.enums.Data;

import static org.hamcrest.CoreMatchers.containsString;


public class SearchProductStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver herBrowser;

    private Actor user = Actor.named("usuario");
    private CrmHome crmHome;

    @Given("^that user enter to page$")
    public void that_user_enter_to_page() throws Exception {
        user.can(BrowseTheWeb.with(herBrowser));
        user.attemptsTo(OpenTheBrowser.at(crmHome));

    }

    @When("^He search product and add it to the shopping cart$")
    public void he_search_product_and_add_it_to_the_shopping_cart() throws Exception {
        user.attemptsTo(EnterPageWeb.is());
    }


    @Then("^He validate that it was added correclty$")
    public void he_validate_that_it_was_added_correclty() throws Exception {
        user.should(seeThat(MessageRegisteredProduct.is(),containsString(Data.ITEM_IN_CART.getCode())));

    }
}

