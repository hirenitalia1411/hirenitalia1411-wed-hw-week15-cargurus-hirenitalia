package au.com.carsguide.steps;

import au.com.carsguide.pages.HomePage;
import au.com.carsguide.pages.NewAndUsedCarSearchPage;
import au.com.carsguide.pages.ProductPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class BuySteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I mouse hover on {string} tab")
    public void iMouseHoverOnTab(String option) {
        new HomePage().selectTopMenuOptions(option);
    }

    @And("I select make {string}")
    public void iSelectMake(String makes) {
        new NewAndUsedCarSearchPage().selectMakesFromDropDown(makes);
    }

    @And("I select model {string}")
    public void iSelectModel(String model) {
        new NewAndUsedCarSearchPage().selectModelsFromDropDown(model);
    }

    @And("I select location {string}")
    public void iSelectLocation(String location) {
        new NewAndUsedCarSearchPage().selectLocationFromDropDown(location);
    }

    @And("I select price {string}")
    public void iSelectPrice(String price) {
        new NewAndUsedCarSearchPage().selectPriceFromDropDown(price);
    }

    @And("I click on Find My Next Car tab")
    public void iClickOnFindMyNextCarTab() {
        new NewAndUsedCarSearchPage().clickOnFindMyNextCar();
    }

    @Then("I should see the make {string} in results")
    public void iShouldSeeTheMakeInResults(String make) {
        if (new ProductPage().isTitleAvailable()){
            Assert.assertTrue(new ProductPage().getTitleOfThePage().contains(make));
        } else {
            System.out.println("The selected car is not available");
        }
    }

    @And("I click Search Cars link")
    public void iClickSearchCarsLink() {
        new HomePage().clickOnSearchCarsOptionInBuyAndSellTopMenu();
    }

    @Then("I navigate to new and used car search page")
    public void iNavigateToNewAndUsedCarSearchPage() {
        Assert.assertEquals(new NewAndUsedCarSearchPage().getWelcomeText(), "New & Used Car Search - carsguide");
    }

    @And("I click Used link")
    public void iClickUsedLink() {
        new HomePage().clickOnUsedOptionInBuyAndSellTopMenu();
    }

    @Then("I navigate to Used Cars For Sale page")
    public void iNavigateToUsedCarsForSalePage() {
    }
}