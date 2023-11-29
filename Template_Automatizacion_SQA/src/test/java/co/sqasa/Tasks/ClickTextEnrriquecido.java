package co.sqasa.Tasks;

import co.sqasa.ui.BasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickTextEnrriquecido implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BasePage.BUTTON_ENRICHED)
        );
    }
    public static ClickTextEnrriquecido selectButton (){
        return Tasks.instrumented(ClickTextEnrriquecido.class);
    }
}
