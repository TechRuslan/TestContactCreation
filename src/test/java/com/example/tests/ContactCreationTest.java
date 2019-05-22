package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testNonEmptyContactCreation() throws Exception {

        ContactData contactData = new ContactData();
        contactData.setFirstname("James");
        contactData.setLastname("Bond");
        contactData.setAddress("Britain, London");
        contactData.setHome("123456789");
        contactData.setMobile("987654321");
        contactData.setWork("1111111111");
        contactData.setEmail("james@bond.com");
        contactData.setBirthday("7");
        contactData.setBirthmonth("July");
        contactData.setBirthyear("1907");
        contactData.setAddress2("Italy, Padova");
        contactData.setPhone("Homeless");

        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openHomePage();
        app.getContactHelper().createContact();
        app.getContactHelper().populateContactFields(contactData);
        app.getContactHelper().saveContact();
        app.getNavigationHelper().openHomePage();
        //app.getNavigationHelper().contactHelper.addContactToGroup(app.getNavigationHelper());
    }

/*    @Test
    public void testEmptyContactCreation() throws Exception {
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openHomePage();
        app.getContactHelper().createContact();

        ContactData contactData = new ContactData();
        contactData.setFirstname("");
        contactData.setLastname("");
        contactData.setAddress("");
        contactData.setHome("");
        contactData.setMobile("");
        contactData.setWork("");
        contactData.setEmail("");
        contactData.setBirthday("");
        contactData.setBirthmonth("");
        contactData.setBirthyear("");
        contactData.setAddress2("");
        contactData.setPhone("");

        app.getContactHelper().populateContactFields(contactData);
        app.getContactHelper().saveContact();
        app.getNavigationHelper().openHomePage();
        //app.getNavigationHelper().contactHelper.addContactToGroup(app.getNavigationHelper());
    }
*/
}
