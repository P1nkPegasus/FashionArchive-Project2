package com.fashion.fashionarchives.model;

import javax.persistence.*;

@Entity
@Table(name = "designer")
public class Designer {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer designer_Id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private String location;

    @Column
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
