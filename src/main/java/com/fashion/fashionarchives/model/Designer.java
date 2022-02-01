package com.fashion.fashionarchives.model;

import javax.persistence.*;

@Entity
@Table(name = "designer")
public class Designer {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long designerId;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String location;

    @Column
    private String website;

    public Designer(Long designerId, String firstName, String lastName, String location, String website) {
        this.designerId = designerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.website = website;
    }

    public Designer() {
    }

    public Long getDesignerId() {
        return designerId;
    }

    public void setDesignerId(Long designerId) {
        this.designerId = designerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    @Override
    public String toString() {
        return "Designer{" +
                "designerId=" + designerId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                ", website='" + website + '\'' +
                '}';
    }
}
