package com.example.fw;

import com.example.tests.GroupData;
import org.openqa.selenium.By;

public class GroupHelper extends HelperBase {

    public GroupHelper(ApplicationManager manager) {
        super(manager);
    }

    public void createGroup() {
        click(By.name("new"));
    }

    public void populateGroupFields(GroupData groupData) {
        type(By.name("group_name"), groupData.getName());
        type(By.name("group_header"), groupData.getHeader());
        type(By.name("group_footer"), groupData.getFooter());
    }

    public void saveGroup() {
        click(By.name("submit"));
    }

    public void openGroupsPage() {
        click(By.linkText("groups"));
    }

    public void deleteGroup(int index) {
        selectGroupByIndex(index);
        click(By.name("delete"));
    }

    private void selectGroupByIndex(int index) {
        click(By.xpath("//form[2]/input[@name='selected[]'][" + index + "]"));
    }

    public void initGroupModification(int index) {
        selectGroupByIndex(index);
        click(By.name("edit"));
    }

    public void submitGroupModification() {
        click(By.name("update"));
    }
}
