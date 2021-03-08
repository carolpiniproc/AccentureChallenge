#language:en

@EnterDataFlow
Feature: Insert data into the forms
  I want to full fill the form and go to the next step

@VehicleDataPageOnly
  Scenario: User will full fill the form to register vehicle data
    Given user is at sampleAppTricentis webpage
    When user selects "Audi" on Make dropdown
    And user types 100 on Engine Performance
    And user sets '01/01/2020' as Date
    And user selects 7 as Number of Seats
    And user selects "Diesel" as Fuel Type
    And user types 10000.00 as List Price
    And user types "123-ABC" as License PLate
    And user types 20000 as Annual Miles
    Then user clicks on Next.

@EnterHalfDataAndWarningMessages
  Scenario: User will full fill 2 forms and continue until warning messages
    Given user is at sampleAppTricentis webpage
    When user selects "Audi" on Make dropdown
    And user types 100 on Engine Performance
    And user sets '01/01/2020' as Date
    And user selects 7 as Number of Seats
    And user selects "Diesel" as Fuel Type
    And user types 10000.00 as List Price
    And user types "123-ABC" as License PLate
    And user types 20000 as Annual Miles
    Then user clicks on Next.
    When user types "Carolina" as 1st Name
    And user types "Procaccini" on Last Name
    And user sets "12/30/1980" as BirthDate
    And user selects "Feminino" as gender
    And user types "Rua Hermantino Coelho" as Address
    And user selects "Albania" as country
    And user types "12345000" as zipcode
    And user types "Campinas" as city
    And user selects "Selfemployed" as occupation
    And user selects "Skydiving" as hobby
    And user selects "Cliff Diving" as hobby
    And user upload a picture
    Then user clicks on Next
    And Next again
    Then user sees a warning message "Please, complete the first three steps to see the price table."
    When user clicks on Send Quote tab and sees a warning message "Please, select a price option to send the quote."
