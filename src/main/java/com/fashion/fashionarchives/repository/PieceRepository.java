package com.fashion.fashionarchives.repository;

import com.fashion.fashionarchives.model.Company;
import com.fashion.fashionarchives.model.Piece;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PieceRepository extends JpaRepository<Piece, Long> {
    Optional<Piece> findByType(String type);
}
