package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.service.SupplierStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("sup-stm")
public class SupplierStatementController {

    @Autowired
    private SupplierStatementService supplierStatementService;

    @GetMapping("/find-all")
    public Result<Map<String, Object>> findAll(){
        Map<String, Object> data = new HashMap<>();
        data.put("data", supplierStatementService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/find-year")
    public Result<Map<String, Object>> findByYear(int year){
        Map<String, Object> data = new HashMap<>();
        data.put("data", supplierStatementService.findByYear(year));
        return new Result<>(200, data, "成功");
    }
}
