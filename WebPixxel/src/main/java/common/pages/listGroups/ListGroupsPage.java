
package common.pages.listGroups;
import common.pages.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class ListGroupsPage extends BaseTest{

    @FindBy(xpath = "//a[contains(text(), 'Library')]")
    private WebElement libraryOption;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> dropDownLibrary;

    @FindBy(xpath = "//input[@placeholder=\"Search library ...\"]")
    private WebElement searchElement;

    @FindBy(xpath = "//div['components']//div//ul//li//a[normalize-space()='List Groups']")
    private WebElement listGroupsButton;

    @FindBy(xpath = "//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-8']//div[@class='position-relative card-img-top']")
    private List<WebElement> listGroupsWidgets;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-body-tertiary']")
    private List <WebElement> listGroupsHearts;



    public void pressLibraryOptions(){
        click(libraryOption);

    }

    public void dropDownLibraryOption(String option){
        click(listOfElements(dropDownLibrary, option));

    }

    public void pressListGroupsButton(){
        click(listGroupsButton);
    }

    public boolean isListGroupsPopulated(){
        return listGroupsWidgets.size() > 0;

    }

    public boolean isListGroupsHeartsFunctional(){
        return listGroupsHearts.size() == listGroupsWidgets.size();
    }

    public boolean getCurrentURL(String url){
        return waitPage().until(ExpectedConditions.urlToBe(url));
    }















}



