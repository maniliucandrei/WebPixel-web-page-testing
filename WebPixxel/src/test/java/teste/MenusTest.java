package teste;

import common.pages.base.BaseTest;
import common.pages.menus.MenusPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenusTest extends BaseTest {

    @Test(description = "Menus Test")
    public void menusTest() {

        MenusPage menusPage = new MenusPage();
        menusPage.pressLibraryOptions();
        menusPage.dropDownLibraryOption("Components");
        menusPage.pressMenusButton();
        Assert.assertTrue(menusPage.getCurrentURL("https://dev.webpixels.io/library/components/menus"));
        Assert.assertTrue(menusPage.isMenusPopulatedWithWidgets());
        Assert.assertTrue(menusPage.isMenusHeartFunctional());



    }
}
