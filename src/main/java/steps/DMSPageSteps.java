package steps;

import io.qameta.allure.Step;
import pages.DMSPage;

public class DMSPageSteps {

    DMSPage dmsPage = new DMSPage();

    @Step("Нажимаем на кнопку \"Отправить заявку\".")
    public void clickSendButton() {
        dmsPage.clickSendButton();
    }
}
