package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import java.util.List;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;
    private static Actions action;

   // WebDriver driver;

    static {
        WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //System.setProperty("webdriver.chrome.driver","resources/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public BasePage(WebDriver driver){
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public static void navigateTo(String url){
    driver.get(url);
    }
    public static void closeBrowser(){
        driver.quit();
    }
    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }
    public void clickElement(String locator){
    Find(locator).click();
    }

    public void write(String locator, String textWrite){
        Find(locator).clear();
        Find(locator).sendKeys(textWrite);
    }
    public void  selectFromDropdownByValue(String locator,String value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByValue(value);
    }
    public void  selectFromDropdownByIndex(String locator,int value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByIndex(value);
    }
    public void  selectFromDropdownByText(String locator,String value){
        Select dropdown = new Select(Find(locator));
        dropdown.selectByVisibleText(value);
    }
    public void hoverOverElement(String locator){
        action.moveToElement(Find(locator));
    }
    public void doubleClick(String locator){
        action.doubleClick(Find(locator));
    }
    public void rightClick(String locator){
        action.contextClick(Find(locator));
    }

    public void switchToIframe(int iFrameIndex){
        driver.switchTo().frame(iFrameIndex);
    }
    public void switchToParentFrame(){
        driver.switchTo().parentFrame();
    }
    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }
    public String textFromElement(String locator){
        return Find(locator).getText();
    }
    public boolean elementDisplayed(String locator){
        return Find(locator).isDisplayed();
    }
    public boolean elementIsSelected(String locator){
        return Find(locator).isSelected();
    }
    public List<WebElement> listElements(String locator){
        return driver.findElements(By.className(locator));
    }
}
