package com.fashion.fashionarchives.model;

public class Designer {

    private Integer designer_Id;
    private String first_name;
    private String last_name;
    private String location;
    private String website;

    public Designer(Integer designer_Id, String first_name, String last_name, String location, String website) {
        this.designer_Id = designer_Id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.location = location;
        this.website = website;
    }

    public Designer() {
    }

    public Integer getDesigner_Id() {
        return designer_Id;
    }

    public void setDesigner_Id(Integer designer_Id) {
        this.designer_Id = designer_Id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
