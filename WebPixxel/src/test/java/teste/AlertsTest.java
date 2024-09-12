package teste;

import common.pages.alerts.Alerts;
import common.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertsTest extends BasePage {

    @Test(description = "AlertsTest")
    public void alertsTest(){
        Alerts alerts = new Alerts();
        alerts.pressLibraryOption();
        alerts.chooseLibraryOption("Components");
        alerts.chooseComponentsOption("Alerts");
        Assert.assertTrue(alerts.getCurrentURL("https://dev.webpixels.io/library/components/alerts"));
        Assert.assertTrue(alerts.isAlertsPagePopulatetedWithWidgets());
        Assert.assertTrue(alerts.isListOfHartsfromAlertsFunctional());
        Assert.assertTrue(alerts.isListOfNumberOfHeartEqualWithListOfHeart());
    }
}
