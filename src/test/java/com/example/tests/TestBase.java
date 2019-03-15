package com.example.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.fail;

public class TestBase {
    private static WebDriver driver;
    private static String baseUrl;
    private static boolean acceptNextAlert = true;
    private static StringBuffer verificationErrors = new StringBuffer();

    @BeforeTest
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "D:\\Users\\rzaporozhenko\\Downloads\\geckodriver-v0.17.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        baseUrl = "http://localhost/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

    protected void addContactToGroup() {
        driver.findElement(By.name("add")).click();
    }

    protected void openHomePage() {
        driver.findElement(By.linkText("home")).click();
    }

    protected void saveContact() {
        driver.findElement(By.name("submit")).click();
    }

    protected void populateContactFields() {
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys("James");
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys("Bond");
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys("Britain, London");
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys("123456789");
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys("987654321");
        driver.findElement(By.name("work")).clear();
        driver.findElement(By.name("work")).sendKeys("111111111");
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys("james@bond.com");
        new Select(driver.findElement(By.name("bday"))).selectByVisibleText("7");
        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText("July");
        driver.findElement(By.name("byear")).clear();
        driver.findElement(By.name("byear")).sendKeys("1907");
        driver.findElement(By.name("address2")).clear();
        driver.findElement(By.name("address2")).sendKeys("Italy, Padova");
        driver.findElement(By.name("phone2")).clear();
        driver.findElement(By.name("phone2")).sendKeys("Homeless");
    }

    protected void createContact() {
        driver.findElement(By.linkText("add new")).click();
    }

    protected void saveGroup() {
        driver.findElement(By.name("submit")).click();
    }

    protected void populateGroupFields(GroupData groupData)
    {
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getGroupname());
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getGroupheader());
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getGroupfooter());
    }

    protected void createGroup() {
        driver.findElement(By.name("new")).click();
    }

    protected void openGroupsPage() {
        driver.findElement(By.linkText("groups")).click();
    }

    protected void openMainPage() {
        driver.get(baseUrl + "/addressbookv4.1.4/");
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    private boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    private String closeAlertAndGetItsText() {
        try {
            Alert alert = driver.switchTo().alert();
            String alertText = alert.getText();
            if (acceptNextAlert) {
                alert.accept();
            } else {
                alert.dismiss();
            }
            return alertText;
        } finally {
            acceptNextAlert = true;
        }
    }
}
