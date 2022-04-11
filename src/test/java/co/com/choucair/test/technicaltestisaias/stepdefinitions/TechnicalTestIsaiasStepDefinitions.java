package co.com.choucair.test.technicaltestisaias.stepdefinitions;

import co.com.choucair.test.technicaltestisaias.model.UtestRegisterData;
import co.com.choucair.test.technicaltestisaias.questions.Answer;
import co.com.choucair.test.technicaltestisaias.task.Join;
import co.com.choucair.test.technicaltestisaias.task.OpenUp;
import co.com.choucair.test.technicaltestisaias.task.Register;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class TechnicalTestIsaiasStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^that isaias wants to fill out the registration form and access Utest$")
    public void thatIsaiasWantsToFillOutTheRegistrationFormAndAccessUtest() {
        OnStage.theActorCalled("Isaias").wasAbleTo(OpenUp.thePage(), (Join.onThePage()));
    }

    @When("^enter information on the registration page$")
    public void enterInformationOnTheRegistrationPage(List<UtestRegisterData> utestRegisterData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Register.whitInformation(utestRegisterData.get(0).getStrFirstName(),
                utestRegisterData.get(0).getStrLastName(),utestRegisterData.get(0).getStrEmail(),utestRegisterData.get(0).getStrMonthOfBirth(),
                utestRegisterData.get(0).getStrDayOfBirth(),utestRegisterData.get(0).getStrYearOfBirth(),utestRegisterData.get(0).getStrLanguages(),
                utestRegisterData.get(0).getStrCity(),utestRegisterData.get(0).getStrPostalCode(),utestRegisterData.get(0).getStrCountry(),
                utestRegisterData.get(0).getStrMobileBrand(),utestRegisterData.get(0).getStrMobileModel(),utestRegisterData.get(0).getStrMobileOS(),
                utestRegisterData.get(0).getStrPassword(),utestRegisterData.get(0).getStrConfirmPassword()));
    }

    @Then("^Successfully register on the platform$")
    public void successfullyRegisterOnThePlatform(List<UtestRegisterData> utestRegisterData) throws Exception{
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestRegisterData.get(0).getStrQuestion())));
    }

}
