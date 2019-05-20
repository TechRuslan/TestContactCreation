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

}
