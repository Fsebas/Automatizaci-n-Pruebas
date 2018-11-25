/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Guru99HomePage;
import pages.Guru99Login;
import pages.Guru99NewAccountPage;

/**
 *
 * @author fsebas
 */
public class Test99GuruAccount {
       static WebDriver driver;

    Guru99Login objLogin;

    Guru99HomePage objHomePage;

    Guru99NewAccountPage objAccount;

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
    public void Test_Account() {
        
        objLogin = new Guru99Login(driver);

        
        String loginPageTitle = objLogin.getLoginTitle();

        Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));

       
        objLogin.loginToGuru99("mgr123", "mgr!23");

        
        objHomePage = new Guru99HomePage(driver);

        
        Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
        
        objAccount = new Guru99NewAccountPage(driver);
        objAccount.SubmitNewAccount("67881", "60000");
    }
}
