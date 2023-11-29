package co.sqasa.Tasks;

import co.sqasa.ui.BasePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class SendText implements Task {

    private final String textToSend;

    public SendText(String textToSend) {
        this.textToSend = textToSend;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(textToSend).into(BasePage.FIELD_TEXT)
        );
    }

    public static SendText textInput(String textToSend) {
        return new SendText(textToSend);
    }
}
