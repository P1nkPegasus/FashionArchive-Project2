package com.fashion.fashionarchives.repository;

import com.fashion.fashionarchives.model.Designer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DesignerRepository extends JpaRepository<Designer, Long> {

    Designer findByFirstName(String designerFirstName);

}