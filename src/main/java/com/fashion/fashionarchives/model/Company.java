package com.fashion.fashionarchives.model;

public class Company {

    private Integer company_id;
    private String company_name;
    private String website;

    public Company(Integer company_id, String company_name, String website) {
        this.company_id = company_id;
        this.company_name = company_name;
        this.website = website;
    }

    public Company() {
    }

    public Integer getCompany_id() {
        return company_id;
    }

    public void setCompany_id(Integer company_id) {
        this.company_id = company_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
