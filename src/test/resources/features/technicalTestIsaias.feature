#Autor: Isaias Asis

  @stories
  Feature: Technical Test
    As a user I want to fill out the registration form in Utest in order to access the platform
    @scenario1
    Scenario Outline: register on the utest page
      Given that isaias wants to fill out the registration form and access Utest
      When enter information on the registration page
        | strFirstName         | strLastName     | strEmail        | strMonthOfBirth  | strDayOfBirth  | strYearOfBirth      | strLanguages         | strCity         | strPostalCode   | strCountry       | strComputerOS  | strComputerVersion  | strComputerLanguage  | strMobileBrand  | strMobileModel  | strMobileOS      | strPassword    | strConfirmPassword  |
        | <strFirstName>       | <strLastName>   | <strEmail>      | <strMonthOfBirth>| <strDayOfBirth>| <strYearOfBirth>    | <strLanguages>       | <strCity>       | <strPostalCode> | <strCountry>     | <strComputerOS>| <strComputerVersion>| <strComputerLanguage>| <strMobileBrand>| <strMobileModel>| <strMobileOS>    | <strPassword>  | <strConfirmPassword>|
      Then Successfully register on the platform
        | strQuestion   |
        | <strQuestion> |
      Examples:
        | strFirstName | strLastName | strEmail           | strMonthOfBirth | strDayOfBirth | strYearOfBirth | strLanguages | strCity            | strPostalCode | strCountry | strComputerOS | strComputerVersion| strComputerLanguage| strMobileBrand | strMobileModel  | strMobileOS | strPassword   | strConfirmPassword| strQuestion   |
        | Isaias       | Asis        | isaias123@gmail.com| February        | 12            | 1998           | Spanish      | Cartagena de Indias| 130011        | Colombia   | Windows       | 10                | Spanish            | Apple          | iPhone XS MAX   | iOS 15.4.1  | Qwerty123$$@@ | Qwerty123$$@@     | The last step |



