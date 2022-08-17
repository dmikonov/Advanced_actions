package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DraggableBasicScreen extends BaseScreen {
    public DraggableBasicScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@[resource-id='com.h6ah4i.android.example.advrecyclerview:id/drag_handle']")
    List<MobileElement> list;

    public DraggableBasicScreen dragDown(int index) {
        MobileElement element = list.get(index);
        Rectangle rect = element.getRect();
        int xFrom = rect.getX() + rect.getWidth() / 2;
        int yFrom = rect.getY() + rect.getHeight() / 2;
        int xTo = xFrom;
        int yTo = yFrom + rect.getHeight();
        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom, yFrom))
                .moveTo(PointOption.point(xTo, yTo))
                .release().perform();
        return this;
    }

    public DraggableBasicScreen dragDown1(int index, int count) {
        MobileElement element = list.get(index);
        Rectangle rect = element.getRect();
        int xFrom = rect.getX() + rect.getWidth() / 2;
        int yFrom = rect.getY() + rect.getHeight() / 2;
        int xTo = xFrom;
        int yTo = yFrom + rect.getHeight() + count;
        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom, yFrom))
                .moveTo(PointOption.point(xTo, yTo))
                .release().perform();
        return this;
    }
    public DraggableBasicScreen dragDownWindow(int index) {
        MobileElement element = list.get(index);
        Rectangle rect = element.getRect();
        int xFrom = rect.getX() + rect.getWidth() / 2;
        int yFrom = rect.getY() + rect.getHeight() / 2;
        int xTo = xFrom;
        int yTo = driver.manage().window().getSize().getHeight()-rect.getHeight()/2;
        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom, yFrom))
                .moveTo(PointOption.point(xTo, yTo))
                .release().perform();
        return this;
    }
    public DraggableBasicScreen dragUp(int index, int count) {
        MobileElement element = list.get(index);
        Rectangle rect = element.getRect();
        int yFrom = rect.getY() + rect.getWidth() / 2;
        int x = rect.getX() + rect.getWidth() / 2;
        int yTo = yFrom - rect.getWidth() + count;
        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(x, yFrom))
                .moveTo(PointOption.point(x, yTo))
                .release().perform();
        return this;
    }
}
