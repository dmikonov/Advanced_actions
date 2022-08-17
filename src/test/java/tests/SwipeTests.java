package tests;

import config.AppiumConfiguration;
import org.testng.annotations.Test;
import screens.DragScreen;

public class SwipeTests extends AppiumConfiguration {
    @Test
    public void swipeTest() {
        new DragScreen(driver)
                .selectSwipe()
                .selectSwipeBasic()
                .swipeFromLeftToRight(2)
                .swipeFromRightToLeft(4);
    }
}
