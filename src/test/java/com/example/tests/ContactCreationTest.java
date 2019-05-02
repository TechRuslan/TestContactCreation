package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTest extends TestBase {

    @Test
    public void testNonEmptyContactCreation() throws Exception {
        app.navigationHelper.openMainPage();
        app.navigationHelper.openHomePage();
        app.contactHelper.createContact();
        app.contactHelper.populateContactFields();
        app.contactHelper.saveContact();
        app.navigationHelper.openHomePage();
        //app.navigationHelper.contactHelper.addContactToGroup(app.navigationHelper);
    }

    @Test
    public void testEmptyContactCreation() throws Exception {
        app.navigationHelper.openMainPage();
        app.navigationHelper.openHomePage();
        app.contactHelper.createContact();
        app.contactHelper.populateContactFields();
        app.contactHelper.saveContact();
        app.navigationHelper.openHomePage();
        //app.navigationHelper.contactHelper.addContactToGroup(app.navigationHelper);
    }
}
