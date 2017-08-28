package com.gmail.autotest;


import org.openqa.selenium.WebDriver;

/**
 * Created by anton on 26-Aug-17.
 */
public class MainPage{
    private static WebDriver driver;

    public MainPage (WebDriver driver)
    {
        this.driver = driver;
    }
    public String getTitle(){
        return driver.getTitle();
    }

}
