package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogInPage extends BasePage {

    public LogInPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//input[@placeholder='Email']")
    WebElement setEmail;
    public void setEmail(String email) {
      setEmail.sendKeys(email);
    }

    @FindBy(xpath="//a[@class='loginBtn link']")
    WebElement Login;
    public void clickLogin() {
        Login.click();
    }
   
    @FindBy(xpath="//input[@placeholder='Parolă']")
    WebElement txtPassword;
    public void password(String pass) {
        txtPassword.sendKeys(pass);
    }
    @FindBy(xpath="//div[@class='right']//div//a[@class='link'][normalize-space()='Meniu']")
    WebElement menu;
    public void clickmenu() {
        menu.click();
    }

    @FindBy(xpath="(//p[contains(text(),'Gustări')])[1]")
    WebElement gustari;
    public void aleggustari() {
        gustari.click();
    }

    @FindBy(xpath="//span[normalize-space()='CARTOFI PRAJITI CLASICI - PORTIE MARE']")
    WebElement cartofiselect;
    public void cartofi() {
        cartofiselect.click();
    }
    @FindBy(xpath="//i[@class='vertical--align--middle icon material-icons']")
    WebElement cartofifavoriti;
    public void favcartofi() {
        cartofifavoriti.click();
    }

    @FindBy(xpath="//span[@class='dialog-button dialog-button-bold']")
    WebElement selectok;
    public void okselect() {
        selectok.click();
    }
}
