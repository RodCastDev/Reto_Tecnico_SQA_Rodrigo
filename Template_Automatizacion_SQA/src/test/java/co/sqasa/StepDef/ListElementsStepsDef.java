package co.sqasa.StepDef;

import co.sqasa.Tasks.ClickList;
import co.sqasa.Tasks.ClickTextEnrriquecido;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
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
}

