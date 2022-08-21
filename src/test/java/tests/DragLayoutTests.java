package tests;

import config.AppiumConfiguration;
import org.testng.annotations.Test;
import screens.DragScreen;

public class DragLayoutTests extends AppiumConfiguration {
    @Test
    public void dragLayoutTest(){
        new DragScreen(driver)
                .selectDragLayout()
                .dragFromLeftToRight(1);
    }
}
