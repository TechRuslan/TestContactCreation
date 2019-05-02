package com.example.fw;

import com.example.tests.GroupData;
import org.openqa.selenium.By;

public class GroupHelper extends HelperBase {

    public GroupHelper(ApplicationManager manager) {
        super(manager);
    }

    public void createGroup() {
        driver.findElement(By.name("new")).click();
    }

    public void populateGroupFields(GroupData groupData) {
        driver.findElement(By.name("group_name")).clear();
        driver.findElement(By.name("group_name")).sendKeys(groupData.getGroupname());
        driver.findElement(By.name("group_header")).clear();
        driver.findElement(By.name("group_header")).sendKeys(groupData.getGroupheader());
        driver.findElement(By.name("group_footer")).clear();
        driver.findElement(By.name("group_footer")).sendKeys(groupData.getGroupfooter());
    }

    public void saveGroup() {
        driver.findElement(By.name("submit")).click();
    }

}
