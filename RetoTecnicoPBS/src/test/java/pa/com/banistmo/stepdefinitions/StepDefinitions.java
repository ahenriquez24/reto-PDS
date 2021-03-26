package pa.com.banistmo.stepdefinitions;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.questions.AnswerPrice;
import pa.com.banistmo.tasks.AbrirPagina;
import pa.com.banistmo.tasks.AddProducts;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class StepDefinitions {
    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que ingreso la pagina de practice\\.automation$")
    public void queIngresoLaPaginaDePracticeAutomation() {
        theActorCalled("Angel").wasAbleTo(AbrirPagina.banistmo());
    }


    @Cuando("^carga los libros al carrito eliminando el de mayor costo$")
    public void cargaLosLibrosAlCarritoEliminandoElDeMayorCosto() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddProducts.onCatalog());

    }

    @Entonces("^verifica sea menor a \"([^\"]*)\" el valor final de la compra$")
    public void verificaSeaMenorAElValorFinalDeLaCompra(String question) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPrice.toThe(question)));



    }
}
