package com.gmail.autotest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * Created by anton on 26-Aug-17.
 */
public class AuthorizationPage {
    private static WebDriver driver;


    public AuthorizationPage (WebDriver driver)
    {
        this.driver = driver;
    }
    public static void setUserName(String username){

        driver.findElement(By.xpath("//input[@name='j_username']")).sendKeys(username);
    }
    public static void setPassword(String password){
        driver.findElement(By.xpath("//input[@name='j_password']")).sendKeys(password);
    }
    public static void clickLoginbutton(){
        driver.findElement(By.xpath("//span[@class='ui-button-but']")).click();

    }

    public void loginToMainPage(String login, String password){
        setUserName(login);
        setPassword(password);
        clickLoginbutton();
    }
    public String getTitle(){
        return driver.getTitle();
    }
}
