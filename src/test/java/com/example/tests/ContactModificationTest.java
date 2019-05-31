package com.example.tests;

import org.testng.annotations.Test;

public class ContactModificationTest extends TestBase {

    @Test
    public void modifySomeContact(){
        app.getNavigationHelper().openMainPage();
        app.getContactHelper().initContactModification(1);

        ContactData contactData = new ContactData();
        contactData.setFirstname("Iron");
        contactData.setLastname("Man");

        app.getContactHelper().populateContactFields(contactData);
        app.getContactHelper().updateContact();
        app.getNavigationHelper().openHomePage();
    }
}
