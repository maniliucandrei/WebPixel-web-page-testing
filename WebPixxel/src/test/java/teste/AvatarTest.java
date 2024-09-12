package teste;

import common.pages.alerts.Alerts;
import common.pages.avatar.AvatarPage;
import common.pages.base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AvatarTest extends BasePage {

    @Test(description = "AvatarTest")
    public void avatarTest(){
        AvatarPage avatarPage = new AvatarPage();
        avatarPage.pressLibraryOption();
        avatarPage.chooseLibraryOption("Components");
        avatarPage.chooseComponentsOption("Avatar");
        Assert.assertTrue(avatarPage.getCurrentURL("https://dev.webpixels.io/library/components/avatar"));
        Assert.assertTrue(avatarPage.isAvatarPagePopulatetedWithWidgets());
        Assert.assertTrue(avatarPage.isListOfHartsfromAvatarFunctional());
        Assert.assertTrue(avatarPage.isListOfNumberOfHeartEqualWithListOfHeart());
    }
}
