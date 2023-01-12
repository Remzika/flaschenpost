package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FP_WasserMediumPage {


    public FP_WasserMediumPage(){PageFactory.initElements(Driver.getDriver(), this);}

    @FindBy(xpath="//*[@id='brandSearch']")
    public WebElement brandSearch;

    @FindBy(xpath="//*[@id='fp_filter_scroll']/div[1]/div[2]/div/div/div")
    public WebElement simplebar;

    @FindBy(xpath="//*[@id='fp_filter_scroll']/div[1]/div[2]/div/div/div/div")
    public WebElement gerolsteiner;

    @FindBy(xpath="//div[@class='fp_product_details']//div[1]//div[2]//button[1]//img[1]")
    public WebElement gerolsteiner_6x1L_Glass;

    @FindBy(xpath="//*[@id='fp_header']/div/nav/ul/li[8]/a")
    public WebElement bier;

    @FindBy(xpath="//*[@id='fp_header']/div[2]/nav/ul/li[8]/div/div/div[1]/div[2]/div/div/div/ul/li[4]/a")
    public WebElement radler;


}
