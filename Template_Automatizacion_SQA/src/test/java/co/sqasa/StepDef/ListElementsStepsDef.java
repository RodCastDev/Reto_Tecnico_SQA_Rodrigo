package co.sqasa.StepDef;

import co.sqasa.Tasks.ClickList;
import co.sqasa.Tasks.ClickTextEnrriquecido;
import cucumber.api.java.Before;
import cucumber.api.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ListElementsStepsDef {

    /*
    El pago Given hereda de TestTextStepDef
     */
    @Managed(driver = "chrome")
    WebDriver hisdriver;

    @Before
    public void setThestage() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("User");
    }

    @When("^seleccion lista de tareas$")
    public void selecciono_nota_de_texto_enriquecido() {
        theActorInTheSpotlight().attemptsTo(
                ClickList.selectButtonList()
        );
    }

    @When("^agrego seis tareas$")
    public void agregoSeisTareas() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hola5");
    }

    @Then("^elimino una de las tareas$")
    public void eliminoUnaDeLasTareas() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Hola6");
    }
}

