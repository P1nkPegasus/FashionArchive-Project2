package com.fashion.fashionarchives.model;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long companyId;

    @Column
    private String name;

    @Column
    private String website;

    public Company(Long companyId, String name, String website) {
        this.companyId = companyId;
        this.name = name;
        this.website = website;
    }

    public Company() {
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getName() {
        return name;
    }

    public void setName(String companyName) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
