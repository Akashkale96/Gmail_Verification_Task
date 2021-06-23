import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Verificationclass extends Baseclass
{
    @FindBy(xpath="//h2[@class='hP']") private WebElement Subject;
    @FindBy(xpath ="(//div[@dir='ltr'])[3]") private WebElement MsgBody;


    Verificationclass(WebDriver driver)
    {
        PageFactory.initElements(driver,this);

    }

    public void VerifySubject()
    {
        String ActualSubject= Subject.getText();
        String ExpectedSubject= "Test Mail";

        if(ExpectedSubject.equals(ActualSubject))
        {
            System.out.println("Subject Verification Pass");
        }
        else
        {
            System.out.println("Subject Verification Fail");
        }

    }


    public void VerifyReceivedEmail()
    {
        String ActualEmail= MsgBody.getText();
        String ExpectedEmail = "Test Email Body";

        if(ExpectedEmail.equals(ActualEmail))
        {
            System.out.println("Received Email Verification Pass");
        }
        else
        {
            System.out.println("Received Email Verification Fail");
        }

    }


}
