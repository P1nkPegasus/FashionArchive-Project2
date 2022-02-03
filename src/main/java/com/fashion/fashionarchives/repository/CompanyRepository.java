package com.fashion.fashionarchives.repository;

import com.fashion.fashionarchives.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {
//    Optional<Company> findByDesignerId(Long designerId);
//    List<Company> findByDesignerFirstName(Long companyId);
//List<Company> findByDesignerId(Long companyId);


}
