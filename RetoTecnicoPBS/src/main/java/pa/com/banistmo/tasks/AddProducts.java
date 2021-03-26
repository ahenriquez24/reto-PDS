package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pa.com.banistmo.userinterface.SearchProducts;

public class AddProducts implements Task {
    public static AddProducts onCatalog(){
        return Tasks.instrumented(AddProducts.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchProducts.BUTTON_ADD_LIBRARY_SELENIUM),
                Click.on(SearchProducts.BUTTON_ADD_LIBRARY_JS),
                Click.on(SearchProducts.BUTTON_CARRITO),
                Click.on(SearchProducts.BUTTON_ELIMINA)



        );
    }
}
