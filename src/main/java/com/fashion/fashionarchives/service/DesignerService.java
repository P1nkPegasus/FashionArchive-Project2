package com.fashion.fashionarchives.service;

import com.fashion.fashionarchives.model.Company;
import com.fashion.fashionarchives.repository.DesignerRepository;
import com.fashion.fashionarchives.exceptions.InformationExistException;
import com.fashion.fashionarchives.exceptions.InformationNotFoundException;
import com.fashion.fashionarchives.model.Designer;
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
            System.out.println("service calling getAllDesigners...");
            return designerRepository.findAll();
        }


    public Optional getDesigner(Long designerId) {
        System.out.println("service calling getCategory...");
        Optional designer = designerRepository.findById(designerId);
        if (designer.isPresent()) {
            return designer;
        } else {
            throw new InformationNotFoundException("designer with id " + designerId + " not found");
        }
    }

    public Designer createDesigner(Designer designerObject) {
        System.out.println("service calling createDesigner...");

       Designer designer = designerRepository.findByFirstName(designerObject.getFirstName());
        if (designer != null) {
            throw new InformationExistException("designer with name " + designer.getFirstName() + " already exists");
        } else {
            return designerRepository.save(designerObject);
        }
    }

    public Designer updateDesigner(Long designerId, Designer designerObject) {
        System.out.println("service calling updateDesigner...");
        Optional<Designer> designer = designerRepository.findById(designerId);
        if (designer.isPresent()) {
            if (designerObject.getFirstName().equals(designer.get().getFirstName())) {
                System.out.println("Same");
                throw new InformationExistException("designer " + designer.get().getFirstName() + "  already exists");
            } else {
                Designer updateDesigner = designerRepository.findById(designerId).get();
                updateDesigner.setFirstName(designerObject.getFirstName());
                updateDesigner.setLastName(designerObject.getLastName());
                updateDesigner.setLocation(designerObject.getLocation());
                updateDesigner.setWebsite(designerObject.getWebsite());
                return designerRepository.save(updateDesigner);
            }
        } else {
            throw new InformationNotFoundException("designer with id " + designerId + " not found");
        }
    }

    public Optional<Designer> deleteDesigner(Long designerId) {
        System.out.println("service calling deleteDesigner...");
        Optional<Designer> designer = designerRepository.findById(designerId);

        if (designer.isPresent()) {
            designerRepository.deleteById(designerId);
            return designer;
        } else {
            throw new InformationNotFoundException("designer with id " + designerId + " not found");
        }
    }


    ////////COMPANY
    public List<Company> getAllDesignerCompany(Long designerId) {
        System.out.println("service calling getAllDesignerCompany...");

        Optional<Designer> designer = designerRepository.findById(designerId);
            if (designer.isPresent()) {
                return designer.get().getCompanyList();
            } else {
                throw new InformationNotFoundException("designer with id " + designerId + " not found");
            }

    }


    public Company createDesignerCompany(Long designerId, Company companyObject) {
        System.out.println("service calling createDesignerCompany...");

        Optional<Designer> designer = designerRepository.findById(designerId);
        companyObject.setDesigner(designer.get());
        return companyRepository.save(companyObject);
    }
}