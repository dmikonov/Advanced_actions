package screens;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.FindBy;
import org.testng.xml.XmlTest;

import java.util.List;

public class SwipeableBasicScreen extends BaseScreen {
    private int y;
    private Rectangle rect;

    public SwipeableBasicScreen(AppiumDriver<MobileElement> driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@resource-id='com.h6ah4i.android.example.advrecyclerview:id/container']")
    List<MobileElement> list;

    public SwipeableBasicScreen swipeFromLeftToRight(int index) {
        MobileElement element = list.get(index);
        Rectangle rect = element.getRect();
        int xFrom = rect.getX() + rect.getWidth() / 8;
        int y = rect.getY() + rect.getHeight() / 2;
        int xTo = rect.getX() + (rect.getWidth() / 8) * 7;
        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom, y))
                .moveTo(PointOption.point(xTo, y))
                .release().perform();
        return this;
    }

    public SwipeableBasicScreen swipeFromRightToLeft(int index) {
        MobileElement element = list.get(index);
        Rectangle rect = element.getRect();
        int xFrom = rect.getX() + (rect.getWidth() / 8) * 7;
        int y = rect.getY() + rect.getHeight() / 2;
        int xTo = rect.getX() + rect.getWidth() / 8;
        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction.longPress(PointOption.point(xFrom, y))
                .moveTo(PointOption.point(xTo, y))
                .release().perform();
        return this;
    }
}