package co.sqasa.noteQuestions;

import co.sqasa.ui.BasePage;
import net.serenitybdd.screenplay.Question;

public abstract class ValidateText implements Question {

    public static Question<String> textoInField() {
        return actor -> (BasePage.FIELD_TEXT.resolveFor(actor).getText().trim());
    }
}
