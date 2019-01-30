package qa.framework.objects;

import org.openqa.selenium.WebDriver;

public class ObjectBase {
    protected WebDriver driver = null;

    public ObjectBase(WebDriver driver) {
        this.driver = driver;
    }
}
