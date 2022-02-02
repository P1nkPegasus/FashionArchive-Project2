package com.fashion.fashionarchives.repository;

import com.fashion.fashionarchives.model.Company;
import com.fashion.fashionarchives.model.Designer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
    List<Company> findByDesignerId(Long companyId);

}
