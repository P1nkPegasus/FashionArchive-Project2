package com.fashion.fashionarchives.repository;

import com.fashion.fashionarchives.model.Piece;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PieceRepository extends JpaRepository<Piece, Long> {
}
