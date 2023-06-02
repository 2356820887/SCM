package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.service.CustomerStatementService;
import com.chino.scm.service.SupplierStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("cus-stm")
public class CustomerStatementController {

    @Autowired
    private CustomerStatementService customerStatementService;

    @GetMapping("/find-all")
    public Result<Map<String, Object>> findAll(){
        Map<String, Object> data = new HashMap<>();
        data.put("data", customerStatementService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/find-year")
    public Result<Map<String, Object>> findByYear(int year){
        Map<String, Object> data = new HashMap<>();
        data.put("data", customerStatementService.findByYear(year));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/find-quarter")
    public Result<Map<String, Object>> findByQuarter(int quarter){
        Map<String, Object> data = new HashMap<>();
        data.put("data", customerStatementService.findByQuarter(quarter));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/find-month")
    public Result<Map<String, Object>> findByMonth(int month){
        Map<String, Object> data = new HashMap<>();
        data.put("data", customerStatementService.findByMonth(month));
        return new Result<>(200, data, "成功");
    }
}
