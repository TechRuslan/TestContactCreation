package com.example.tests;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase{

    @Test
    public void testNonEmptyFormCreation() throws Exception {

        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openGroupsPage();
        app.getGroupHelper().createGroup();

        GroupData groupData = new GroupData();
        groupData.setName("Group Name 1");
        groupData.setHeader("Header 1");
        groupData.setFooter("Footer 1");

        app.getGroupHelper().populateGroupFields(groupData);
        app.getGroupHelper().saveGroup();
    }

    @Test
    public void testEmptyFormCreation() throws Exception {
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openGroupsPage();
        app.getGroupHelper().createGroup();
        app.getGroupHelper().populateGroupFields(new GroupData("", "", ""));
        app.getGroupHelper().saveGroup();
    }
}