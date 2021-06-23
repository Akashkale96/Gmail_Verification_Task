import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class Testclass extends Baseclass
{
    Loginclass login;
    Composeclass compose;
    Verificationclass verify;

    @BeforeClass
    public void InitialStage()
    {
        Baseclass.OpebTheBrowser();
    }

    @BeforeMethod
    public void SetUP()
    {
        login = new Loginclass(driver);
        compose = new Composeclass(driver);
        verify = new Verificationclass(driver);
    }

    @org.testng.annotations.Test()
    public void LoginToGmail() throws InterruptedException, IOException {
        login.LoginPage();
        System.out.println("Gmail Login Activity Sucessful");
    }

    @org.testng.annotations.Test(priority=1)
    public void ComposeAnEmail() throws InterruptedException, IOException {
        compose.ComposePage();
        System.out.println("Compose Email Activity Sucessful ");
    }

    @org.testng.annotations.Test(priority = 2)
    public void VerifySubjectAndEmailBody()
    {
        verify.VerifySubject();
        verify.VerifyReceivedEmail();
    }

}
