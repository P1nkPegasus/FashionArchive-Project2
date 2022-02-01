package com.fashion.fashionarchives.controller;

import com.fashion.fashionarchives.model.Designer;
import com.fashion.fashionarchives.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
    @RequestMapping(path = "/api")
    public class DesignerController {


        private DesignerService designerService;

    @Autowired
    public void setDesignerService (DesignerService designerService) {
        this.designerService = designerService;
    }



    @GetMapping(path = "/hello-world/")
    public String getHelloWorld(){
        return "hello world";
    }

    @GetMapping("/designers/")
    public List<Designer> getAllDesigners(){
        System.out.println("calling getAllDesigners...");
        return designerService.getAllDesigners();
    }

    @GetMapping(path = "/designers/{designerId}")
    public String getDesigner(@PathVariable Long designerId) {
        return "getting the designer with the id of " + designerId;
    }

    @PostMapping("/designers/")
    public String createDesigner(@RequestBody String body) {
        return "creating a designer " + body;
    }

    @PutMapping("/designers/{designerId}")
    public String updateDesigner(@PathVariable(value = "designerId") Long designerId, @RequestBody String body) {
        return "updating the designer with the id of " + designerId + body;
    }

    @DeleteMapping("/designers/{designerId}")
    public String deleteDesigner(@PathVariable(value = "designerId") Long designerId) {
        return "deleting the designer with the id of " + designerId;
    }

    }

