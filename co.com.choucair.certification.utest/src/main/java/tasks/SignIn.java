package tasks;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;
import userinterface.UtestRegister;

import static java.lang.Thread.sleep;


public class SignIn implements Task {
    public static SignIn site() {
        return Tasks.instrumented(SignIn.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(Click.on(UtestRegister.JOIN_TODAY),
                    Enter.theValue("Gustavo").into(UtestRegister.FIRST_NAME),
                    Enter.theValue("Lozada").into(UtestRegister.LAST_NAME),
                    Enter.theValue("gustavito@gmail.com").into(UtestRegister.EMAIL_ADDRESS),
                    SelectFromOptions.byVisibleText("October").from(UtestRegister.MONTH_DROPDOWNS),
                    SelectFromOptions.byIndex(31).from(UtestRegister.DAY_DROPDOWNS),
                    SelectFromOptions.byVisibleText("1991").from(UtestRegister.YEAR_DROPDOWNS),
                    Scroll.to(UtestRegister.SCROLL_FORM),
                    Click.on(UtestRegister.NEXT_LOCATION),
                    //
                    Enter.theValue("cartagena, colombia").into(UtestRegister.CITY));
                    Thread.sleep(10000);//Google Maps Enable
                    actor.attemptsTo(
                            Hit.the(Keys.ADD).into(UtestRegister.CITY),
                            Hit.the(Keys.ARROW_DOWN).into(UtestRegister.CITY),
                            Hit.the(Keys.ENTER).into(UtestRegister.CITY),
                            Enter.theValue("0500").into(UtestRegister.ZIP_CODE).thenHit(Keys.ENTER),
                            Click.on(UtestRegister.NEXT_DEVICE),
                            //
                            Click.on(UtestRegister.NEXT_LAST_STEP),
                            //
                            Enter.theValue("gustavolozadaF8").into(UtestRegister.PASSWORD),
                            Enter.theValue("gustavolozadaF8").into(UtestRegister.CONFIRM_PASSWORD),
                            Click.on(UtestRegister.TERMS_OF_USES),
                            Click.on(UtestRegister.SECURITY_POLICY),
                            Click.on(UtestRegister.COMPLETE_SETUP));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
