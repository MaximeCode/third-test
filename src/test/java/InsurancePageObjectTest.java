import io.qameta.allure.Step;
import org.junit.Ignore;
import org.junit.Test;
import pages.DMSPage;
import pages.MainPage;
import pages.SendAppPage;

public class InsurancePageObjectTest extends BaseTest {

    @Test
    @Ignore
    public void testInsurance() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickMenu();
        mainPage.selectSubMenu("ДМС");
        DMSPage dmsPage = new DMSPage(driver);
        dmsPage.clickSendButton();
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
