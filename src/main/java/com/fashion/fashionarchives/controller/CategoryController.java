package com.fashion.fashionarchives.controller;

import com.fashion.fashionarchives.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
    @RequestMapping(path = "/api")
    public class CategoryController {


        private CategoryService categoryService;

    @Autowired
    public void setCategoryService (CategoryService categoryService) {
        this.categoryService = categoryService;
    }



    @GetMapping(path = "/hello-world/")
    public String getHelloWorld(){
        return "hello world";
    }



    }

