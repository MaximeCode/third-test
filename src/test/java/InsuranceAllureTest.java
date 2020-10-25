import io.qameta.allure.Step;
import org.junit.Test;
import pages.DMSPage;
import pages.MainPage;
import pages.SendAppPage;

public class InsuranceAllureTest extends BaseTest {

    @Test
    public void testInsurance() {
        step1();
        step2();
        step3();
    }

    @Step("Шаг 1")
    public void step1() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickMenu();
        mainPage.selectSubMenu("ДМС");
    }

    @Step("Шаг 2")
    public void step2() {
        DMSPage dmsPage = new DMSPage(driver);
        dmsPage.clickSendButton();
    }

    @Step("Шаг 3")
    public void step3() {
        SendAppPage sendAppPage = new SendAppPage(driver);
        sendAppPage.checkTitle("Заявка на добровольное медицинское страхование");
        sendAppPage.fillLastName("Иванов");
        sendAppPage.fillFirstName("Иван");
        sendAppPage.fillMiddleName("Иванович");
        sendAppPage.selectRegion("Москва");
        sendAppPage.fillEmail("ivanov.ru");
        sendAppPage.fillComment("autotest");
        sendAppPage.clickConsentCheckbox();
        sendAppPage.clickSendButton();
        sendAppPage.checkEmailWarning("Введите адрес электронной почты");
        sendAppPage.checkLastName("Иванов");
        sendAppPage.checkFirstName("Иван");
        sendAppPage.checkMiddleName("Иванович");
    }
}
