/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author fsebas
 */
public class Guru99NewAccountPage {

    //Driver de pantalla
    WebDriver driver;

    //Elementos necesarios para crear el nuevo Account
    By NewOpenAccount = By.partialLinkText("New Account");

    By NewCustomerId = By.name("cusid");

    By NewAccountType = By.name("selaccount");

    By NewAccountInitialDeposit = By.name("inideposit");

    By NewSubmitNewAccount = By.name("button2");

    //Constructor de pantalla
    public Guru99NewAccountPage(WebDriver driver) {

        this.driver = driver;

    }
    
    //metodo Redirecciona la pantalla princial hacia la creacion del account
    public void clickNewAccount() {

        driver.findElement(NewSubmitNewAccount).click();

    }

    //metodo que redirige a la creacion del Account
    public void clickOpenNewAccount() {

        driver.findElement(NewOpenAccount).click();
    }
//metodo que completa el campo Id del Account

    public void setNewCustomerId(String strCustomerId) {

        driver.findElement(NewCustomerId).sendKeys(strCustomerId);
    }

    //metodo que completa el campo Type del Account, a partir de un valor quemado siendo "Savings", este se puede
    //cambiar con la variable type
    public void setNewAccountType(String strAccountType) {

        Select AccountType = new Select(driver.findElement(By.name(strAccountType)));

        String type = "Savings";
        AccountType.selectByVisibleText(type);

    }
//metodo que completa el campo del deposito inicial del Account

    public void setNewAccountInitialDeposit(String strAccountInitialDeposit) {

        driver.findElement(NewAccountType).sendKeys(strAccountInitialDeposit);

    }

//Metodo principal del Account
    public void SubmitNewAccount(String strCustomerId, String strAccountInitialDeposit) {

        this.clickOpenNewAccount();
        this.setNewCustomerId(strCustomerId);

        this.setNewAccountInitialDeposit(strAccountInitialDeposit);

        this.clickNewAccount();
    }

}
