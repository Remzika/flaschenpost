package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CheckoutPage {

    public CheckoutPage(){PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//*[@id='fp-basket_overflowHolder']/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div/div[3]")
    public WebElement warenkorb_glucks_Radler_Minus;

    @FindBy(xpath = "//*[@id='fp-basket_overflowHolder']/div[1]/div[2]/div/div/div/div/div[1]")
    public WebElement warenkorb_glucks_Radler_Naturtrub;

    @FindBy(xpath = "//*[@id='fp-basket_overflowHolder']/div[1]/div[2]/div/div/div/div/div[2]")
    public WebElement warenkorb_gerolsteiner_6x1L_Glass;


}
