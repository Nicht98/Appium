package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class AccessInitializationPage extends Page {
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    private MobileElement accept_btn;

    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_message")
    private MobileElement permission_txt;

    @AndroidFindBy(id = "com.kikuu:id/btn_sign_up")
    private MobileElement btn_register;

    @AndroidFindBy(id = "com.kikuu:id/btn_sign_in")
    private MobileElement btn_Login;

    @AndroidFindBy(id = "com.kikuu:id/join_kikuu_img")
    private MobileElement first_logos;


    public void accept_permission(){
        click(accept_btn);
    }

    public void goToRegisterMenu(){
        click(btn_register);
    }

    public void goToLogin(){
        click(btn_Login);
    }

    public boolean IsLogoDisplayed(){
        loadingWaitUntil(ExpectedConditions.visibilityOfAllElements(first_logos));
        return first_logos.isDisplayed();
    }

    public boolean permission_message(){
        loadingWaitUntil(ExpectedConditions.visibilityOfAllElements(permission_txt));
        return permission_txt.isDisplayed();
    }

}
