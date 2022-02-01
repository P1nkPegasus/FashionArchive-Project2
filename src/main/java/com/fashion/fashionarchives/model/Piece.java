package com.fashion.fashionarchives.model;

public class Piece {

    private Integer piece_id;
    private String color;
    private String textiles;
    private String type;

    public Piece(Integer piece_id, String color, String textiles, String type) {
        this.piece_id = piece_id;
        this.color = color;
        this.textiles = textiles;
        this.type = type;
    }

    public Piece() {
    }

    public Integer getPiece_id() {
        return piece_id;
    }

    public void setPiece_id(Integer piece_id) {
        this.piece_id = piece_id;
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
}
