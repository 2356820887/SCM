package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.Supplier;
import com.chino.scm.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/sup")
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    Map<String, Object> data = new HashMap<>();

    @GetMapping("find-all")
    public Result<Map<String, Object>> findAll() {
        data.put("data", supplierService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/find-name-cname")
    public Result<Map<String, Object>> findByNameOrContactName(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "contactName", required = false) String contactName) {
        data.put("data", supplierService.findByNameOrContactName(name, contactName));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/update")
    public Result<Map<String, Object>> updateSupplier(@RequestBody Supplier supplier) {
        data.put("data", supplierService.updateSupplier(supplier));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> addSupplier(@RequestBody Supplier supplier) {
        System.out.println(supplier);
        data.put("data", supplierService.addSupplier(supplier));
        return new Result<>(200, data, "成功");
    }
}
