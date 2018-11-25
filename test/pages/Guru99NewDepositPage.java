/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 *
 * @author fsebas
 */
public class Guru99NewDepositPage {

    //Driver de pantalla
    WebDriver driver;

    //Elementos necesarios para crear el nuevo Deposite
    By OpenDeposite = By.partialLinkText("Deposit");

    By OpenContinue = By.partialLinkText("Continue");

    By NumAccount = By.name("accountno");

    By AmountMoney = By.name("ammount");

    By Description = By.name("desc");

    By SaveDeposite = By.name("AccSubmit");

//Constructor de pantalla
    public Guru99NewDepositPage(WebDriver driver) {

        this.driver = driver;

    }

    //metodo que redirige a la creacion del Deposit
    public void clickOpenDeposite() {

        driver.findElement(OpenDeposite).click();

    }

    //metodo que completa el campo Numero de cuenta del Deposit
    public void SetNumberAccount(String strNumCuenta) {
        driver.findElement(NumAccount).sendKeys(strNumCuenta);
    }

    //metodo que completa el campo amount del Deposit
    public void SetAmountMoney(String strCantDinero) {
        driver.findElement(AmountMoney).sendKeys(strCantDinero);
    }

    //metodo que completa el campo descripcion de cuenta del Deposit
    public void SetDescription(String strDescripcion) {
        driver.findElement(Description).sendKeys(strDescripcion);
    }

    //metodo que da click al terminar el deposito y crealo con este click
    public void clickSaveDeposite() throws InterruptedException {

        driver.findElement(SaveDeposite).click();

    }

    public void MakeDeposittoToGuru99(String strNumCuenta, String strCantDinero, String strDescripcion) throws InterruptedException {

        this.clickOpenDeposite();

        this.SetNumberAccount(strNumCuenta);

        this.SetAmountMoney(strCantDinero);

        this.SetDescription(strDescripcion);

        this.clickSaveDeposite();

    }
}
