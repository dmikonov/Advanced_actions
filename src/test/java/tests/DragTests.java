package tests;

import config.AppiumConfiguration;
import org.testng.annotations.Test;
import screens.DragScreen;

public class DragTests extends AppiumConfiguration {

    @Test
    public void dragDown() {
        new DragScreen(driver)
                .selectDraggableBasic()
                //.dragDown(2);
                .dragDown1(1,3)
                .dragDownWindow(1);
    }

    @Test
    public void dragUp() {
        new DragScreen(driver)
                .selectDraggableBasic()
                .dragUp(5,3);
    }
}