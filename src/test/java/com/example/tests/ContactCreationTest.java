package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testNonEmptyContactCreation() throws Exception {
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openHomePage();
        app.getContactHelper().createContact();
        app.getContactHelper().populateContactFields();
        app.getContactHelper().saveContact();
        app.getNavigationHelper().openHomePage();
        //app.getNavigationHelper().contactHelper.addContactToGroup(app.getNavigationHelper());
    }

    @Test
    public void testEmptyContactCreation() throws Exception {
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openHomePage();
        app.getContactHelper().createContact();
        app.getContactHelper().populateContactFields();
        app.getContactHelper().saveContact();
        app.getNavigationHelper().openHomePage();
        //app.getNavigationHelper().contactHelper.addContactToGroup(app.getNavigationHelper());
    }
}
