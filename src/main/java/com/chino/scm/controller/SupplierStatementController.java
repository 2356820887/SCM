package com.chino.scm.controller;

import com.chino.scm.pojo.SupplierStatement;
import com.chino.scm.service.SupplierStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("slsm")
public class SupplierStatementController {

    @Autowired
    private SupplierStatementService supplierStatementService;

    @GetMapping("/find-all")
    public SupplierStatement findAll(){
        return supplierStatementService.findAll();
    }
}
