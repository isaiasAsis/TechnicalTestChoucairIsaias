package co.com.choucair.test.technicaltestisaias.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestRegisterPage extends PageObject {

    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target SELECT_MONTH_OF_BIRTH = Target.the("where we select the month of birth")
            .located(By.id("birthMonth"));
    public static final Target SELECT_DAY_OF_BIRTH = Target.the("where we select the day of birth")
            .located(By.id("birthDay"));
    public static final Target SELECT_YEAR_OF_BIRTH = Target.the("where we select the year of birth")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGE = Target.the("where do we write the language")
            .located(By.xpath("//*[@id=\"languages\"]/div[1]/input"));
    public static final Target BUTTON_NEXT_LOCATION = Target.the("click to go to the next location")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target INPUT_CITY = Target.the("where we select the city")
            .located(By.id("city"));
    public static final Target INPUT_POSTAL_CODE= Target.the("where we select the postal code")
            .located(By.id("zip"));
    public static final Target INPUT_COUNTRY = Target.the("where we select the country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]/span/span[2]"));
    public static final Target INPUT_COUNTRY_TEXT = Target.the("where we write the country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BUTTON_NEXT_DEVICES = Target.the("click to go to the next devices")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target INPUT_MOBILE_BRAND = Target.the("where we select the mobile brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MOBILE_BRAND_TEXT = Target.the("where we write the mobile brand")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[1]/div[2]/div/input[1]"));
    public static final Target INPUT_MOBILE_MODEL = Target.the("where we select the mobile model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/div[1]/span/span[1]"));
    public static final Target INPUT_MOBILE_MODEL_TEXT = Target.the("where we write the mobile model")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[2]/div[2]/div/input[1]"));
    public static final Target INPUT_MOBILE_OS = Target.the("where we select the mobile OS")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/div[1]/span"));
    public static final Target INPUT_MOBILE_OS_TEXT = Target.the("where we write the mobile OS")
            .located(By.xpath("//*[@id=\"mobile-device\"]/div[3]/div[2]/div/input[1]"));
    public static final Target BUTTON_LAST_STEP = Target.the("click to go to the last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the confirm password")
            .located(By.id("confirmPassword"));
    public static final Target CHECK_TERMS = Target.the("click to accept terms")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECK_PRIVACY_POLICY = Target.the("click to accept privacy policy")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("click to complete setup")
            .located(By.id("laddaBtn"));
    public static final Target TITLE_LAST_STEP = Target.the( "extract the title from the last step")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[1]/div/div/h1/span[2]"));
}
