package pageObjects;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;
import java.util.stream.Collectors;

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

    @AndroidFindBy(id = "com.kikuu:id/select_country_layout")
    MobileElement country_select_btn;

    @AndroidFindBy(id = "com.kikuu:id/reg_submit_btn")
    MobileElement register_btn;

    @AndroidFindBy(id = "com.kikuu:id/search_country_et")
    MobileElement country_search;

    @AndroidFindBy(id = "com.kikuu:id/country_list")
    List<MobileElement> country_list;

    @AndroidFindBy(id = "com.kikuu:id/country_txt")
    MobileElement country_txt;

    @AndroidFindBy(id = "com.kikuu:id/reg_confirm_password_et")
    MobileElement password_field;

    @AndroidFindBy(id = "com.kikuu:id/reg_username_et")
    MobileElement userName_field;

    @AndroidFindBy(accessibility = "Register")
    MobileElement registerLogos;


    public boolean isReLogosDisplayed(){
        return registerLogos.isDisplayed();
    }

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


    public boolean iScountryExist(String country){
        return country_list.stream()
                .filter(el -> el.getText().contains(country))
                .count() >= 1;
    }

    public void selectCountry(String country) {
        search_country(country);
        click(country_list.stream()
                .filter(countryElement -> country.contains(country_txt.getText()))
                .collect(Collectors.toList())
                .get(0));
        }

    public void search_country(String country){
        country_search.sendKeys(country);
    }

    public void fillRegistration (String name, String pass){
        set(userName_field,name);
        set(password_field,pass);
    }

    public void registerSubmit(){
        click(register_btn);
    }

    public void confirm_Registration(){
        click(confirmation_btn);
    }

}


