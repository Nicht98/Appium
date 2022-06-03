package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends Page{

    @AndroidFindBy(id = "com.kikuu:id/scrolling_background")
    private MobileElement backgroud_image;

    @AndroidFindBy(id = "com.kikuu:id/btn_sign_in")
    private MobileElement login_btn;

    @AndroidFindBy(id = "com.kikuu:id/tv_skip")
    private MobileElement skip_login_btn;

    @AndroidFindBy(id = "com.kikuu:id/textinput_placeholder")
    private MobileElement name_field;

    @AndroidFindBy(id = "com.kikuu:id/et_password")
    private MobileElement pass_field;

    @AndroidFindBy(id = "com.kikuu:id/login_submit_btn")
    private MobileElement loginBTN;

    @AndroidFindBy(id = "com.kikuu:id/navi_title_layout")
    private MobileElement nav_menu;


    public boolean Background_Image_Displayed(){
        return backgroud_image.isDisplayed();
    }

    public boolean isNav_MenuDisplaye(){
        return nav_menu.isDisplayed();
    }

    public void fillForm(String username, String pass){
        set(name_field,username);
        set(pass_field,pass);
    }

    public void loginUserBTN(){
        click(loginBTN);
    }

    public void goTologin(){
        click(login_btn);
    }
}
