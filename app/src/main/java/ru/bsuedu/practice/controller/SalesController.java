package ru.bsuedu.practice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/main/sales")
public class SalesController {

    @GetMapping()
    public String showSalesPage(){
        return "sales-page";
    }
}
