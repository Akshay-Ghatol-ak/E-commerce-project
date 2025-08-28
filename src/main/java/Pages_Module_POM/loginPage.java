package Pages_Module_POM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class loginPage {
    WebDriver driver;

public loginPage(WebDriver driver){
    this.driver=driver;
    PageFactory.initElements(driver,this);

}

    @FindBy(xpath="//*[@id='authUser']")
    private WebElement UserName;
    public void EnterUserName(String username) {
        UserName.sendKeys(username);
    }


    @FindBy(xpath="//*[@id='clearPass']")
    private WebElement Password;
    public void EnterPassword(String password) {
        Password.sendKeys(password);
    }

@FindBy(xpath = "//*[@id='login-button']")
    private WebElement LoginButton;
    public void ClickOnLoginButton(){
        LoginButton.click();
    }


}
