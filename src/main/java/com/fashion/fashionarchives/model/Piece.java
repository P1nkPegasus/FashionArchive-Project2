package com.fashion.fashionarchives.model;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "piece")
public class Piece {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String color;

    @Column
    private String textiles;

    @Column
    private String type;


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

    public Piece() {
    }

    public Piece(Long id, String color, String textiles, String type) {
        this.id = id;
        this.color = color;
        this.textiles = textiles;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTextiles() {
        return textiles;
    }

    public void setTextiles(String textiles) {
        this.textiles = textiles;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Piece{" +
                "id=" + id +
                ", color='" + color + '\'' +
                ", textiles='" + textiles + '\'' +
                ", type='" + type + '\'' +
                ", designer=" + designer +
                '}';
    }
}
