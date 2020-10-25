import io.qameta.allure.Description;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.junit.Test;
import steps.BaseSteps;
import steps.DMSPageSteps;
import steps.MainPageSteps;
import steps.SendAppPageSteps;

@Feature("Страхование")
@Story("Заявка на ДМС")
public class InsuranceAllureTest extends BaseSteps {

    @Description("Проверка возможности неправильного заполнения формы заявки.")
    @Test
    public void testInsurance() {
        MainPageSteps mainPageSteps = new MainPageSteps();
        mainPageSteps.clickMenu();
        mainPageSteps.selectSubMenu("ДМС");
        DMSPageSteps dmsPageSteps = new DMSPageSteps();
        dmsPageSteps.clickSendButton();
        SendAppPageSteps sendAppPageSteps = new SendAppPageSteps();
        sendAppPageSteps.checkTitle("Заявка на добровольное медицинское страхование");
        sendAppPageSteps.fillLastName("Иванов");
        sendAppPageSteps.fillFirstName("Иван");
        sendAppPageSteps.fillMiddleName("Иванович");
        sendAppPageSteps.selectRegion("Москва");
        sendAppPageSteps.fillEmail("ivanov.ru");
        sendAppPageSteps.fillComment("autotest");
        sendAppPageSteps.clickConsentCheckbox();
        sendAppPageSteps.clickSendButton();
        sendAppPageSteps.checkEmailWarning("Введите адрес электронной почты");
        sendAppPageSteps.checkLastName("Иванов");
        sendAppPageSteps.checkFirstName("Иван");
        sendAppPageSteps.checkMiddleName("Иванович");
    }
}
