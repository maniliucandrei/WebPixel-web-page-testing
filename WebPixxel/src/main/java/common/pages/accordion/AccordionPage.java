package common.pages.accordion;

import common.pages.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AccordionPage extends BaseTest {

    @FindBy(xpath = "//a[contains(text(), 'Library')]")
    private WebElement libraryOption;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> listOfLibraryOptions;

    @FindBy(xpath = "//a[contains(text(), 'Accordion')]")
    private WebElement accordionOption;

    @FindBy(xpath = "//ul[@class='position-relative flex-fill nav gap-2 flex-nowrap scrollable-x']//li")
    private List<WebElement> listOfComponentsOptions;

    @FindBy(xpath = "//div[@class = 'row gx-lg-8 mt-8']//div[@class  ='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-8']//div[@class = 'col']")
    private List<WebElement> listOfAccordion;

    @FindBy(xpath = "//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger']")
    private List<WebElement> listOfHeartAccordion;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//span")
    private List<WebElement> listOfNumberOfHeartAccordion;


    public void pressLibraryOption(){
        click(libraryOption);
    }

    public void chooseLibraryOption(String option){
        click(listOfElements(listOfLibraryOptions, option));
    }

    public void chooseComponentsOption(String component){
        waitPage().until(ExpectedConditions.visibilityOfAllElements(listOfComponentsOptions));
        click(listOfElements(listOfComponentsOptions, component));
    }

    public boolean getCurrentURL(String url){
        return waitPage().until(ExpectedConditions.urlToBe(url));
    }

    private void chooseAccordionOption(){
        click(accordionOption);
    }

    public boolean isAccordionPagePopulatedWithWidgets() {
//      return (listOfAccordion.size() > 0)? true:false;

/*      if(listOfAccordion.size() > 0){
        return true;}
        else{return false}
 */
        return !listOfAccordion.isEmpty();
    }

    public boolean isListOfHeartAccordionFunctional(){
        return listOfHeartAccordion.size() == listOfAccordion.size();
    }

    public boolean isListOfNumberOfHeartEqualWithListOfHeart(){
        return listOfHeartAccordion.size() == listOfNumberOfHeartAccordion.size();
    }

}
