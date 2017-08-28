package com.gmail.autotest;

import org.openqa.selenium.WebDriver;

/**
 * Created by anton on 26-Aug-17.
 */
public class Page {
    protected static WebDriver driver;

    public Page(){};
    public Page (WebDriver driver)
    {
        this.driver = driver;
    }
    protected WebDriver getDriver(){
        return driver;
    }
}
