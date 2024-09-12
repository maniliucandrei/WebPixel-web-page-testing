package common.pages.contact;

import common.pages.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ContactPage extends BaseTest {

    @FindBy(xpath = "//a[normalize-space() ='Library']")
    private WebElement libraryOption;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a]")
    private List<WebElement> listOfLibraryOptions;

    @FindBy(xpath = "//div[@class='container mw-screen-xxl mt-lg-2 mb-10 px-lg-10']//ul[@class='position-relative flex-fill nav gap-2 flex-nowrap scrollable-x']//li")
    private List<WebElement> listOfContactSections;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary']//i[@class='bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger']")
    private List<WebElement> listOfHeartsContact;

    @FindBy(xpath = "//div[@class='d-flex align-items-center gap-1']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//span")
    private List<WebElement> numberOfHeartsContact;

    @FindBy(xpath = "//img[@class='position-absolute z-1']")
    private List<WebElement> contactElements;

    @FindBy(xpath = "//input[@class='form-control form-control-muted ps-2 rounded-end-pill']")
    private WebElement searchLibrary;
}
