package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DraggableLayoutBasicScreen extends BaseScreen{
    public DraggableLayoutBasicScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }
    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/container']")
    List<MobileElement> list;

    public DraggableLayoutBasicScreen dragFromLeftToRight(int index){
        MobileElement element = list.get(index);
        Rectangle rect = element.getRect();
        TouchAction<?> touchAction = new TouchAction(driver);
        int xFrom = rect.getX() + rect.getWidth()/2; ;
        int y = rect.getY()+ rect.getHeight()/2;
        int xTo = xFrom + rect.getWidth();
        touchAction.longPress(PointOption.point(xFrom, y))
                .moveTo(PointOption.point(xTo,y))
                .release().perform();
        return this;
    }
}
