package com.fashion.fashionarchives.controller;

import com.fashion.fashionarchives.service.DesignerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


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
//    public List<Designer> getAllDesigners(){
        public String getAllDesigners(){
            return "calling getAllDesigners";
//        return DesignerService.getAllDesigners();
    }


    @GetMapping(path = "/designers/{designerId}")
    public String getDesigner(@PathVariable Long designerId) {
        return "getting the designer with the id of " + designerId;
    }

    @PostMapping("/designers/")
    public String createDesigner(@RequestBody String body) {
        return "creating a designer " + body;
    }

    @PutMapping("/categories/{categoryId}")
    public String updateCategory(@PathVariable(value = "categoryId") Long categoryId, @RequestBody String body) {
        return "updating the category with the id of " + categoryId + body;
    }

    @DeleteMapping("/categories/{categoryId}")
    public String deleteCategory(@PathVariable(value = "categoryId") Long categoryId) {
        return "deleting the category with the id of " + categoryId;
    }

    }

