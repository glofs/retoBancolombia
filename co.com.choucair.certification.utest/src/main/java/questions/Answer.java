package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.UtestRegister;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {

        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String utestMessage= Text.of(UtestRegister.MESSAGE_FINAL).viewedBy(actor).asString();
        if (question.equals(utestMessage)) {
            result=true;
        }else{
            result= false;
        }
        return result;
    }
}
