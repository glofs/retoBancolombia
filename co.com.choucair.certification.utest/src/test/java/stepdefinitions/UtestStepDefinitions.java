package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.Answer;
import tasks.OpenUp;
import tasks.SignIn;
import model.UtestData;
import java.util.List;


public class UtestStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^That Gustavo wants to participate in the Utest comunity online$")
    public void thatGustavoWantsToParticipateInTheUtestComunityOnline() {
    OnStage.theActorCalled("Gustavo").wasAbleTo(OpenUp.thePage());
    }

    @When("^he register in the Utest page$")
    public void heRegisterInTheUtestPage() {
        OnStage.theActorInTheSpotlight().attemptsTo(SignIn.site());

    }

    @Then("^he creates a new profile in Utest page$")
    public void heCreatesANewProfileInUtestPage(List<UtestData>utestData) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrMessages())));

    }
}
