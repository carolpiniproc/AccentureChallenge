package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mappers.InsurantDataMap;
import mappers.VehicleDataMap;
import org.junit.Assert;
import pages.VehicleDataPage;


public class InsurantDataSteps {
    VehicleDataPage vehiclePage = new VehicleDataPage();
    VehicleDataMap vehicleDataMap = new VehicleDataMap();
    InsurantDataMap insurantDataMap = new InsurantDataMap();

    @When("user types {string} as 1st Name")
    public void user_types_as_1st_name(String value) {
        insurantDataMap.firstName.sendKeys(value);
    }

    @When("user types {string} on Last Name")
    public void user_types_on_last_name(String string) {
        insurantDataMap.lastName.sendKeys(string);
    }

    @And("user sets {string} as BirthDate")
    public void user_sets_as_date(String value) {
        insurantDataMap.birthDate.sendKeys(value);
    }

    @When("user selects {string} as gender")
    public void user_selects_female_as_gender(String value) {
        if (value.equals("Feminino")){
            insurantDataMap.femaleButton.click();
    } else {
            insurantDataMap.maleButton.click();
        }
    }

    @When("user types {string} as Address")
    public void user_types_as_address(String string) {
        insurantDataMap.address.sendKeys(string);
    }

    @When("user selects {string} as country")
    public void user_selects_as_country(String string) {
        insurantDataMap.countrySelection.sendKeys(string);
    }

    @When("user types {string} as zipcode")
    public void user_types_as_zipcode(String string) {
        insurantDataMap.zipcode.sendKeys(string);
    }

    @When("user types {string} as city")
    public void user_types_campinas_as_city(String string) {
        insurantDataMap.city.sendKeys(string);
    }

    @When("user selects {string} as occupation")
    public void user_selects_as_occupation(String string) {
        insurantDataMap.occupationSelection.sendKeys(string);
    }

    @When("user selects {string} as hobby")
    public void user_selects_and_as_hobbies(String value) {

        if (value.equals("Speeding")){
            insurantDataMap.speeding.click();
        } else if (value.equals("Bungee Jumping")){
            insurantDataMap.bungeejumping.click();
        } else if (value.equals("Cliff Diving")){
            insurantDataMap.cliffdiving.click();
        } else if (value.equals("Skydiving")){
            insurantDataMap.skydiving.click();
        } else if (value.equals("Other")) {
            insurantDataMap.other.click();
        }
    }

    @When("user upload a picture")
    public void user_upload_a_picture() {
       insurantDataMap.openButton.sendKeys("picture/TEG.pdf");
    }

    @Then("user clicks on Next")
    public void user_clicks_on_next() {
        insurantDataMap.nextProductData.click();
    }

    @Then("Next again")
    public void next_again() {
        insurantDataMap.nextPriceData.click();
    }

    @Then("user sees a warning message {string}")
    public void user_sees_a_warning_message(String string) {
        insurantDataMap.loadPriceDiv.isDisplayed();
        insurantDataMap.loadPriceText.waitVisibleElement();
        Assert.assertEquals(insurantDataMap.loadPriceText.getText(),string);
    }

    @When("user clicks on Send Quote tab and sees a warning message {string}")
    public void user_clicks_on_send_quote_tab_and_sees_a_warning_message(String value) {
        insurantDataMap.sendQuoteTab.click();
        insurantDataMap.loadSendQuote.isDisplayed();
        insurantDataMap.loadSendQuoteText.waitVisibleElement();
        Assert.assertEquals(insurantDataMap.loadSendQuoteText.getText(),value);
    }

}
