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
public class Guru99NewCustomerPage {

    //Driver de pantalla
    WebDriver driver;

    //Elementos necesarios para crear el nuevo customer
    By OpenNewCustomer = By.partialLinkText("New Customer");

    By NewCustomerName = By.name("name");

    By NewCustomerGender = By.name("rad1");

    By NewCustomerBirth = By.id("dob");

    By NewCustomerAddress = By.name("addr");

    By NewCustomerCity = By.name("city");

    By NewCustomerState = By.name("state");

    By NewCustomerPin = By.name("pinno");

    By NewCustomerMobilNumber = By.name("telephoneno");

    By NewCustomerEmail = By.name("emailid");

    By NewCustomerPassword = By.name("password");

    By NewCustomerSubmit = By.name("sub");
    
    By CutomerStatus = By.id("customer");

    //Constructor de pantalla
    public Guru99NewCustomerPage(WebDriver driver) {

        this.driver = driver;

    }
    
    //metodo que redirige a la creacion del customer
    public void ClickOPenNewCustomer() {

        driver.findElement(OpenNewCustomer).click();

    }
    
    //metodo que completa el campo name del customer
    public void setNewCustomerName(String strCustomerName) {

        driver.findElement(NewCustomerName).sendKeys(strCustomerName);

    }

    //Metodo que selecciona el genero del customer
    public void selectNewCustomerGender() {

        driver.findElement(NewCustomerGender).click();
    }

    //Metodo que seleccion el cumpleaños del cliente, lo llena con formato :dia-mes-año, rspectivamente sin guion
    public void setNewCustomerBirth(String strCustomerBirth) {

        driver.findElement(NewCustomerBirth).sendKeys(strCustomerBirth);
    }

    //metodo que completa el campo Adress del customer
    public void setNewCustomerAddress(String strCustomerAddress) {

        driver.findElement(NewCustomerAddress).sendKeys(strCustomerAddress);

    }

    ////metodo que completa el City name del customer
    public void setNewCustomerCity(String strCustomerCity) {

        driver.findElement(NewCustomerCity).sendKeys(strCustomerCity);

    }

    //metodo que completa el campo State del customer
    public void setNewCustomerState(String strCustomerState) {

        driver.findElement(NewCustomerState).sendKeys(strCustomerState);

    }

    //metodo que completa el campo Pin del customer
    public void setNewCustomerPin(String strCustomerPin) {

        driver.findElement(NewCustomerPin).sendKeys(strCustomerPin);

    }

    //metodo que completa el campo Mobile Number del customer
    public void setNewCustomerMobilNumber(String strCustomerMobilNumber) {

        driver.findElement(NewCustomerMobilNumber).sendKeys(strCustomerMobilNumber);

    }

    //metodo que completa el campo Email del customer
    public void setNewCustomerEmail(String strCustomerEmail) {

        driver.findElement(NewCustomerEmail).sendKeys(strCustomerEmail);

    }

    //metodo que completa el campo password del customer
    public void setNewCustomerPassword(String strCustomerPassword) {

        driver.findElement(NewCustomerPassword).sendKeys(strCustomerPassword);

    }

    //metodo que da click al submit al terminar el proceso 
    public void clickNewCustomer() {

        driver.findElement(NewCustomerSubmit).click();

    }
    
    
    //Metodo principal
    public void NewCustomerToGuru99(String strCustomerName, String strCustomerBirth, String strCustomerAddress, String strCustomerCity, String strCustomerState, String strCustomerPin, String strCustomerMobilNumber, String strCustomerEmail, String strCustomerPassword) {

        this.ClickOPenNewCustomer();

        this.setNewCustomerName(strCustomerName);

        this.selectNewCustomerGender();

        this.setNewCustomerBirth(strCustomerBirth);

        this.setNewCustomerAddress(strCustomerAddress);

        this.setNewCustomerCity(strCustomerCity);

        this.setNewCustomerState(strCustomerState);

        this.setNewCustomerPin(strCustomerPin);

        this.setNewCustomerMobilNumber(strCustomerMobilNumber);

        this.setNewCustomerEmail(strCustomerEmail);

        this.setNewCustomerPassword(strCustomerPassword);

        this.clickNewCustomer();
    }

}


