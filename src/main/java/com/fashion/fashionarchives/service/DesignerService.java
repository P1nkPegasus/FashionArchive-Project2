package com.fashion.fashionarchives.service;

//import com.fashion.fashionarchives.repository.DesignerRepository;
import com.fashion.fashionarchives.model.Designer;
import com.fashion.fashionarchives.repository.DesignerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //talks to designer repo
public class DesignerService {
    private DesignerRepository designerRepository;

    @Autowired
    public void setDesignerRepository(DesignerRepository designerRepository) {
        this.designerRepository = designerRepository;
    }

    public List<Designer> getAllDesigners() {
            System.out.println("calling getAllDesigners...");
            return designerRepository.findAll();
        }
    }


}