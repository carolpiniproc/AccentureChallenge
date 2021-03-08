package mappers;
import settings.ByValue;
import settings.Elements;

public class InsurantDataMap {

    public Elements firstName = new Elements(ByValue.ID, "firstname");
    public Elements lastName = new Elements(ByValue.ID, "lastname");
    public Elements birthDate = new Elements(ByValue.ID, "birthdate");
    public Elements maleButton = new Elements(ByValue.XPATH, "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
    public Elements femaleButton = new Elements(ByValue.XPATH, "//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span");
    public Elements address = new Elements(ByValue.ID, "streetaddress");
    public  Elements countrySelection = new Elements(ByValue.ID, "country");
    public  Elements zipcode = new Elements(ByValue.ID, "zipcode");
    public  Elements city = new Elements(ByValue.ID, "city");
    public  Elements occupationSelection = new Elements(ByValue.ID, "occupation");
    public  Elements speeding = new Elements(ByValue.XPATH, "//*[@id=\"speeding\"]");
    public  Elements bungeejumping = new Elements(ByValue.XPATH, "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]/span");
    public  Elements cliffdiving = new Elements(ByValue.XPATH, "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]/span");
    public  Elements skydiving = new Elements(ByValue.XPATH, "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]/span");
    public  Elements other = new Elements(ByValue.XPATH, "//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span");
    public  Elements website = new Elements(ByValue.ID, "website");
    public  Elements openButton = new Elements(ByValue.ID, "picturecontainer");
    public  Elements nextProductData = new Elements(ByValue.ID, "nextenterproductdata");
    public  Elements previousVehicleData = new Elements(ByValue.ID, "preventervehicledata");
    public  Elements nextPriceData = new Elements(ByValue.ID, "nextselectpriceoption");
    public Elements loadPriceDiv = new Elements(ByValue.ID,"xLoaderPrice");
    public Elements loadPriceText = new Elements(ByValue.XPATH, "//*[@id=\"xLoaderPrice\"]/p");
    public Elements sendQuoteTab = new Elements(ByValue.XPATH, "//*[@id=\"sendquote\"]");
    public Elements loadSendQuote = new Elements(ByValue.ID, "xLoaderQuote");
    public Elements loadSendQuoteText = new Elements(ByValue.XPATH,"//*[@id=\"xLoaderQuote\"]/p");


}

