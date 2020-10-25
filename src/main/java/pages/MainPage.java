package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static steps.BaseSteps.getDriver;

public class MainPage {
    @FindBy(xpath = "//a[contains(text(), 'Меню') and contains(@class, 'hidden-xs')]")
    private WebElement menu;

    @FindBy(xpath = "//div[@class='grid rgs-main-menu-links']")
    private WebElement subMenu;

    public MainPage() {
        PageFactory.initElements(getDriver(), this);
    }

    public void clickMenu() {
        menu.click();
    }

    public void selectSubMenu(String item) {
        subMenu.findElement(By.partialLinkText(item)).click();
    }
}
