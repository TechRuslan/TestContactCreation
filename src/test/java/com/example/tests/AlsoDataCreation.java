package com.example.tests;

import org.testng.annotations.Test;

public class AlsoDataCreation extends TestBase{

        @Test
        public void testEmptyFormCreation() throws Exception {
            openMainPage();
            openGroupsPage();
            createGroup();
            populateGroupFields(new GroupData("", "", ""));
            saveGroup();
            createContact();
            populateContactFields();
            saveContact();
            openHomePage();
            addContactToGroup();
        }
        @Test
        public void testNonEmptyFormCreation() throws Exception {
            openMainPage();
            openGroupsPage();
            createGroup();
            GroupData groupData = new GroupData();
            groupData.name = "Group Name 1";
            groupData.header = "Header 1";
            groupData.footer = "Footer 1";
            populateGroupFields(groupData);
            saveGroup();
            createContact();
            populateContactFields();
            saveContact();
            openHomePage();
            addContactToGroup();
        }

    }
