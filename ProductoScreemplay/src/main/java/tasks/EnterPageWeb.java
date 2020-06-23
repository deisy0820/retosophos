package tasks;

import interactions.JSClick;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;
import userinterfaces.SearchProductUserinterfaces;



import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static utils.enums.Data.SHIPPIN_METHOD;


public class EnterPageWeb implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(SearchProductUserinterfaces.POP_UP));
        WaitUntil.the(SearchProductUserinterfaces.POP_UP, isVisible());
        actor.attemptsTo(Enter.theValue("televisor").into(SearchProductUserinterfaces.SEARCH_PRODUCT));
        actor.attemptsTo(JSClick.on(SearchProductUserinterfaces.CHOOSE_PRODUCT));
        actor.attemptsTo(Enter.theValue("").into(SearchProductUserinterfaces.SEARCH_PRODUCT).thenHit(Keys.ENTER));

        if 	(Text.of(SearchProductUserinterfaces.DELIVERY_METHOD).equals(SHIPPIN_METHOD.getCode())){
             WaitUntil.the(SearchProductUserinterfaces.CART, isVisible());
             actor.attemptsTo(Click.on(SearchProductUserinterfaces.DELIVERY));
         WaitUntil.the(SearchProductUserinterfaces.DELIVERY, isVisible());
         actor.attemptsTo(SelectFromOptions.byVisibleText("Arequipa").from(SearchProductUserinterfaces.DEPARMET));
        actor.attemptsTo(Click.on(SearchProductUserinterfaces.CONTINUE));
            actor.attemptsTo(JSClick.on(SearchProductUserinterfaces.CART));
        }else {
            actor.attemptsTo(JSClick.on(SearchProductUserinterfaces.CART));

        }
        }
    public static EnterPageWeb is(){
        return new EnterPageWeb();

    }
}
