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



    }

