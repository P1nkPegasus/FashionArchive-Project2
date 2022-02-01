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


    @GetMapping(path = "/categories/{categoryId}")
    public String getDesigner(@PathVariable Long designerId) {
        return "getting the category with the id of " + categoryId;
    }

    @PostMapping("/categories/")
    public String createCategory(@RequestBody String body) {
        return "creating a category " + body;
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

