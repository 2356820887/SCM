package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.service.CustomerStatementService;
import com.chino.scm.service.SupplierStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("cus-stm")
public class CustomerStatementController {

    @Autowired
    private CustomerStatementService customerStatementService;

    Map<String, Object> data = new HashMap<>();

    @GetMapping("/find-all")
    public Result<Map<String, Object>> findAll() {
        data.put("data", customerStatementService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/find-year-customer")
    public Result<Map<String, Object>> findByYearOrCustomer(@RequestParam(value = "year", required = false) Integer year, @RequestParam(value = "customerName", required = false) String customerName) {
        data.put("data", customerStatementService.findByYearOrCustomer(year, customerName));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/order-quarter")
    public Result<Map<String, Object>> orderByQuarter() {
        data.put("data", customerStatementService.orderByQuarter());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/oder-month")
    public Result<Map<String, Object>> orderByMonth() {
        data.put("data", customerStatementService.orderByMonth());
        return new Result<>(200, data, "成功");
    }
}
