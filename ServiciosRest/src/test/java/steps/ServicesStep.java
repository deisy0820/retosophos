package steps;

import net.serenitybdd.screenplay.Actor;
import net.thucydides.core.annotations.Step;
import net.serenitybdd.screenplay.rest.abiities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;


public class ServicesStep {
    private Actor Sophos = Actor.named("Sophos");
    private String baseurl = "https://gorest.co.in/public-api/";

    @Step("the user has connection with the user Ap$")
    public void theUserHasConnectionWithTheUserApi() {
        Sophos.whoCan(CallAnApi.at(baseurl));
    }
    @Step("the user read a register in user Api and has the answer")
    public void theUserReadARegisterInUserApiAndHasTheAnswer(String register) {
        Sophos.attemptsTo(Get.resource("users/" + register + "?access-token=KJegFaF_VPJ-IkYVwCdNLhCaOLpi3nBWR4Pl"));
    }

}

