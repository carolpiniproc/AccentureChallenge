package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mappers.VehicleDataMap;
import pages.VehicleDataPage;
import settings.Driver;

public class VehicleDataSteps {
    VehicleDataPage vehiclePage = new VehicleDataPage();
    VehicleDataMap vehicleMap = new VehicleDataMap();

    @Given("user is at sampleAppTricentis webpage")
    public void user_is_at_sample_app_tricentis_webpage() {
        Driver.setUrl("http://sampleapp.tricentis.com/101/app.php");
    }

    @When("user selects {string} on Make dropdown")
    public void user_selects_on_make_dropdown(String value) {
        vehiclePage.setMake(value);
    }

    @When("user types {int} on Engine Performance")
    public void user_types_on_engine_performance(Integer value) {
       vehiclePage.setEnginePerformance(value);
    }

    @When("user sets {string} as Date")
    public void user_sets_as_date(String value) {
        vehiclePage.setDate(value);
    }

    @When("user selects {int} as Number of Seats")
    public void user_selects_as_number_of_seats(Integer value) {
        vehiclePage.setSeatsNumber(value);
    }

    @When("user selects {string} as Fuel Type")
    public void user_selects_as_fuel_type(String value) {
        vehiclePage.setFuel(value);
    }

    @When("user types {double} as List Price")
    public void user_types_as_list_price(Double value) {
        vehiclePage.setPrice(value);
    }

    @When("user types {string} as License PLate")
    public void user_types_as_license_p_late(String value) {
        vehiclePage.setLicensePlate(value);
    }

    @When("user types {double} as Annual Miles")
    public void user_types_as_annual_miles(double value) {
        vehiclePage.setMiles(value);
    }

    @Then("user clicks on Next.")
    public void user_clicks_on_next() {
        vehicleMap.nextButton.click();
    }

}
