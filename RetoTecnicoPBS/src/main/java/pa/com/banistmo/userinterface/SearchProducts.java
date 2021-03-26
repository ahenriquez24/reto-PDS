package pa.com.banistmo.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchProducts extends PageObject {
    public static final Target BUTTON_ADD_LIBRARY_SELENIUM=Target.the("Agrega libro selenium").located(By.xpath("//a[@href=\"/shop/?add-to-cart=160\"]"));
    public static final Target BUTTON_ADD_LIBRARY_JS=Target.the("Agrega libro javascript").located(By.xpath("//a[@href=\"/shop/?add-to-cart=165\"]"));
    public static final Target BUTTON_CARRITO=Target.the("Ir a carrito").located(By.xpath("//span[contains(@class,'cartcontents')]"));
    public static final Target BUTTON_ELIMINA=Target.the("elimina item").located(By.xpath("//a[@data-product_id=\"160\"]"));
    public static final Target VALOR=Target.the("precio").located(By.xpath("//span[@class=\"woocommerce-Price-amount amount\"]"));
}
