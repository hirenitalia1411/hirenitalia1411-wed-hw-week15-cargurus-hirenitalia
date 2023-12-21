package au.com.carsguide.pages;

import au.com.carsguide.Utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @CacheLookup
    @FindBy (xpath = "//a[@class = 'uhf-top']")
    List<WebElement> topMenu;

    @CacheLookup
    @FindBy (xpath = "(//ul[@class = 'uhf-menu']/li/div//a)[1]")
    WebElement searchCarsOption;

    @CacheLookup
    @FindBy (xpath = "(//ul[@class = 'uhf-menu']/li/div//a)[2]")
    WebElement usedOption;

    @CacheLookup
    @FindBy (xpath = "(//ul[@class = 'uhf-menu']/li/div//a)[4]")
    WebElement findADealerOption;

    public void selectTopMenuOptions(String option){
        for (WebElement e : topMenu) {
            mouseHoverToElement(e);
            break;
        }
        log.info("Mouse hovering on " + option + " :" + topMenu.toString() );
    }

    public void clickOnSearchCarsOptionInBuyAndSellTopMenu() {
        clickOnElement(searchCarsOption);
        log.info("Clicking on search cars option in buy + sell menu : " + searchCarsOption.toString());
    }

    public void clickOnUsedOptionInBuyAndSellTopMenu() {
        clickOnElement(usedOption);
        log.info("Clicking on used option in buy + sell menu : " + usedOption.toString());
    }

    public void clickOnFindADealerOptionInBuyAndSellTopMenu() {
        clickOnElement(findADealerOption);
        log.info("Clicking on find a dealer option in buy + sell menu : " + findADealerOption.toString());
    }
}
