package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.SearchProductUserinterfaces;

public class MessageRegisteredProduct implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        String result =  Text.of(SearchProductUserinterfaces.PRODUCT_IN_CART).viewedBy(actor).resolve();

        return result;
    }
    public static MessageRegisteredProduct is() {
        return new MessageRegisteredProduct();
    }
}
