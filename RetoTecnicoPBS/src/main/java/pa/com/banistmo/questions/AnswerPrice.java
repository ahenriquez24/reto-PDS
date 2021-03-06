package pa.com.banistmo.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.banistmo.userinterface.SearchProducts;

public class AnswerPrice implements Question<Boolean> {
    private String question;
    public AnswerPrice(String question){
        this.question=question;
    }

    public static AnswerPrice toThe(String question){ return new AnswerPrice((question));}

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        try {
            Thread.sleep(5*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        String valor = Text.of(SearchProducts.VALOR).viewedBy(actor).asString();
        valor = valor.replace("₹","0");
        Double precio=Double.parseDouble(valor);
        System.out.println("atrapa:"+precio);
        Double montobase = Double.parseDouble(question);
        if (montobase >= precio) {
            result = true;
        } else
            result = false;

        return result;
    }

        }


