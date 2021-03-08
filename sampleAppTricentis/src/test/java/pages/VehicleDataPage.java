package pages;

import mappers.VehicleDataMap;

public class VehicleDataPage {
    VehicleDataMap vehicleMap = new VehicleDataMap();

    public void setMake(String value){
        vehicleMap.makeDropdown.click();
        vehicleMap.makeDropdown.sendKeys(value);
    }

    public void setEnginePerformance(Integer value){
        vehicleMap.enginePerformance.sendKeys(value);
    }

    public void setDate(String value){

        vehicleMap.manufactureDate.click();
        vehicleMap.manufactureDate.sendKeys(value);
    }

    public void setSeatsNumber(Integer value){
        vehicleMap.seatsNumberDropdown.click();
        vehicleMap.seatsNumberDropdown.sendKeys(value);
    }

    public void setFuel(String value){
        vehicleMap.fuelDropdown.click();
        vehicleMap.fuelDropdown.sendKeys(value);
    }
    public void setPrice(Double value){
        vehicleMap.priceInput.sendKeys(value);
    }

    public void setLicensePlate(String value){
        vehicleMap.licenseNumber.sendKeys(value);
    }

    public void setMiles(double value){
        vehicleMap.annualMiles.sendKeys(value);
    }

}
