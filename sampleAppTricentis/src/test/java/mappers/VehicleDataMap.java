package mappers;
import settings.ByValue;
import settings.Elements;

public class VehicleDataMap {

    public Elements makeDropdown = new Elements(ByValue.ID, "make");
    public Elements enginePerformance = new Elements(ByValue.ID, "engineperformance");
    public Elements manufactureDate = new Elements(ByValue.ID, "dateofmanufacture");
    public Elements seatsNumberDropdown = new Elements(ByValue.ID, "numberofseats");
    public Elements fuelDropdown = new Elements(ByValue.ID, "fuel");
    public  Elements priceInput = new Elements(ByValue.ID, "listprice");
    public  Elements licenseNumber = new Elements(ByValue.ID, "licenseplatenumber");
    public  Elements annualMiles = new Elements(ByValue.ID, "annualmileage");
    public  Elements nextButton = new Elements(ByValue.ID, "nextenterinsurantdata");

}

