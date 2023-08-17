package co.com.choucair.stepdefinitions;

import co.com.choucair.questions.Answer;
import co.com.choucair.tasks.FillOutPersonalInformation;
import co.com.choucair.tasks.Join;
import co.com.choucair.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.OpenPage;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class PruebaTecnicaStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Jose wants to register on the utest\\.com website$")
    public void thanJoseWantsToRegisterOnTheUtestComWebsite() {
          OnStage.theActorCalled("Jose").wasAbleTo(OpenUp.thePage(), Join.onThePage());
    }

    @When("^he enters all the required information$")
    public void heEntersAllTheRequiredInformation() {
          OnStage.theActorInTheSpotlight().attemptsTo(FillOutPersonalInformation.onThePage());
    }


    @Then("^he sees on the page the message (.*)$")
    public void he_sees_on_the_page_the_message_Welcome_to_the_world_s_largest_community_of_freelance_software_testers(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));
    }

}
