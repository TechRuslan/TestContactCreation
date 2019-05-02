package com.example.fw;

import com.example.tests.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase{

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void createContact() {
        driver.findElement(By.linkText("add new")).click();
    }

    public void populateContactFields() {
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

    public void emptyContactFields(ContactData contactData) {
        driver.findElement(By.name("firstname")).clear();
        driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        driver.findElement(By.name("lastname")).clear();
        driver.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        driver.findElement(By.name("address")).clear();
        driver.findElement(By.name("address")).sendKeys(contactData.getAddress());
        driver.findElement(By.name("home")).clear();
        driver.findElement(By.name("home")).sendKeys(contactData.getHome());
        driver.findElement(By.name("mobile")).clear();
        driver.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
        driver.findElement(By.name("work")).clear();
        driver.findElement(By.name("work")).sendKeys(contactData.getWork());
        driver.findElement(By.name("email")).clear();
        driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
        new Select(driver.findElement(By.name("bday"))).selectByVisibleText(contactData.getBirthday());
        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getBirthmonth());
        driver.findElement(By.name("byear")).clear();
        driver.findElement(By.name("byear")).sendKeys(contactData.getBirthyear());
        driver.findElement(By.name("address2")).clear();
        driver.findElement(By.name("address2")).sendKeys(contactData.getAddress2());
        driver.findElement(By.name("phone2")).clear();
        driver.findElement(By.name("phone2")).sendKeys(contactData.getPhone());
    }

    public void saveContact() {
        driver.findElement(By.name("submit")).click();
    }

    public void addContactToGroup(NavigationHelper navigationHelper) {
        driver.findElement(By.name("add")).click();
    }
}
