package teste;

import common.pages.base.BaseTest;
import common.pages.mediaGroups.MediaGroups;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaGroupsTest extends BaseTest {
    @Test(description = "MediaGroups Test")
    public void mediaGroupsTest() {
        MediaGroups mediaGroups = new MediaGroups();
        mediaGroups.pressLibraryOption();
        mediaGroups.dropDownLibraryOption("Components");
        mediaGroups.pressMediaButton();
        Assert.assertTrue(mediaGroups.getCurrentURL("https://dev.webpixels.io/library/components/media"));
        Assert.assertTrue(mediaGroups.isMediaGroupsPagePopulatedWithWidgets());
        Assert.assertTrue(mediaGroups.isMediaGroupsHeartsFunctional());

    }


}
