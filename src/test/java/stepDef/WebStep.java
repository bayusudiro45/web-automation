package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.WebPage;

public class WebStep {
    WebPage webPage;

    public WebStep() {
        this.webPage = new WebPage();
    }

    @Given("user go to login page")
    public void userGoToLoginPage() {
        webPage.goToLoginPage();
    }

    @And("user input username {string}")
    public void userInputUsername(String username) {
        webPage.inputUsername(username);
    }

    @And("user input pwd {string}")
    public void userInputPwd(String pwd) {
        webPage.inputPwd(pwd);
    }

    @And("user click button login")
    public void userClickButtonLogin() {
        webPage.clickBtnLogin();
    }

    @Then("validation users can show side nav {string}")
    public void validationUsersCanShowSideNav(String navmenu) {
        webPage.assert_show_sidebar(navmenu);
    }

    @And("user search sidenav {string}")
    public void userSearchSidenav(String navmenu) {
        webPage.inputSideNav(navmenu);
    }

    @Then("validation input invalid {string}")
    public void validationInputInvalid(String navmenus) {
        webPage.verifyErrMsg(navmenus);
    }
}
