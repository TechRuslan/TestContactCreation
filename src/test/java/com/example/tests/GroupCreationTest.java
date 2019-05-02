package com.example.tests;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase{

    @Test
    public void testNonEmptyFormCreation() throws Exception {
        app.navigationHelper.openMainPage();
        app.navigationHelper.openGroupsPage();
        app.groupHelper.createGroup();
        GroupData groupData = new GroupData();
        groupData.name = "Group Name 1";
        groupData.header = "Header 1";
        groupData.footer = "Footer 1";
        app.groupHelper.populateGroupFields(groupData);
        app.groupHelper.saveGroup();
    }

    @Test
    public void testEmptyFormCreation() throws Exception {
        app.navigationHelper.openMainPage();
        app.navigationHelper.openGroupsPage();
        app.groupHelper.createGroup();
        app.groupHelper.populateGroupFields(new GroupData("", "", ""));
        app.groupHelper.saveGroup();
    }
}