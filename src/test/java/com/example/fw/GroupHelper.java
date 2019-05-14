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
        type(By.name("group_name"), groupData.getGroupname());
        type(By.name("group_header"), groupData.getGroupheader());
        type(By.name("group_footer"), groupData.getGroupfooter());
    }

    public void saveGroup() {
        click(By.name("submit"));
    }

}
