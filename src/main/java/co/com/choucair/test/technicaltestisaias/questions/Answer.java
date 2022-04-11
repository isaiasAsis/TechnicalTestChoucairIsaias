package co.com.choucair.test.technicaltestisaias.questions;

import co.com.choucair.test.technicaltestisaias.userinterface.UtestRegisterPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean>{

    private String question;


    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String titleLastStep = Text.of(UtestRegisterPage.TITLE_LAST_STEP).viewedBy(actor).asString();
        boolean result;
        if(question.equalsIgnoreCase(titleLastStep)){
            result = true;
        }else{
            result = false;
        }
        return result;
    }
}
