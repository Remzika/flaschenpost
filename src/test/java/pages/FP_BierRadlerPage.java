package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FP_BierRadlerPage {
    public FP_BierRadlerPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//*[@id='brandSearch']")
    public WebElement bier_markenauswahl;

    @FindBy(xpath="//*[@id='fp_filter_scroll']/div[1]/div[2]/div/div/div/div")
    public WebElement glucks;

    @FindBy(xpath = "//*[@class='btn btn-link shadow-none fp_article_basket_add']")
    public WebElement warenkorb_glucks_Radler;

    @FindBy(xpath = "//*[@id='fp-basket_overflowHolder']/div[1]/div[2]/div/div/div/div/div[1]/div[1]/div/div[1]")
    public WebElement warenkorb_glucks_Radler_Plus;

    @FindBy(xpath = "//*[@id='sticky_sidebar']/div[1]/div/div/div/div[3]/div[3]/button")
    public WebElement jetzt_bestellen;




}
