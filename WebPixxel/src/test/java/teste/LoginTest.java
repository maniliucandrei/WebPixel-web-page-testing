package teste;

import com.relevantcodes.extentreports.LogStatus;
import common.pages.accordion.AccordionPage;
import common.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class LoginTest extends BasePage{

    public AccordionPage accordionPage(){
        return new AccordionPage();
    }

    @Test(description = "Happy Test")
    @Parameters({"username", "password", "typeOfRunning"})
    public void verifyLogin(String username, String password, String typeOfRunning) {
        accordionPage().getPageTitle();
        Assert.assertTrue(accordionPage().getSourceHtml().contains("<html lang=\"en\" class=\"__variable_d09892 __variable_bdfce0\"><head><meta charset=\"utf-8\"><meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"><link rel=\"preload\" href=\"/_next/static/media/12084922609e6532-s.p.woff2\" as=\"font\" crossorigin=\"\" type=\"font/woff2\"><link rel=\"preload\" href=\"/_next/static/media/22539d17f3707926-s.p.woff2\" as=\"font\" crossorigin=\"\" type=\"font/woff2\"><link rel=\"preload\""));
        Assert.assertEquals(driver_local.getCurrentUrl(), "https://dev.webpixels.io/");
        logger.log(LogStatus.PASS, "HomePage is displayed");
    }
}
