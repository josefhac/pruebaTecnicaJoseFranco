package co.com.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestJoinPage extends PageObject {
    public static final Target JOIN_BUTTON = Target.the("Button that shows us the form to join").
            located(By.className("unauthenticated-nav-bar__sign-up"));
}
