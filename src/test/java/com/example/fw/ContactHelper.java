package com.example.fw;

import com.example.tests.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class ContactHelper extends HelperBase{

    public ContactHelper(ApplicationManager manager) {
        super(manager);
    }

    public void createContact() {
        click(By.linkText("add new"));
    }

    public void populateContactFields(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstname());
        type(By.name("lastname"), contactData.getLastname());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getHome());
        type(By.name("mobile"), contactData.getMobile());
        type(By.name("work"), contactData.getWork());
        type(By.name("email"), contactData.getEmail());
        selectByText(By.name("bday"), contactData.getBirthday());
        selectByText(By.name("bmonth"), contactData.getBirthmonth());
        type(By.name("byear"), contactData.getBirthyear());
        type(By.name("address2"), contactData.getAddress2());
        type(By.name("phone2"), contactData.getPhone());

//        driver.findElement(By.name("firstname")).clear();
//        driver.findElement(By.name("firstname")).sendKeys("James");
//        driver.findElement(By.name("lastname")).clear();
//        driver.findElement(By.name("lastname")).sendKeys("Bond");
//        driver.findElement(By.name("address")).clear();
//        driver.findElement(By.name("address")).sendKeys("Britain, London");
//        driver.findElement(By.name("home")).clear();
//        driver.findElement(By.name("home")).sendKeys("123456789");
//        driver.findElement(By.name("mobile")).clear();
//        driver.findElement(By.name("mobile")).sendKeys("987654321");
//        driver.findElement(By.name("work")).clear();
//        driver.findElement(By.name("work")).sendKeys("111111111");
//        driver.findElement(By.name("email")).clear();
//        driver.findElement(By.name("email")).sendKeys("james@bond.com");
//        new Select(driver.findElement(By.name("bday"))).selectByVisibleText("7");
//        new Select(driver.findElement(By.name("bmonth"))).selectByVisibleText("July");
//        driver.findElement(By.name("byear")).clear();
//        driver.findElement(By.name("byear")).sendKeys("1907");
//        driver.findElement(By.name("address2")).clear();
//        driver.findElement(By.name("address2")).sendKeys("Italy, Padova");
//        driver.findElement(By.name("phone2")).clear();
//        driver.findElement(By.name("phone2")).sendKeys("Homeless");
    }

    private void selectByText(By locator, String text) {
        new Select(driver.findElement(locator)).selectByVisibleText(text);
    }

//    public void emptyContactFields() {
//        type(By.name("firstname"), contactData.getFirstname());
//        type(By.name("lastname"), contactData.getLastname());
//        type(By.name("address"), contactData.getAddress());
//        type(By.name("home"), contactData.getHome());
//        type(By.name("mobile"), contactData.getMobile());
//        type(By.name("work"), contactData.getWork());
//        type(By.name("email"), contactData.getEmail());
//        selectByText(By.name("bday"), contactData.getBirthday());
//        selectByText(By.name("bmonth"), contactData.getBirthmonth());
//        type(By.name("byear"), contactData.getBirthyear());
//        type(By.name("address2"), contactData.getAddress2());
//        type(By.name("phone2"), contactData.getPhone());
//    }

    public void saveContact() {
        click(By.name("submit"));
    }
//  Maybe this method will be necessary for returning to Home Page
    public void openHomePage() {
        click(By.linkText("home"));
    }

//    public void addContactToGroup(NavigationHelper navigationHelper) {
//        new Select(driver.findElement(By.name("group_name"))).selectByVisibleText("Group Name 1");
//        click(By.name("add"));
//    }
}
