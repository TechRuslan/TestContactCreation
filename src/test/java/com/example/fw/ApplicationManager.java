package com.example.fw;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

    public class ApplicationManager {

    public WebDriver driver;
    public String baseUrl;

    public NavigationHelper navigationHelper;
    public GroupHelper groupHelper;
    public ContactHelper contactHelper;

    public ApplicationManager() {
        System.setProperty("webdriver.gecko.driver", "D:\\Users\\rzaporozhenko\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://localhost/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        navigationHelper = new NavigationHelper(this);
        groupHelper = new GroupHelper(this);
        contactHelper = new ContactHelper(this);
    }

    public void stop() {
        driver.quit();
    }

}