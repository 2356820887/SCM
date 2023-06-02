package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.service.SupplierStatementService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("sup-stm")
public class SupplierStatementController {

    @Autowired
    private SupplierStatementService supplierStatementService;

    Map<String, Object> data = new HashMap<>();

    @GetMapping("/find-all")
    public Result<Map<String, Object>> findAll() {
        data.put("data", supplierStatementService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("find-year-supplier")
    public Result<Map<String, Object>> findByYearOrSupplier(@RequestParam(value = "year", required = false) Integer year, @RequestParam(value = "supplierName", required = false) String supplierName) {
        data.put("data", supplierStatementService.findByYearOrSupplier(year, supplierName));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/order-quarter")
    public Result<Map<String, Object>> orderByQuarter() {
        data.put("data", supplierStatementService.orderByQuarter());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/order-month")
    public Result<Map<String, Object>> orderByMonth() {
        data.put("data", supplierStatementService.orderByMonth());
        return new Result<>(200, data, "成功");
    }
}
