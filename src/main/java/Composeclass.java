import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;

public class Composeclass extends Baseclass
{
    @FindBy(xpath="//div[@class='T-I T-I-KE L3']") private WebElement ClkOnCompose;
    @FindBy(xpath="//textarea[@name='to']") private WebElement To;
    @FindBy(xpath="//input[@name='subjectbox']") private WebElement Subject;
    @FindBy(xpath="//div[@aria-label='Message Body']") private WebElement MailBody;
    @FindBy(xpath="//tbody/tr/td[5]//div[@class='J-J5-Ji J-JN-M-I-JG']") private WebElement ThreeDot;
    @FindBy(xpath="(//div[@class='J-N-Jz'])[9]") private WebElement label;
    @FindBy(xpath="//div[@title='Social']") private WebElement SocialLabel;
    @FindBy(xpath="//div[@aria-label='Send ‪(Ctrl-Enter)‬']") private WebElement Send;
    @FindBy(xpath="//div[@aria-label='Social']") private WebElement social;
    @FindBy(xpath="(//td[@class='apU xY'])[3]") private WebElement Starred;
    @FindBy(xpath="(//span[@name='me'])[2]") private WebElement OpenTheEmail;


    Composeclass(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }

    public void ComposePage() throws InterruptedException, IOException {
        ClkOnCompose.click();
        To.sendKeys(Utilityclass.getTD(0,0));
        Subject.sendKeys(Utilityclass.getTD(0,2));
        MailBody.sendKeys(Utilityclass.getTD(0,3));
        ThreeDot.click();
        Thread.sleep(3000);
        label.click();
        Thread.sleep(5000);
        SocialLabel.click();
        Send.click();
        Thread.sleep(5000);
        driver.navigate().refresh();
        Thread.sleep(4000);
        social.click();
        Thread.sleep(10000);
        Starred.click();
        Thread.sleep(6000);
        OpenTheEmail.click();
    }



}
