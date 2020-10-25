package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendAppPage {

    private final Wait<WebDriver> WAIT;

    @FindBy(tagName = "b")
    private WebElement title;

    @FindBy(name = "LastName")
    private WebElement lastName;

    @FindBy(name = "FirstName")
    private WebElement firstName;

    @FindBy(name = "MiddleName")
    private WebElement middleName;

    @FindBy(tagName = "select")
    private WebElement regionSelect;

    @FindBy(name = "Email")
    private WebElement email;

    @FindBy(xpath = "//label[text()='Эл. почта']/..//span")
    private WebElement emailWarning;

    @FindBy(name = "Comment")
    private WebElement comment;

    @FindBy(className = "checkbox")
    private WebElement consentCheckbox;

    @FindBy(id = "button-m")
    private WebElement sendButton;


    public SendAppPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        WAIT = new WebDriverWait(driver, 5);
    }

    public void checkTitle(String title) {
        Assert.assertEquals("Текст заголовка не такой, как ожидался.",
                title, WAIT.until(ExpectedConditions.visibilityOf(this.title)).getText());
    }

    public void fillLastName(String value) {
        lastName.clear();
        lastName.sendKeys(value);
    }

    public void fillFirstName(String value) {
        firstName.clear();
        firstName.sendKeys(value);
    }

    public void fillMiddleName(String value) {
        middleName.clear();
        middleName.sendKeys(value);
    }

    public void fillEmail(String value) {
        email.clear();
        email.sendKeys(value);
    }

    public void fillComment(String value) {
        comment.clear();
        comment.sendKeys(value);
    }

    public void selectRegion(String value) {
        new Select(regionSelect).selectByVisibleText(value);
    }

    public void clickConsentCheckbox() {
        consentCheckbox.click();
    }

    public void clickSendButton() {
        sendButton.click();
    }

    public void checkEmailWarning(String value) {
        Assert.assertEquals("Текст предупреждения не такой, как ожидался.",
                value, WAIT.until(ExpectedConditions.visibilityOf(emailWarning)).getText());
    }

    public void checkLastName(String value) {
        Assert.assertEquals("Значение в поле \"Фамилия\", не такое, как ожидалось.",
                value, lastName.getAttribute("value"));
    }

    public void checkFirstName(String value) {
        Assert.assertEquals("Значение в поле \"Имя\", не такое, как ожидалось.",
                value, firstName.getAttribute("value"));
    }

    public void checkMiddleName(String value) {
        Assert.assertEquals("Значение в поле \"Отчество\", не такое, как ожидалось.",
                value, middleName.getAttribute("value"));
    }
}
