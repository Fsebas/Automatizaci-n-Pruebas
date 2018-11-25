package test;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Guru99HomePage;
import pages.Guru99Login;
import pages.Guru99NewCustomerPage;

public class Test99GuruLogin {

    static WebDriver driver;

    Guru99Login objLogin;

    Guru99HomePage objHomePage;
    
    Guru99NewCustomerPage objCustomer;

    @BeforeClass
    public static void setUpClass() {
        System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Before
    public void setUp() {
        driver.get("http://demo.guru99.com/V4/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void Test_Login() {

        
        objLogin = new Guru99Login(driver);

        
        String loginPageTitle = objLogin.getLoginTitle();

        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

       
        objLogin.loginToGuru99("mgr123", "mgr!23");

        
        objHomePage = new Guru99HomePage(driver);

        
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
       

    }

//    @Test
//    public void Test_Deposit() {
//         //Create Login Page object
//        objLogin = new Guru99Login(driver);
//
//        //Verify login page title
//        String loginPageTitle = objLogin.getLoginTitle();
//
//        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
//
//        //login to application
//        objLogin.loginToGuru99("mgr123", "mgr!23");
//
//        // go the next page
//        objHomePage = new Guru99HomePage(driver);
//
//        //Verify home page
//        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
//        
//        objCustomer = new Guru99NewCustomerPage(driver);
//        
//        
//    }
}
