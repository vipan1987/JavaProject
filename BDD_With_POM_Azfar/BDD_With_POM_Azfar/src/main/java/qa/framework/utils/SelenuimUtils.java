package qa.framework.utils;

import org.openqa.selenium.WebDriver;
import qa.framework.objects.ObjectBase;

import java.util.Iterator;
import java.util.Set;

public class SelenuimUtils extends ObjectBase {
    public SelenuimUtils(WebDriver driver) {
        super(driver);
    }
    public void delayFor(int timeInMili) {
        try {
            Thread.sleep(timeInMili);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getLastWIndowHandle() {
        Set<String> winHdls = driver.getWindowHandles();
        return winHdls.toArray()[winHdls.size() - 1].toString();
    }

    public void switchToLastWindow() {
        String win = getLastWIndowHandle();
        driver.switchTo().window(win);
    }

    public void closeLastWindow() {
        switchToLastWindow();
        driver.close();
    }

    public void switchToWindow(String winTitle) {
        Set<String> winHdls = driver.getWindowHandles();
        Iterator<String> iterator = winHdls.iterator();
        while (iterator.hasNext()) {
            String win = iterator.next();
            driver.switchTo().window(win);
            String currentTitle = driver.getTitle();
            if (currentTitle.contains(winTitle)) {
                return;
            }
        }
        throw new RuntimeException("Window with the title contain '" + winTitle + "' was not found.");
    }

    public void switchToWindowByURL(String url) {
        Set<String> winHdls = driver.getWindowHandles();
        Iterator<String> iterator = winHdls.iterator();
        while (iterator.hasNext()) {
            String win = iterator.next();
            driver.switchTo().window(win);
            String currentUrl = driver.getCurrentUrl();
            if (currentUrl.contains(url)) {
                return;
            }
        }
        throw new RuntimeException("Window with the URL contain '" + url + "' was not found.");
    }

    public void switchToWindow(int winIndex) {
        Set<String> winHdls = driver.getWindowHandles();

        if (winIndex < winHdls.size()) {
            String win = winHdls.toArray()[winIndex].toString();
            driver.switchTo().window(win);
        } else {
            throw new RuntimeException("Window with the index '" + winIndex + "' not found.");
        }
    }

    public void closeWindow(String title) {
        switchToWindow(title);
        driver.close();
        switchToLastWindow();
    }

    public void closeWindow(int winIndex) {
        switchToWindow(winIndex);
        driver.close();
        switchToLastWindow();
    }

    public void closeAllOpenWindowExceptCurrent() {
        String currentWindowHnd = driver.getWindowHandle();
        Set<String> windowList = driver.getWindowHandles();
        for (String window : windowList) {
            if (!currentWindowHnd.contentEquals(window)) {
                driver.switchTo().window(window);
                driver.close();
            }
        }
        driver.switchTo().window(currentWindowHnd);
    }

}
