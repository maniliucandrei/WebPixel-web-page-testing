package common.pages.pricing;

import common.pages.base.BaseTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class Pricing extends BaseTest {

    @FindBy(xpath = "//a[contains(text(), 'Pricing')]")
    private WebElement pricing;

    @FindBy(xpath = "//div[@class='dropdown-menu show']//a")
    private List<WebElement> listOfLibraryOptions;


}
