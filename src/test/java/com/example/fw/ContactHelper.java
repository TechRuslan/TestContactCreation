package com.example.fw;

import com.example.tests.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper {
    public void createContact() {

        ApplicationManager.driver.findElement(By.linkText("add new")).click();
    }

    public void populateContactFields() {
        ApplicationManager.driver.findElement(By.name("firstname")).clear();
        ApplicationManager.driver.findElement(By.name("firstname")).sendKeys("James");
        ApplicationManager.driver.findElement(By.name("lastname")).clear();
        ApplicationManager.driver.findElement(By.name("lastname")).sendKeys("Bond");
        ApplicationManager.driver.findElement(By.name("address")).clear();
        ApplicationManager.driver.findElement(By.name("address")).sendKeys("Britain, London");
        ApplicationManager.driver.findElement(By.name("home")).clear();
        ApplicationManager.driver.findElement(By.name("home")).sendKeys("123456789");
        ApplicationManager.driver.findElement(By.name("mobile")).clear();
        ApplicationManager.driver.findElement(By.name("mobile")).sendKeys("987654321");
        ApplicationManager.driver.findElement(By.name("work")).clear();
        ApplicationManager.driver.findElement(By.name("work")).sendKeys("111111111");
        ApplicationManager.driver.findElement(By.name("email")).clear();
        ApplicationManager.driver.findElement(By.name("email")).sendKeys("james@bond.com");
        new Select(ApplicationManager.driver.findElement(By.name("bday"))).selectByVisibleText("7");
        new Select(ApplicationManager.driver.findElement(By.name("bmonth"))).selectByVisibleText("July");
        ApplicationManager.driver.findElement(By.name("byear")).clear();
        ApplicationManager.driver.findElement(By.name("byear")).sendKeys("1907");
        ApplicationManager.driver.findElement(By.name("address2")).clear();
        ApplicationManager.driver.findElement(By.name("address2")).sendKeys("Italy, Padova");
        ApplicationManager.driver.findElement(By.name("phone2")).clear();
        ApplicationManager.driver.findElement(By.name("phone2")).sendKeys("Homeless");
    }

    public void emptyContactFields(ContactData contactData) {
        ApplicationManager.driver.findElement(By.name("firstname")).clear();
        ApplicationManager.driver.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        ApplicationManager.driver.findElement(By.name("lastname")).clear();
        ApplicationManager.driver.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        ApplicationManager.driver.findElement(By.name("address")).clear();
        ApplicationManager.driver.findElement(By.name("address")).sendKeys(contactData.getAddress());
        ApplicationManager.driver.findElement(By.name("home")).clear();
        ApplicationManager.driver.findElement(By.name("home")).sendKeys(contactData.getHome());
        ApplicationManager.driver.findElement(By.name("mobile")).clear();
        ApplicationManager.driver.findElement(By.name("mobile")).sendKeys(contactData.getMobile());
        ApplicationManager.driver.findElement(By.name("work")).clear();
        ApplicationManager.driver.findElement(By.name("work")).sendKeys(contactData.getWork());
        ApplicationManager.driver.findElement(By.name("email")).clear();
        ApplicationManager.driver.findElement(By.name("email")).sendKeys(contactData.getEmail());
        new Select(ApplicationManager.driver.findElement(By.name("bday"))).selectByVisibleText(contactData.getBirthday());
        new Select(ApplicationManager.driver.findElement(By.name("bmonth"))).selectByVisibleText(contactData.getBirthmonth());
        ApplicationManager.driver.findElement(By.name("byear")).clear();
        ApplicationManager.driver.findElement(By.name("byear")).sendKeys(contactData.getBirthyear());
        ApplicationManager.driver.findElement(By.name("address2")).clear();
        ApplicationManager.driver.findElement(By.name("address2")).sendKeys(contactData.getAddress2());
        ApplicationManager.driver.findElement(By.name("phone2")).clear();
        ApplicationManager.driver.findElement(By.name("phone2")).sendKeys(contactData.getPhone());
    }

    public void saveContact() {

        ApplicationManager.driver.findElement(By.name("submit")).click();
    }
}
