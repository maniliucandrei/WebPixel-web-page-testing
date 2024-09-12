package common.pages.progress;


import common.pages.base.BaseTest;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProgressPage extends BaseTest {

    @FindBy(xpath = "//div[@class=\"position-fixed start-50 transform translate-x-n50 bg-white p-2 rounded-4 border shadow-5 z-1 bottom-0 mb-6\"]//button//i")
    private List<WebElement> orientationWidgets;

    @FindBy(xpath = "//div[@class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-6\"]//div[@class=\"position-relative card-img-top\"]")
    private List<WebElement> progressWidgets;

    @FindBy(xpath = "//div[@class=\"row row-cols-1 row-cols-sm-2 row-cols-md-3 g-6\"]//div[@class=\"d-inline-flex ms-auto gap-3\"]//div[@class=\"d-inline-flex gap-1 align-items-center text-body-tertiary\"][1]//i")
    private List<WebElement> favoritesWidgets;

    @FindBy(xpath = "//input[@class=\"form-control form-control-muted ps-2 rounded-end-pill\"]")
    private WebElement searchLibrary;

    public void clickSearchbox(){
        click(searchLibrary);
    }

    public void searchComponent(String text){
        addText(text, searchLibrary);
        enterInput();
    }

    private void enterInput(){
//        action.sendKeys(Keys.ENTER);
    }

    public boolean componentIsPopulated(){
        return(progressWidgets.size() > 0)? true:false;
    }

    public boolean heartNumbersEqualsWidgetNumbers(){
        return(favoritesWidgets.size() == progressWidgets.size())? true:false;
    }

    }

