package com.fashion.fashionarchives.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "designer")
public class Designer {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String location;

    @Column
    private String website;

    @OneToMany(mappedBy = "designer")
    private List<Company> companyList;

    public Designer(Long id, String firstName, String lastName, String location, String website) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.website = website;
    }

    public Designer() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", location='" + location + '\'' +
                ", website='" + website + '\'' +
                '}';
    }





    public List<Company> getCompanyList() {
        return companyList;
    }


    public void setCompanyList(List<Company> companyList) {
        this.companyList = companyList;
    }

}
