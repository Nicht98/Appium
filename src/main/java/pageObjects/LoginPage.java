package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginPage extends Page{

    @AndroidFindBy(id = "com.kikuu:id/textinput_placeholder")
    private MobileElement name_field;

    @AndroidFindBy(id = "com.kikuu:id/et_password")
    private MobileElement pass_field;

    @AndroidFindBy(id = "    com.kikuu:id/login_submit_btn")
    private MobileElement submit_btn;

    public void fillForm(String username, String pass){
        set(name_field,username);
        set(pass_field,pass);
    }

    public void login(){
        click(submit_btn);
    }



}
