package pages;

import org.openqa.selenium.By;
import static helper.Utility.driver;

public class WebPage {

    By input_username = By.name("username");
    By input_pwd = By.name("password");
    By btn_login = By.xpath("//button[@type = 'submit']");
    By input_serach_sidebar = By.xpath("//input[@placeholder = \"Search\"]");
    By setSideMenu(String navmenu){
        return By.xpath("//span[text()='"+navmenu+"']");
    }

    public void goToLoginPage() {
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    public void inputUsername(String username) {
        driver.findElement(input_username).sendKeys(username);
    }

    public void inputPwd(String pwd) {
        driver.findElement(input_pwd).sendKeys(pwd);
    }

    public void clickBtnLogin(){
        driver.findElement(btn_login).click();
    }

    public void assert_show_sidebar(String navmenu){
        driver.findElement(setSideMenu(navmenu)).isDisplayed();
    }

    public void inputSideNav(String navmenu){
        driver.findElement(input_serach_sidebar).sendKeys(navmenu);
    }
}

