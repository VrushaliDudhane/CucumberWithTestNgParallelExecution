Feature: User Registration Page functional testing

Scenario Outline: to fill the registration page
Given user opened the browser
And entered the url
When user click on the registration
And put the data from "<sheetName>" with row number <rowNumber>
And click on send button

Examples:
|sheetName|rowNumber|
|RegistrationData|0|
|RegistrationData|1|