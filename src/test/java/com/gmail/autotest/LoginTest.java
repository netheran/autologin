package com.gmail.autotest;

/**
 * Created by anton on 26-Aug-17.
 */
import org.junit.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.util.concurrent.TimeUnit;
import java.lang.*;


public class LoginTest {

    private static WebDriver driver;

    private static String login;
    private static String password;



    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.gecko.driver", "C:\\Other\\FFdrv\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://lk.megafon.ru/");

    }

    @Test
    public void testLoginPage() {
        login = "9265970138";
        password = "123qwe";
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        authorizationPage.loginToMainPage(login, password);
        MainPage mainPage = new MainPage(driver);

        Assert.assertEquals("Главная — Личный кабинет МегаФон", mainPage.getTitle());

    }

    @AfterClass
    public static void tearDown(){
        driver.findElement(By.xpath("//div[@class='lk_user_top_info_drop']/h4")).click();
        driver.findElement(By.xpath("//ul[@class='lk_user_top_info_drop_menu_box']/descendant::a[@href='/logout']")).click();
        AuthorizationPage authorizationPage = new AuthorizationPage(driver);
        Assert.assertEquals("Вход — Личный кабинет МегаФон", authorizationPage.getTitle());
        driver.quit();
    }
}
