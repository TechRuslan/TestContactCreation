package com.example.tests;

public class GroupData {
    public String name;
    public String header;
    public String footer;

    public GroupData(String name, String header, String footer) {
        this.name = name;
        this.header = header;
        this.footer = footer;
    }

    public GroupData() {
    }

    public String getGroupname() {
        return name;
    }

    public String getGroupheader() {
        return header;
    }

    public String getGroupfooter() {
        return footer;
    }
}
