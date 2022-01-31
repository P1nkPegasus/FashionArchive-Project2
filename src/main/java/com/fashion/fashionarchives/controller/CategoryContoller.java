package com.fashion.fashionarchives.controller;

import com.fashion.fashionarchives.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class CategoryContoller {
    @RestController
    @RequestMapping(path = "/api")
    public class CategoryController {


        private CategoryService categoryService;

        @Autowired
        public void setCategoryService (CategoryService categoryService) {
            this.categoryService = categoryService;
        }
}
