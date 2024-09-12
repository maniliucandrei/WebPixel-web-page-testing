package common.pages.menus;

import common.pages.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MenusPage extends BaseTest{

    @FindBy(xpath = "//a[contains(text(), 'Library')]")
    private WebElement libraryOption;


    @FindBy(xpath = "//input[@placeholder=\"Search library ...\"]")
    private WebElement searchElement;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> dropDownLibrary;

    @FindBy(xpath = "//div['components']//div//ul//li//a[normalize-space()='Menus']")
    private WebElement menusButton;

    @FindBy(xpath = "//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-8']//div[@class='col']")
    private List<WebElement> menusWidgets;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger']")
    private List<WebElement> menusRedHearts;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-body-tertiary']")
    private List<WebElement> menusDefoultHearts;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//span[@class='text-xs fw-semibold text-body']")
    private List<WebElement> numberOfHearts;




    public void pressLibraryOptions(){
        click(libraryOption);

    }

    public void dropDownLibraryOption(String option){
        click(listOfElements(dropDownLibrary, option));

    }

    public void pressMenusButton(){
        click(menusButton);
    }

    public boolean getCurrentURL(String url){
        return waitPage().until(ExpectedConditions.urlToBe(url));
    }

    public boolean isMenusPopulatedWithWidgets(){
        return menusWidgets.size() > 0;
    }

    public boolean isMenusHeartFunctional(){
        return numberOfHearts.size() == menusWidgets.size();
    }





}
