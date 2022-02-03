package com.fashion.fashionarchives.service;

import com.fashion.fashionarchives.model.Company;
import com.fashion.fashionarchives.model.Piece;
import com.fashion.fashionarchives.repository.CompanyRepository;
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


    private CompanyRepository companyRepository;

    @Autowired
    public void setCompanyRepository(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    public List<Designer> getAllDesigners() {
        System.out.println("service calling getAllDesigners...");
        return designerRepository.findAll();
    }


    public Optional<Designer> getDesigner(Long designerId) {
        System.out.println("service calling getCategory...");

        Optional<Designer> designer = designerRepository.findById(designerId);
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
            throw new InformationExistException("designers with name " + designer.getFirstName() + " already exists");
        } else {
        return designerRepository.save(designerObject);
        //throw exception if there is someone with a similar name
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

    public Company getDesignerCompany(Long designerId, Long companyId) {
        System.out.println("service calling getDesignerCompany...");

        Optional<Designer> designer = designerRepository.findById(designerId);
        if (designer.isPresent()) {
        for(Company company : designer.get().getCompanyList()){
            if(company.getId() == companyId) {
                return company;
            }
        }
        throw new InformationNotFoundException("company with id " + companyId + " not found");
    } else{
        throw new InformationNotFoundException("designer with id " + designerId + " not found");
    }
}

    public Company createDesignerCompany(Long designerId, Company companyObject) {
        System.out.println("service calling createDesignerCompany...");

        Optional<Designer> designer = designerRepository.findById(designerId);
        Optional<Company> company = companyRepository.findByName(companyObject.getName());
        if(company.isPresent())
            throw new InformationExistException("company with name " + companyObject.getName() + " already exists.");
        companyObject.setDesigner(designer.get());
        return companyRepository.save(companyObject);
    }

    public Company updateDesignerCompany(Long designerId, Long companyId, Company companyObject){
                System.out.println("service calling updateDesignerCompany...");

        Optional<Designer> designer = designerRepository.findById(designerId);
        if(designer.isPresent()){
            for(Company company : designer.get().getCompanyList()){
                if(company.getId() == companyId) {
                    company.setName(companyObject.getName());
                    company.setWebsite(companyObject.getWebsite());

                    return companyRepository.save(company);
                }
            }
            throw new InformationNotFoundException("company with id " + companyId + " not found");
        } else{
            throw new InformationNotFoundException("designer with id " + designerId + " not found");
        }
    }

    public Company deleteDesignerCompany(Long designerId, Long companyId){
        Optional<Designer> designer = designerRepository.findById(designerId);
        if(designer.isPresent()){
            for(Company company : designer.get().getCompanyList()){
                if(company.getId() == companyId) {
                    companyRepository.deleteById(companyId);
                    return company;
                }
            }
            throw new InformationNotFoundException("company with id " + companyId + " not found");
        } else{
            throw new InformationNotFoundException("designer with id " + designerId + " not found");
        }
    }

    public List<Piece> getAllDesignerPiece(Long designerId) {
    }

    ////////PIECE

}