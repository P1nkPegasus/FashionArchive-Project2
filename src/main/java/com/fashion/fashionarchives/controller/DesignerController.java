package com.fashion.fashionarchives.controller;

import com.fashion.fashionarchives.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
    @RequestMapping(path = "/api")
    public class DesignerController {


        private CategoryService categoryService;

    @Autowired
    public void setCategoryService (CategoryService categoryService) {
        this.categoryService = categoryService;
    }



    @GetMapping(path = "/hello-world/")
    public String getHelloWorld(){
        return "hello world";
    }

    @GetMapping("/designers/")
//    public List<Designer> getAllDesigners(){
        public String getAllDesigners(){
            return "calling getAllDesigners";
//        return categoryService.getAllDesigners();
    }



    }

