package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.PurchaseRequestDetail;
import com.chino.scm.service.PurchaseRequestDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pur-req-det")
public class PurchaseRequestDetailController {
    @Autowired
    private PurchaseRequestDetailService purchaseRequestDetailService;
    Map<String, Object> data = new HashMap<>();

    @GetMapping("/find-all")
    public Result<Map<String, Object>> findAll() {
        data.put("data", purchaseRequestDetailService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/find-request-id")
    public Result<Map<String, Object>> findByRequestId(Integer rid) {
        data.put("data", purchaseRequestDetailService.findByRequestId(rid));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/update")
    public Result<Map<String, Object>> updatePurchaseRequestDetail(@RequestBody PurchaseRequestDetail purchaseRequestDetail) {
        data.put("data", purchaseRequestDetailService.updatePurchaseRequestDetail(purchaseRequestDetail));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/delete")
    public Result<Map<String, Object>> deletePurchaseRequestDetail(Integer id){
        data.put("data", purchaseRequestDetailService.deletePurchaseRequestDetail(id));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/find-condition")
    public Result<Map<String, Object>> findByConditions(Map<String, Object> inputData){
        data.put("data", purchaseRequestDetailService.findByConditions(inputData));
        return new Result<>(200, data, "成功");
    }
}
