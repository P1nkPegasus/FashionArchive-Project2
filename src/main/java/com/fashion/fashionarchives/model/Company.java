package com.fashion.fashionarchives.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String website;

    public Designer getDesigner() {
        return designer;
    }


    public void setDesigner(Designer designer) {
        this.designer = designer;
    }

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "designerId") // creating foreign key

    private Designer designer;

    public Company() {
    }

    public Company(Long id, String name, String website) {
        this.id = id;
        this.name = name;
        this.website = website;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", designer=" + designer +
                '}';
    }
}
