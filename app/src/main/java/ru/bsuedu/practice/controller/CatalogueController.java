package ru.bsuedu.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main/catalogue")
public class CatalogueController {
    
    @GetMapping()
    public String showCataloguePage(){
        return "catalogue-page";
    }
}
