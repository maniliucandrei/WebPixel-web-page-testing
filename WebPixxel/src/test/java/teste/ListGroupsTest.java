package teste;

import common.pages.accordion.AccordionPage;
import common.pages.base.BaseTest;
import common.pages.listGroups.ListGroupsPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ListGroupsTest extends BaseTest {

    @Test(description = "ListGroups Test")
    public void listGroupsTest() {
        ListGroupsPage listGroupsPage = new ListGroupsPage();
        listGroupsPage.pressLibraryOptions();
        listGroupsPage.dropDownLibraryOption("Components");
        listGroupsPage.pressListGroupsButton();
        Assert.assertTrue(listGroupsPage.getCurrentURL("https://dev.webpixels.io/library/components/list-groups"));
        Assert.assertTrue(listGroupsPage.isListGroupsPopulated());
        Assert.assertTrue(listGroupsPage.isListGroupsHeartsFunctional());


    }
}
