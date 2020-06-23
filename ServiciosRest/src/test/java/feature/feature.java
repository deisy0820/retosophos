package feature;



import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.ServicesStep;

@RunWith(SerenityRunner.class)
public class feature {

    @Steps
    public ServicesStep shopos;

    @Test
    public void serviceResponse() {
        shopos.theUserHasConnectionWithTheUserApi();
        shopos.theUserReadARegisterInUserApiAndHasTheAnswer("1830");

    }

}
