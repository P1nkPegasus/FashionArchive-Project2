package com.fashion.fashionarchives.model;

import javax.persistence.*;

@Entity
@Table(name = "season")
public class Season {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seasonId;

    @Column
    private String name;

    @Column
    private String year;

    @Column
    private String category;

    public Season(Long seasonId, String name, String year, String category) {
        this.seasonId = seasonId;
        this.name = name;
        this.year = year;
        this.category = category;
    }

    public Season() {
    }

    public Long getSeasonId() {
        return seasonId;
    }

    public void setSeasonId(Long seasonId) {
        this.seasonId = seasonId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
