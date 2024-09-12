package common.pages.mediaGroups;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import common.pages.base.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MediaGroups extends BaseTest {

    @FindBy(xpath = "//a[contains(text(), 'Library')]")
    private WebElement libraryOption;

    @FindBy(xpath = "//input[@placeholder=\"Search library ...\"]")
    private WebElement searchElement;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> dropDownLibrary;

    @FindBy(xpath = "//div['components']//div//ul//li//a[normalize-space()='Media']")
    private WebElement mediaButton;

    @FindBy(xpath = "//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-8']//div[@class='col']")
    private List<WebElement> mediaGroupsElements;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger']")
    private WebElement mediaGroupsHeartRed;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-body-tertiary']")
    private List<WebElement> mediaGoupsHeartDefoult;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//span[@class='text-xs fw-semibold text-body']")
    private List<WebElement> heartsNumber;



    public void pressLibraryOption(){
        click(libraryOption);
    }

    public void dropDownLibraryOption(String components){
        click(listOfElements(dropDownLibrary, components));

    }

    public void pressMediaButton(){
        click(mediaButton);
    }


    public boolean getCurrentURL(String url){
        return waitPage().until(ExpectedConditions.urlToBe(url));
    }
    public boolean isMediaGroupsPagePopulatedWithWidgets(){
        return !mediaGroupsElements.isEmpty();

    }

    public boolean isMediaGroupsHeartsFunctional(){
        return heartsNumber.size() == mediaGroupsElements.size();
    }




}
