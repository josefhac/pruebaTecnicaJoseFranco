package co.com.choucair.tasks;

import co.com.choucair.userinterface.UtestJoinPage;
import co.com.choucair.userinterface.UtestPersonalInformationPage;
import com.ibm.icu.impl.UResource;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromElement;
import net.thucydides.core.pages.components.Dropdown;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FillOutPersonalInformation implements Task {
    public static FillOutPersonalInformation onThePage() {
        return Tasks.instrumented(FillOutPersonalInformation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Jose").into(UtestPersonalInformationPage.INPUT_FIRST_NAME),
                Enter.theValue("Franco").into(UtestPersonalInformationPage.INPUT_LAST_NAME),
                Enter.theValue("jose.franco.henao@gmail.com").into(UtestPersonalInformationPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText("June").from(UtestPersonalInformationPage.BIRTH_MONTH),
                SelectFromOptions.byVisibleText("8").from(UtestPersonalInformationPage.BIRTH_DAY),
                SelectFromOptions.byVisibleText("1995").from(UtestPersonalInformationPage.BIRTH_YEAR),
                Click.on(UtestPersonalInformationPage.LOCATION_BUTTON),
                SendKeys.of("Medellin"+Keys.ESCAPE+Keys.ARROW_DOWN+Keys.ENTER).into(UtestPersonalInformationPage.CITY),
                Enter.theValue("050005").into(UtestPersonalInformationPage.POSTAL_CODE),
                Click.on(UtestPersonalInformationPage.DEVICES_BUTTON),
                Click.on(UtestPersonalInformationPage.LAST_STEP),
                Enter.theValue("PruebaTecnica2023").into(UtestPersonalInformationPage.INPUT_PASSWORD),
                Enter.theValue("PruebaTecnica2023").into(UtestPersonalInformationPage.INPUT_CONFIRM_PASSWORD),
                Click.on(UtestPersonalInformationPage.CHECK_TERMS_OF_USE),
                Click.on(UtestPersonalInformationPage.CHECK_PRIVACY_POLICY),
                Click.on(UtestPersonalInformationPage.COMPLETE_SETUP_BUTTON));





    }


}
