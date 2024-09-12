package teste;

import com.relevantcodes.extentreports.LogStatus;
import common.pages.accordion.AccordionPage;
import common.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AccordionTest extends BasePage {

    @Test(description = "Accordion Test")
    public void accordionTest()  {
        AccordionPage accordionPage = new AccordionPage();
        accordionPage.pressLibraryOption();
        accordionPage.chooseLibraryOption("Components");
        accordionPage.chooseComponentsOption("Accordion");
        Assert.assertTrue(accordionPage.getCurrentURL("https://dev.webpixels.io/library/components/accordion"));
        Assert.assertTrue(accordionPage.isAccordionPagePopulatedWithWidgets());
        Assert.assertTrue(accordionPage.isListOfHeartAccordionFunctional());
        Assert.assertTrue(accordionPage.isListOfNumberOfHeartEqualWithListOfHeart());
    }

}
