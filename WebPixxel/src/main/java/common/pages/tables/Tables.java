package common.pages.tables;

import common.pages.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Tables extends BaseTest {
    @FindBy(xpath = "//a[contains(text(), 'Library')]")
    private WebElement libraryOption;
    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> listOfLibraryOptions;
    @FindBy(xpath = "//input[@placeholder=\"Search library ...\"]")
    private WebElement searchElement;
    @FindBy(xpath = "//div[@class='row row-cols-1 row-cols-sm-2 row-cols-md-3 g-6']//div[@class=\"col\"]")
    private List<WebElement> tablesElements;
    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//i[@class=\"bi bi-heart-fill text-sm text-opacity-50-hover text-opacity-100 text-danger\"]")
    private List<WebElement> listOfGroupsHeartRed;
    @FindBy(xpath = "//div[@class='d-inline-flex ms-auto gap-3']//div[@class='d-inline-flex gap-1 align-items-center text-body-tertiary'][1]//span")
    private List<WebElement> tablesHeartsNumber;

}
