package com.example.tests;

public class GroupData {

    private String name;
    private String header;
    private String footer;

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
    public void setName(String name) {
        this.name = name;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }
}
