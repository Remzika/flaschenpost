package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.CheckoutPage;
import pages.FP_MainPage;
import pages.FP_BierRadlerPage;
import pages.FP_WasserMediumPage;
import utilities.BrowserUtilities;
import utilities.ConfigReader;
import utilities.Driver;

public class US001 {
    FP_MainPage mainpage = new FP_MainPage();
    FP_WasserMediumPage wasserMediumPage = new FP_WasserMediumPage();
    FP_BierRadlerPage bierRadlerPage = new FP_BierRadlerPage();
    CheckoutPage checkoutPage = new CheckoutPage();

    @Given("the user is on the {string} page")
    public void theUserIsOnThePage(String page) {
        Driver.getDriver().get(ConfigReader.getProperty(page));
    }

    @And("enter zip code of the distrubition region")
    public void enter_zip_code_of_the_distrubition_region() {
        BrowserUtilities.waitFor(1000);
        mainpage.zipcode.click();
        mainpage.zipcode.sendKeys("40477");
        mainpage.button_geht_klar.click();
    }
    @And("go to category Wasser and choose Medium")
    public void goToCategoryWasserAndChooseMedium() {
        BrowserUtilities.waitFor(1000);
        mainpage.wasser.click();
        BrowserUtilities.waitFor(1000);
        mainpage.wasser_medium.click();
    }
    @And("type Dreiser in the textbox named Markenauswahl")
    public void typeDreiserInTheTextboxNamedMarkenauswahl() {
        wasserMediumPage.brandSearch.click();
        wasserMediumPage.brandSearch.sendKeys("Dreiser");
        BrowserUtilities.waitFor(1000);
    }
    @And("Check the checkbox named Dreiser if it exists, if not, choose another brand and add to cart")
    public void checkbox_control_and_a_brand_add_to_cart() {
        if(wasserMediumPage.simplebar.isDisplayed()){
            wasserMediumPage.simplebar.click();
        }else {
            wasserMediumPage.brandSearch.clear();
            wasserMediumPage.brandSearch.sendKeys("Gerolsteiner");
            BrowserUtilities.waitFor(1000);
            wasserMediumPage.gerolsteiner.click();
            wasserMediumPage.gerolsteiner_6x1L_Glass.click();
            BrowserUtilities.waitFor(1000);
        }
    }
    @And("go to category Bier, choose Radler and find Glucks Radler Naturtrub and Add two articles in the cart")
    public void bier_GlucksRadlerNaturtrub_Add_Two_Articles_In_The_Cart() {
        wasserMediumPage.bier.click();
        BrowserUtilities.waitFor(2000);
        wasserMediumPage.radler.click();
        BrowserUtilities.waitFor(3000);
        if(bierRadlerPage.bier_markenauswahl.isDisplayed()){
            //bierRadlerPage.bier_markenauswahl.click();
            bierRadlerPage.bier_markenauswahl.sendKeys("Glucks");
            BrowserUtilities.waitFor(4000);

        }else {
            BrowserUtilities.waitFor(2000);
            bierRadlerPage.bier_markenauswahl.sendKeys("Glucks");
            BrowserUtilities.waitFor(1000);
        }
        bierRadlerPage.glucks.click();
        BrowserUtilities.waitFor(2000);
        bierRadlerPage.warenkorb_glucks_Radler.click();
        BrowserUtilities.waitFor(1000);
        bierRadlerPage.warenkorb_glucks_Radler_Plus.click();
    }
    @And("Click Jetzt bestellen button and In the cart on the right-hand-side reduce the number of Glucks Radler Naturtrub to one")
    public void bestellen_And_Reduce_The_Number_Of_GlucksRadlerNaturtrub_To_One() {
        bierRadlerPage.jetzt_bestellen.click();
        BrowserUtilities.waitFor(2000);
        checkoutPage.warenkorb_glucks_Radler_Minus.click();
        BrowserUtilities.waitFor(1000);
    }
    @Then("checks if all the expected products are in the cart")
    public void checks_If_All_The_Expected_Products_Are_In_The_Cart() {
        BrowserUtilities.waitFor(1000);
        Assert.assertTrue(checkoutPage.warenkorb_glucks_Radler_Naturtrub.isDisplayed());
        Assert.assertTrue(checkoutPage.warenkorb_gerolsteiner_6x1L_Glass.isDisplayed());
    }

    @Then("the user sees the screenshot")
    public void theUserSeesTheScreenshot() {
        Assert.assertTrue(false);
    }
}
