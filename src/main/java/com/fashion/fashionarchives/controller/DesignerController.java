package com.fashion.fashionarchives.controller;

import com.fashion.fashionarchives.model.Company;
import com.fashion.fashionarchives.model.Designer;
import com.fashion.fashionarchives.model.Piece;
import com.fashion.fashionarchives.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
    @RequestMapping(path = "/api")
    public class DesignerController {

    private DesignerService designerService;

    @Autowired
    public void setDesignerService(DesignerService designerService) {
        this.designerService = designerService;
    }

    @GetMapping(path = "/hello-world/")
    public String getHelloWorld() {
        return "hello world";
    }

    @GetMapping("/designers/")
    public List<Designer> getAllDesigners() {
        System.out.println("calling getAllDesigners...");
        return designerService.getAllDesigners();
    }

    @GetMapping(path = "/designers/{designerId}")
    public Optional getDesigner(@PathVariable Long designerId) {
        System.out.println("calling getDesigner...");
        return designerService.getDesigner(designerId);
    }

    @PostMapping("/designers/")
    public Designer createDesigner(@RequestBody Designer designerObject) {
        System.out.println("calling createDesigner...");
        return designerService.createDesigner(designerObject);
    }

    @PutMapping("/designers/{designerId}")
    public Designer updateDesigner(@PathVariable(value = "designerId") Long designerId, @RequestBody Designer designerObject) {
        System.out.println("calling updateDesigner...");
        return designerService.updateDesigner(designerId, designerObject);
    }

    @DeleteMapping("/designers/{designerId}")
    public Optional<Designer> deleteDesigner(@PathVariable(value = "designerId") Long designerId) {
        System.out.println("calling deleteDesigner...");
        return designerService.deleteDesigner(designerId);
    }

    ////////COMPANY
    @GetMapping("/designers/{designerId}/companies")
    public List<Company> getAllDesignerCompany(@PathVariable(value = "designerId") Long designerId) {
        System.out.println("calling getAllDesignerCompany...");
        return designerService.getAllDesignerCompany(designerId);
    }

    @GetMapping("/designers/{designerId}/companies/{companyId}")
    public Company getDesignerCompany(@PathVariable(value = "designerId") Long designerId,
                                      @PathVariable(value = "companyId") Long companyId) {
        System.out.println("calling getAllDesignerCompany...");
        return designerService.getDesignerCompany(designerId, companyId);
    }

    @PostMapping("/designers/{designerId}/companies")
    public Company createDesignerCompany(@PathVariable(value = "designerId") Long designerId,
                                         @RequestBody Company companyObject) {
        System.out.println("calling createDesignerCompany");
        return designerService.createDesignerCompany(designerId, companyObject);
    }

    @PutMapping("/designers/{designerId}/companies/{companyId}")
    public Company updateDesignerCompany(@PathVariable(value = "designerId") Long designerId,
                                         @PathVariable(value = "companyId") Long companyId,
                                         @RequestBody Company companyObject) {
        System.out.println("calling updateDesignerCompany");
        return designerService.updateDesignerCompany(designerId, companyId, companyObject);
    }

    @DeleteMapping("/designers/{designerId}/companies/{companyId}")
    public void deleteDesignerCompany(@PathVariable(value = "designerId") Long designerId,
                                       @PathVariable(value = "companyId") Long companyId) {
        System.out.println("calling deleteDesignerCompany");
        designerService.deleteDesignerCompany(designerId, companyId);
    }

    ////////PIECE
    @GetMapping("/designers/{designerId}/pieces")
    public List<Piece> getAllDesignerPiece(@PathVariable(value = "designerId") Long designerId) {
        System.out.println("calling getAllDesignerPiece...");
        return designerService.getAllDesignerPiece(designerId);
    }

    @GetMapping("/designers/{designerId}/pieces/{pieceId}")
    public Piece getDesignerPiece(@PathVariable(value = "designerId") Long designerId,
                                      @PathVariable(value = "pieceId") Long pieceId) {
        System.out.println("calling getDesignerPiece...");
        return designerService.getDesignerPiece(designerId, pieceId);
    }

    @PostMapping ("/designers/{designerId}/pieces")
    public Piece createDesignerPiece(@PathVariable(value = "designerId") Long designerId,
                                         @RequestBody Piece pieceObject) {
        System.out.println("calling createDesignerPiece...");
        return designerService.createDesignerPiece(designerId, pieceObject);
    }

    @PutMapping("/designers/{designerId}/pieces/{pieceId}")
    public Piece updateDesignerPiece(@PathVariable(value = "designerId") Long designerId,
                                         @PathVariable(value = "pieceId") Long pieceId,
                                         @RequestBody Piece pieceObject) {
        System.out.println("calling updateDesignerPiece...");
        return designerService.updateDesignerPiece(designerId, pieceId, pieceObject);
    }

    @DeleteMapping("/designers/{designerId}/pieces/{pieceId}")
    public void deleteDesignerPiece(@PathVariable(value = "designerId") Long designerId,
                                      @PathVariable(value = "pieceId") Long pieceId) {
        System.out.println("calling deleteDesignerPiece");
        designerService.deleteDesignerPiece(designerId, pieceId);
    }

}

