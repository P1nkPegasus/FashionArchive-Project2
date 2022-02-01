package com.fashion.fashionarchives.service;

//import com.fashion.fashionarchives.repository.DesignerRepository;
import com.fashion.fashionarchives.exceptions.InformationExistException;
import com.fashion.fashionarchives.exceptions.InformationNotFoundException;
import com.fashion.fashionarchives.model.Designer;
import com.fashion.fashionarchives.repository.DesignerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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


    public Optional getDesigner(Long designerId) {
        System.out.println("service getCategory...");
        Optional designer = designerRepository.findById(designerId);
        if (designer.isPresent()) {
            return designer;
        } else {
            throw new InformationNotFoundException("designer with id " + designerId + " not found");
        }
    }

    public Designer createDesigner(Designer designerObject) {
        System.out.println("service calling createDesigner...");

       Designer designer = designerRepository.findByName(designerObject.getFirstName());
        if (designer != null) {
            throw new InformationExistException("designer with name " + designer.getFirstName() + " already exists");
        } else {
            return designerRepository.save(designerObject);
        }
    }

}