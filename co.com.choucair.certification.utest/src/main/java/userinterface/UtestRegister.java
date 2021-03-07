package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class UtestRegister {
    public static final Target JOIN_TODAY= Target.the("Sign in button").located(By.className("unauthenticated-nav-bar__sign-up"));
    public static final Target FIRST_NAME= Target.the("First name").located(By.id("firstName"));
    public static final Target LAST_NAME=Target.the("Last name").located(By.id("lastName"));
    public static final Target EMAIL_ADDRESS=Target.the("Email address").located(By.id("email"));
    public static final Target MONTH_DROPDOWNS=Target.the("Month of birth").located(By.id("birthMonth"));
    public static final Target DAY_DROPDOWNS=Target.the("Day of birth").located(By.name("birthDay"));
    public static final Target YEAR_DROPDOWNS=Target.the("Year of birth").located(By.id("birthYear"));
    public static final Target SCROLL_FORM=Target.the("Scroll on the form").located(By.className("form-group-box"));
    public static final Target NEXT_LOCATION=Target.the(" Button Next location").located(By.xpath("//A[@aria-label='Next step - define your location']"));
    //
    public static final Target CITY=Target.the("User's city").located(By.id("city"));
    public static final Target ZIP_CODE=Target.the("zip code of city").located(By.id("zip"));
    public static final Target NEXT_DEVICE=Target.the(" button Next device").located(By.xpath("//A[@aria-label='Next step - select your devices']"));
    //
    public static final Target NEXT_LAST_STEP=Target.the(" button Last step").located(By.xpath("//A[@aria-label='Next - final step']"));
    //
    public static final Target PASSWORD=Target.the("Paswword of user").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD= Target.the("Confirmation about your password").located(By.id("confirmPassword"));
    public static final Target TERMS_OF_USES=Target.the(" Utest terms of uses").located(By.xpath("(//LABEL[@class='input-check-box signup-consent'])[1]"));
    public static final Target SECURITY_POLICY=Target.the("privacy and security policy").located(By.xpath("(//LABEL[@class='input-check-box signup-consent'])[2]"));
    public static final Target COMPLETE_SETUP=Target.the("Button complete setup").located(By.xpath("//A[@id='laddaBtn']"));
    //
    public static final Target MESSAGE_FINAL=Target.the("Mesagge welcome after user register").located(By.className("image-box-header"));
}
