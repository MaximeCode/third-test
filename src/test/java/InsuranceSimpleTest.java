//import org.junit.Assert;
//import org.junit.Ignore;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Wait;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class InsuranceSimpleTest extends BaseTest {
//
//    @Test
//    @Ignore
//    public void testInsurance() {
//        driver.findElement(By.xpath("//a[contains(text(), 'Меню') and contains(@class, 'hidden-xs')]")).click();
//        driver.findElement(By.xpath("//form//a[contains(text(), 'ДМС')]")).click();
//        WebElement element = driver.findElement(By.xpath("//a[contains(text(), 'Отправить заявку')]"));
//        Wait<WebDriver> wait = new WebDriverWait(driver, 3);
//        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
//        element = driver.findElement(By.tagName("b"));
//        wait.until(ExpectedConditions.visibilityOf(element));
//        Assert.assertEquals("Заявка на добровольное медицинское страхование", element.getText());
//        fillField(By.name("LastName"), "Иванов");
//        fillField(By.name("FirstName"), "Иван");
//        fillField(By.name("MiddleName"), "Иванович");
//        new Select(driver.findElement(By.tagName("select"))).selectByVisibleText("Москва");
//        fillField(By.name("Email"), "ivanov.ru");
//        fillField(By.name("Comment"), "autotest");
//        driver.findElement(By.className("checkbox")).click();
//        driver.findElement(By.id("button-m")).click();
//        element = driver.findElement(By.xpath("//label[text()='Эл. почта']/..//span"));
//        wait.until(ExpectedConditions.visibilityOf(element));
//        Assert.assertEquals("Введите адрес электронной почты", element.getText());
//        Assert.assertEquals("Иванов", driver.findElement(By.name("LastName")).getAttribute("value"));
//        Assert.assertEquals("Иван", driver.findElement(By.name("FirstName")).getAttribute("value"));
//        Assert.assertEquals("Иванович", driver.findElement(By.name("MiddleName")).getAttribute("value"));
//    }
//
//    public void fillField(By locator, String value) {
//        WebElement element = driver.findElement(locator);
//        element.clear();
//        element.sendKeys(value);
//    }
//}
