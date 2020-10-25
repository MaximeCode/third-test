package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
    @FindBy(xpath = "//a[contains(text(), 'Меню') and contains(@class, 'hidden-xs')]")
    private WebElement menu;

    @FindBy(xpath = "//div[@class='grid rgs-main-menu-links']")
    private WebElement subMenu;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickMenu() {
        menu.click();
    }

    public void selectSubMenu(String item) {
        subMenu.findElement(By.partialLinkText(item)).click();
    }
}
