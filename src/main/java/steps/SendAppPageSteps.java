package steps;

import io.qameta.allure.Step;
import pages.SendAppPage;

public class SendAppPageSteps {

    SendAppPage sendAppPage = new SendAppPage();

    @Step("Проверяем заголовок формы \"{0}\".")
    public void checkTitle(String title) {
        sendAppPage.checkTitle(title);
    }

    @Step("Заполняем поле \"Фамилия\" значением \"{0}\".")
    public void fillLastName(String lastName) {
        sendAppPage.fillLastName(lastName);
    }

    @Step("Заполняем поле \"Имя\" значением \"{0}\".")
    public void fillFirstName(String firstName) {
        sendAppPage.fillFirstName(firstName);
    }

    @Step("Заполняем поле \"Отчество\" значением \"{0}\".")
    public void fillMiddleName(String middleName) {
        sendAppPage.fillMiddleName(middleName);
    }

    @Step("Выбираем в списке \"Регион\" значением \"{0}\".")
    public void selectRegion(String region) {
        sendAppPage.selectRegion(region);
    }

    @Step("Заполняем поле \"Эл. почта\" значением \"{0}\".")
    public void fillEmail(String email) {
        sendAppPage.fillEmail(email);
    }

    @Step("Заполняем поле \"Комментарий\" значением \"{0}\".")
    public void fillComment(String comment) {
        sendAppPage.fillComment(comment);
    }

    @Step("Ставим галочку о согласии.")
    public void clickConsentCheckbox() {
        sendAppPage.clickConsentCheckbox();
    }

    @Step("Нажимаем на кнопку \"Отправить\".")
    public void clickSendButton() {
        sendAppPage.clickSendButton();
    }

    @Step("Проверяем, что над полем \"Эл. почта\" появилось сообщение \"{0}\".")
    public void checkEmailWarning(String text) {
        sendAppPage.checkEmailWarning(text);
    }

    @Step("Проверяем, что в поле \"Фамилия\" значение \"{0}\".")
    public void checkLastName(String lastName) {
        sendAppPage.checkLastName(lastName);
    }

    @Step("Проверяем, что в поле \"Имя\" значение \"{0}\".")
    public void checkFirstName(String firstName) {
        sendAppPage.checkFirstName(firstName);
    }

    @Step("Проверяем, что в поле \"Отчество\" значение \"{0}\".")
    public void checkMiddleName(String middleName) {
        sendAppPage.checkMiddleName(middleName);
    }
}
