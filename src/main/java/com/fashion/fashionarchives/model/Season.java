package com.fashion.fashionarchives.model;

public class Season {

    private Integer season_id;
    private String season_name;
    private String season_year;
    private String category;

    public Season(Integer season_id, String season_name, String season_year, String category) {
        this.season_id = season_id;
        this.season_name = season_name;
        this.season_year = season_year;
        this.category = category;
    }

    public Season() {
    }

    public Integer getSeason_id() {
        return season_id;
    }

    public void setSeason_id(Integer season_id) {
        this.season_id = season_id;
    }

    public String getSeason_name() {
        return season_name;
    }

    public void setSeason_name(String season_name) {
        this.season_name = season_name;
    }

    public String getSeason_year() {
        return season_year;
    }

    public void setSeason_year(String season_year) {
        this.season_year = season_year;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
