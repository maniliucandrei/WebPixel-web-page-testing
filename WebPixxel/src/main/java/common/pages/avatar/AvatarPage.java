package common.pages.avatar;

import common.pages.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class AvatarPage extends BaseTest {

    @FindBy(xpath = "//a[contains(text(), 'Library')]")
    private WebElement libraryOption;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> libraryOptionList;

    @FindBy(xpath = "//ul[@class='position-relative flex-fill nav gap-2 flex-nowrap scrollable-x']//li")
    private List<WebElement> listOfComponentsOptionsAvatar;

    @FindBy(xpath = "//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-8']//div[@class='col']")
    private List<WebElement> avatarWidgets;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger']")
    private List<WebElement> redHeartAvatar;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-body-tertiary']")
    private List<WebElement> greyHeartAvatar;

    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//span")
    private List<WebElement> listOfNumberOfHeartsAvatar;


    public void pressLibraryOption(){

        click(libraryOption);
    }

    public void chooseLibraryOption(String option) {

        click(listOfElements(libraryOptionList, option));
    }

    public void chooseComponentsOption(String component) {
        waitPage().until(ExpectedConditions.visibilityOfAllElements(listOfComponentsOptionsAvatar));
        click(listOfElements(listOfComponentsOptionsAvatar, component));
    }

    public boolean getCurrentURL(String url){

        return waitPage().until(ExpectedConditions.urlToBe(url));
    }

    public boolean isAvatarPagePopulatetedWithWidgets(){
        return !avatarWidgets.isEmpty();
    }

    public boolean isListOfHartsfromAvatarFunctional(){
        return avatarWidgets.size() == (greyHeartAvatar.size() + redHeartAvatar.size());
    }

    public boolean isListOfNumberOfHeartEqualWithListOfHeart(){
        return (greyHeartAvatar.size() + redHeartAvatar.size()) == listOfNumberOfHeartsAvatar.size();
    }

}
