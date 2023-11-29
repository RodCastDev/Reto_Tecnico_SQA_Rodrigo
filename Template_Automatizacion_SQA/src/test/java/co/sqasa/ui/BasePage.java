package co.sqasa.ui;

import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BasePage extends PageObject {

    public static final Target BUTTON_ENRICHED = Target.the("Boton texto enrriquesido").located(By.id("richtextnote-tab"));
    public static final Target FIELD_TEXT = Target.the("Campo texto enrriquesido").located(By.id("editor"));
    public static final Target BUTTON_LIST_TASKS = Target.the("Boton lista de tareas").located(By.id("tasklist-tab"));
}
