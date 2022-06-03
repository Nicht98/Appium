package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class RegisterPage extends Page {
    @AndroidFindBy(id = "com.kikuu:id/completed_txt")
    MobileElement registerText;

    @AndroidFindBy(id = "com.kikuu:id/skip_txt")
    MobileElement skip_btn;

    @AndroidFindBy(id = "com.kikuu:id/confirm_btn")
    MobileElement confirmation_btn;

    @AndroidFindBy (id ="com.android.packageinstaller:id/permission_message")
    MobileElement per_txt;

    @AndroidFindBy (id ="com.android.packageinstaller:id/permission_allow_button")
    MobileElement perm_btn;

    public boolean registerSuccess(){
        return registerText.isDisplayed();
    }

    public boolean allow_location(){
        return per_txt.isDisplayed();
    }

    public void permissionBtn(){
        click(perm_btn);
    }

    public void skip(){
        click(skip_btn);
    }

    public void confirm_Registration(){
        click(confirmation_btn);
    }




}


