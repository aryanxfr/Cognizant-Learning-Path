package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
@RestController
public class LoanController {
    @GetMapping("/loans/{number}")
    public Map<String, Object>  getLoanDetails(@PathVariable String number){
        Map<String, Object> loan=new HashMap<>();
        loan.put("number",number);
        loan.put("type","car");
        loan.put("loan",70000);
        loan.put("emi",2572);
        loan.put("tenure",20);
        return loan;
    }
}
