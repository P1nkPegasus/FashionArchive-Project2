package com.fashion.fashionarchives.model;


import javax.persistence.*;

@Entity
@Table(name = "piece")
public class Piece {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pieceId;

    @Column
    private String color;

    @Column
    private String textiles;

    @Column
    private String type;

    public Piece(Long pieceId, String color, String textiles, String type) {
        this.pieceId = pieceId;
        this.color = color;
        this.textiles = textiles;
        this.type = type;
    }

    public Piece() {
    }

    public Long getPieceId() {
        return pieceId;
    }

    public void setPieceId(Long pieceId) {
        this.pieceId = pieceId;
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
