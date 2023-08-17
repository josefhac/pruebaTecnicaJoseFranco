package co.com.choucair.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestPersonalInformationPage extends PageObject {
    public static final Target INPUT_FIRST_NAME = Target.the("Where do we write the first name").
            located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("Where do we write the last name").
            located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Where do we write the email").
            located(By.id("email"));
    public static final Target BIRTH_MONTH = Target.the("Where we select birth month").
            located(By.id("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("Where we select birth day").
            located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Where we select birth year").
            located(By.id("birthYear"));
    public static final Target LOCATION_BUTTON = Target.the("Button that shows us the form about location").
            located(By.xpath("//span[contains(text(),'Next: Location')]"));

    public static final Target CITY = Target.the("City of residence").
            located(By.id("city"));

    public static final Target POSTAL_CODE = Target.the("Zip or postal code").
            located(By.id("zip"));

    public static final Target DEVICES_BUTTON = Target.the("Button that shows us the form about devices").
            located(By.xpath("//span[contains(text(),'Next: Devices')]"));

    public static final Target LAST_STEP = Target.the("Button that show the form to create password ").
            located(By.xpath("//span[contains(text(),'Next: Last Step')]"));

    public static final Target INPUT_PASSWORD = Target.the("Where we create utest password").
            located(By.id("password"));

    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Where we confirm utest password").
            located(By.id("confirmPassword"));

    public static final Target CHECK_TERMS_OF_USE = Target.the("Where we acept utest terms of use ").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[5]/label[1]/span[1]"));

    public static final Target CHECK_PRIVACY_POLICY = Target.the("Where we acept utest privacy and security policy ").
            located(By.xpath("//body/ui-view[1]/main[1]/section[1]/div[1]/div[2]/div[1]/div[2]/div[1]/form[1]/div[6]/label[1]/span[1]"));

    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Button to complete setup").
            located(By.id("laddaBtn"));

    public static final Target WELCOME_MESSAGE = Target.the("welcome message").
            located(By.xpath("//h1[contains(text(),\"Welcome to the world's largest community of freela\")]"));

}
