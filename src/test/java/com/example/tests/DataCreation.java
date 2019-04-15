package com.example.tests;

import org.testng.annotations.*;

public class DataCreation extends TestBase{

    @Test
    public void testEmptyFormCreation() throws Exception {
        app.navigationHelper.openMainPage(DataCreation.this);
        app.navigationHelper.groupHelper.openGroupsPage(DataCreation.this);
        app.groupHelper.createGroup(DataCreation.this);
        app.groupHelper.populateGroupFields(new GroupData("", "", ""), DataCreation.this);
        app.groupHelper.saveGroup(DataCreation.this);
        app.contactHelper.createContact(DataCreation.this);
        app.contactHelper.populateContactFields(DataCreation.this);
        app.contactHelper.saveContact(DataCreation.this);
        app.navigationHelper.openHomePage(DataCreation.this);
        app.navigationHelper.addContactToGroup(DataCreation.this);
    }
    @Test
    public void testNonEmptyFormCreation() throws Exception {
        app.navigationHelper.openMainPage(DataCreation.this);
        app.navigationHelper.groupHelper.openGroupsPage(DataCreation.this);
        app.groupHelper.createGroup(DataCreation.this);
        GroupData groupData = new GroupData();
        groupData.name = "Group Name 1";
        groupData.header = "Header 1";
        groupData.footer = "Footer 1";
        app.groupHelper.populateGroupFields(groupData, DataCreation.this);
        app.groupHelper.saveGroup(DataCreation.this);
        app.contactHelper.createContact(DataCreation.this);
        app.contactHelper.populateContactFields(DataCreation.this);
        app.contactHelper.saveContact(DataCreation.this);
        app.navigationHelper.openHomePage(DataCreation.this);
        app.navigationHelper.addContactToGroup(DataCreation.this);
    }

}