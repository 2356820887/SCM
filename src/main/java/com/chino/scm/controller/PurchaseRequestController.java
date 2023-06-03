package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.service.PurchaseRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pur-req")
public class PurchaseRequestController {
    @Autowired
    private PurchaseRequestService purchaseRequestService;
    Map<String, Object> data = new HashMap<>();

    @GetMapping("/find-all")
    public Result<Map<String, Object>> findAll() {
        data.put("data", purchaseRequestService.findAll());
        return new Result<>(200, data, "成功");
    }
}
