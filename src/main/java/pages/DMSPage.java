package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import static steps.BaseSteps.getDriver;

public class DMSPage {

    private final Wait<WebDriver> WAIT;

    @FindBy(xpath = "//a[contains(text(), 'Отправить заявку')]")
    private WebElement sendButton;

    public DMSPage() {
        PageFactory.initElements(getDriver(), this);
        WAIT = new WebDriverWait(getDriver(), 5);
    }

    public void clickSendButton() {
        WAIT.until(ExpectedConditions.elementToBeClickable(sendButton)).click();
    }
}
