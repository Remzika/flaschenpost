package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FP_MainPage {

    public FP_MainPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//*[@id='fp_header']/div/nav/ul/li[6]/a")
    public WebElement wasser;

    @FindBy(xpath="//*[@id='zipcode']/div[2]/div/div/input")
    public WebElement zipcode;

    @FindBy(xpath="//*[@id='zipcode']/div[3]/div/button[1]")
    public WebElement button_geht_klar;


    @FindBy(xpath="//*[@id='fp_header']/div[2]/nav/ul/li[6]/div/div/div[1]/div[2]/div/div/div/ul/li[2]/a")
    public WebElement wasser_medium;

}
