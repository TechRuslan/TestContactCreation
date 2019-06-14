package com.example.tests;

import java.util.List;
import org.testng.annotations.*;
import static org.testng.Assert.assertEquals;

public class GroupCreationTest extends TestBase{

    @Test
    public void testNonEmptyFormCreation() throws Exception {

        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openGroupsPage();
        app.getGroupHelper().createGroup();

        // save previous state
        List<GroupData> previousList = app.getGroupHelper().getGroups();

        // actions
        GroupData groupData = new GroupData();
        groupData.setName("Group Name 1");
        groupData.setHeader("Header 1");
        groupData.setFooter("Footer 1");

        app.getGroupHelper().populateGroupFields(groupData);
        app.getGroupHelper().saveGroup();
        app.getNavigationHelper().openGroupsPage();

        // save new state
        List<GroupData> newList = app.getGroupHelper().getGroups();

        //compare states
        assertEquals(newList.size(), previousList.size() + 1);

        previousList.add(groupData);
        assertEquals(newList, previousList);

    }

 //   @Test
    public void testEmptyFormCreation() throws Exception {
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openGroupsPage();
        app.getGroupHelper().createGroup();
        app.getGroupHelper().populateGroupFields(new GroupData("", "", ""));
        app.getGroupHelper().saveGroup();
        app.getNavigationHelper().openGroupsPage();
    }
}