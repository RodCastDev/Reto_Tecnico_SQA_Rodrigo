package co.sqasa.StepDef;

import co.sqasa.Tasks.ClickTextEnrriquecido;
import co.sqasa.Tasks.SendText;
import co.sqasa.noteQuestions.ValidateText;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class TestTextStepDef {

    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");

    }

    @Given("^me dijiro a la pagina de NotePad$")
    public void me_dijiro_a_la_pagina_de_NotePad() {
        theActorInTheSpotlight().attemptsTo(
                Open.url("https://www.online-notepad.net/es/bloc-de-notas-online")
        );
    }

    @When("^selecciono nota de texto enriquecido$")
    public void selecciono_nota_de_texto_enriquecido() {
        theActorInTheSpotlight().attemptsTo(
                ClickTextEnrriquecido.selectButton()
        );
    }

    @When("^envío el texto {string}$")
    public void envio_el_texto(String texto) {
        theActorInTheSpotlight().attemptsTo(
                SendText.textInput(texto)
        );
    }

    @Then("^valido que el texto este presente$")
    public void valido_que_el_texto_este_presente() {
        theActorInTheSpotlight().should(
                seeThat("Texto en el campo", ValidateText.textoInField(), equalTo("Hola este es un texto de prueba")));
    }


}
