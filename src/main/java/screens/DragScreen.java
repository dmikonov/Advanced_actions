package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.FindBy;

public class DragScreen extends BaseScreen {
    public DragScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/button'][2]")
    MobileElement selectDraggableBasic;

    @FindBy (xpath = "//*[@content-desc='Swipe']")
    MobileElement selectSwipe;
    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/button'][6]")
    MobileElement selectDragLayout;
    public DraggableBasicScreen selectDraggableBasic() {
        selectDraggableBasic.click();
        return new DraggableBasicScreen(driver);
    }
    public SwipeScreen selectSwipe(){
        selectSwipe.click();
        return new SwipeScreen(driver);
    }

    public DraggableLayoutBasicScreen selectDragLayout(){
        selectDragLayout.click();
        return new DraggableLayoutBasicScreen(driver);
    }


}
