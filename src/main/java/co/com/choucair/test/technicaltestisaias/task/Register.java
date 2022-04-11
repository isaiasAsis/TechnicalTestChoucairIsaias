package co.com.choucair.test.technicaltestisaias.task;

import co.com.choucair.test.technicaltestisaias.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

public class Register implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;
    private String strMonthOfBirth;
    private String strDayOfBirth;
    private String strYearOfBirth;
    private String strLanguages;
    private String strCity;
    private String strPostalCode;
    private String strCountry;
    private String strMobileBrand;
    private String strMobileModel;
    private String strMobileOS;
    private String strPassword;
    private String strConfirmPassword;

    public Register(String strFirstName, String strLastName, String strEmail, String strMonthOfBirth, String strDayOfBirth, String strYearOfBirth, String strLanguages, String strCity, String strPostalCode, String strCountry, String strMobileBrand, String strMobileModel, String strMobileOS, String strPassword, String strConfirmPassword) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonthOfBirth = strMonthOfBirth;
        this.strDayOfBirth = strDayOfBirth;
        this.strYearOfBirth = strYearOfBirth;
        this.strLanguages = strLanguages;
        this.strCity = strCity;
        this.strPostalCode = strPostalCode;
        this.strCountry = strCountry;
        this.strMobileBrand = strMobileBrand;
        this.strMobileModel = strMobileModel;
        this.strMobileOS = strMobileOS;
        this.strPassword = strPassword;
        this.strConfirmPassword = strConfirmPassword;
    }

    public static Register whitInformation(String strFirstName, String strLastName, String strEmail,
                                           String strMonthOfBirth, String strDayOfBirth, String strYearOfBirth,
                                           String strLanguages, String strCity, String strPostalCode, String strCountry,
                                           String strMobileBrand, String strMobileModel, String strMobileOS, String strPassword,
                                           String strConfirmPassword) {
        return Tasks.instrumented(Register.class, strFirstName, strLastName, strEmail, strMonthOfBirth, strDayOfBirth, strYearOfBirth
                                    ,strLanguages, strCity, strPostalCode, strCountry, strMobileBrand, strMobileModel, strMobileOS, strPassword, strConfirmPassword);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Scroll.to(UtestRegisterPage.BUTTON_NEXT_LOCATION),
                Enter.theValue(strFirstName).into(UtestRegisterPage.INPUT_FIRST_NAME),
                Enter.theValue(strLastName).into(UtestRegisterPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtestRegisterPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText(strMonthOfBirth).from(UtestRegisterPage.SELECT_MONTH_OF_BIRTH),
                SelectFromOptions.byVisibleText(strDayOfBirth).from(UtestRegisterPage.SELECT_DAY_OF_BIRTH),
                SelectFromOptions.byVisibleText(strYearOfBirth).from(UtestRegisterPage.SELECT_YEAR_OF_BIRTH),
                Click.on(UtestRegisterPage.INPUT_LANGUAGE),
                Enter.theValue(strLanguages).into(UtestRegisterPage.INPUT_LANGUAGE),
                Hit.the(Keys.ENTER).into(UtestRegisterPage.INPUT_LANGUAGE),
                Click.on(UtestRegisterPage.BUTTON_NEXT_LOCATION),
                //Step two
                Scroll.to(UtestRegisterPage.BUTTON_NEXT_DEVICES),
                Enter.theValue(strCity).into(UtestRegisterPage.INPUT_CITY),
                Enter.theValue(strPostalCode).into(UtestRegisterPage.INPUT_POSTAL_CODE),
                Click.on(UtestRegisterPage.INPUT_COUNTRY),
                Enter.theValue(strCountry).into(UtestRegisterPage.INPUT_COUNTRY_TEXT),
                Hit.the(Keys.ENTER).into(UtestRegisterPage.INPUT_COUNTRY_TEXT),
                Click.on(UtestRegisterPage.BUTTON_NEXT_DEVICES),
                //Step three
                Scroll.to(UtestRegisterPage.BUTTON_LAST_STEP),
                Click.on(UtestRegisterPage.INPUT_MOBILE_BRAND),
                Enter.theValue(strMobileBrand).into(UtestRegisterPage.INPUT_MOBILE_BRAND_TEXT),
                Hit.the(Keys.ENTER).into(UtestRegisterPage.INPUT_MOBILE_BRAND_TEXT),
                Click.on(UtestRegisterPage.INPUT_MOBILE_MODEL),
                Enter.theValue(strMobileModel).into(UtestRegisterPage.INPUT_MOBILE_MODEL_TEXT),
                Hit.the(Keys.ENTER).into(UtestRegisterPage.INPUT_MOBILE_MODEL_TEXT),
                Click.on(UtestRegisterPage.INPUT_MOBILE_OS),
                Enter.theValue(strMobileOS).into(UtestRegisterPage.INPUT_MOBILE_OS_TEXT),
                Hit.the(Keys.ENTER).into(UtestRegisterPage.INPUT_MOBILE_OS_TEXT),
                Click.on(UtestRegisterPage.BUTTON_LAST_STEP),
                //Last step
                Scroll.to(UtestRegisterPage.BUTTON_COMPLETE_SETUP),
                Enter.theValue(strPassword).into(UtestRegisterPage.INPUT_PASSWORD),
                Enter.theValue(strConfirmPassword).into(UtestRegisterPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestRegisterPage.CHECK_TERMS),
                Click.on(UtestRegisterPage.CHECK_PRIVACY_POLICY));
    }
}
