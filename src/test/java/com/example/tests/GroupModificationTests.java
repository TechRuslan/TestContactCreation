package com.example.tests;

import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase{

    @Test
    public void modifySomeGroup (){
        app.getNavigationHelper().openMainPage();
        app.getNavigationHelper().openGroupsPage();
        app.getGroupHelper().initGroupModification(1);

        GroupData groupData = new GroupData();
        groupData.setName("Edited Group Name 1");
        app.getGroupHelper().populateGroupFields(groupData);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().openGroupsPage();
    }
}
