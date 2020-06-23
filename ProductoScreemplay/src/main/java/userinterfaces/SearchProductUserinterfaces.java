package userinterfaces;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;



public class SearchProductUserinterfaces  {
    public static final Target POP_UP = Target.the("Pop_uo").located(By.id("onesignal-popover-cancel-button"));
    public static final Target SEARCH_PRODUCT = Target.the("Search product").located(By.id("search-autocomplete-input"));
    public static final Target CHOOSE_PRODUCT = Target.the("Choose product").located(By.xpath("//*[@id=\"header\"]/div/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[4]/button"));
    public static final Target DELIVERY = Target.the("Delivery").located(By.xpath("//*[@id=\"shipping-preference-metro\"]/div/div/div[1]/div[1]/div[3]/button[1]/div[2]/i"));
    public static final Target DEPARMET = Target.the("Deparmet").located(By.id("select-department"));
    public static final Target CONTINUE = Target.the("Continue").located(By.xpath("//*[@id=\"shipping-preference-metro\"]/div/div/div[1]/div[2]/div[2]/button"));
    public static final Target CART = Target.the("Cart").located(By.xpath("//*[@id=\"search-results-page\"]/div[19]/div[1]/button[2]"));
    public static final Target PRODUCT_IN_CART = Target.the("Product in cart ").located(By.xpath("//*[@id=\"minicart-navigation\"]//*[contains(text(),'Televisor')]"));
    public static final Target DELIVERY_METHOD = Target.the("Delivery_Method ").located(By.xpath("//*[@id=\"shipping-preference-metro\"]/div/div/div[1]/div[1]/div[1]/span[2]]"));




}