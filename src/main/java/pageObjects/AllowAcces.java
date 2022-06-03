package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class AllowAcces extends Page {
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private MobileElement accept_btn;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_message")
    private MobileElement permission_txt;


    public void accept_permission(){
        click(accept_btn);
    }

    public boolean permission_message(){
        return permission_txt.isDisplayed();
    }

}
