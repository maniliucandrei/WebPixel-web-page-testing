package common.pages.modals;


import common.pages.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ModalsPage extends BaseTest {

    @FindBy(xpath = "//a[contains(text(), 'Library')]")
    private WebElement libraryOption;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> listOfLibraryOptions;

    @FindBy(xpath = "//a[@class=\"nav-link border rounded-pill py-2 text-heading bg-light fw-semibold text-primary\"]")
    private WebElement modalsOption;

    @FindBy(xpath = "//i[@class=\"bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger\"]")
    private List<WebElement> listOfHeartModals;

    @FindBy(xpath = "//div[@class=\"d-flex align-items-center gap-1\"]//div[@class=\"d-inline-flex gap-1 align-items-center text-body-tertiary\"][1]//span")
    private List<WebElement> listOfNumberOfHeartModals;
}
