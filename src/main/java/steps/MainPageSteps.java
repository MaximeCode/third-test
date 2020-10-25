package steps;

import io.qameta.allure.Step;
import pages.MainPage;

public class MainPageSteps {

    MainPage mainPage = new MainPage();

    @Step("Нажимаем на кнопку \"Меню\".")
    public void clickMenu() {
        mainPage.clickMenu();
    }

    @Step("Выбираем пункт меню \"{0}\".")
    public void selectSubMenu(String item) {
        mainPage.selectSubMenu(item);
    }
}
