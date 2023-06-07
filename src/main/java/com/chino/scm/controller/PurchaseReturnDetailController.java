package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.PurchaseReturnDetail;
import com.chino.scm.service.PurchaseReturnDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pur-re-det")
public class PurchaseReturnDetailController {
    @Autowired
    private PurchaseReturnDetailService purchaseReturnDetailService;
    Map<String, Object> data = new HashMap<>();
    @GetMapping("/find-all")
    public Result<Map<String, Object>> finAll(){
        data.put("data", purchaseReturnDetailService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/delete")
    public Result<Map<String, Object>> deletePlan(Integer id) {
        data.put("data", purchaseReturnDetailService.deleteDetail(id));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> addDetail(@RequestBody PurchaseReturnDetail purchaseReturnDetail) {
        data.put("data", purchaseReturnDetailService.addPlan(purchaseReturnDetail));
        return new Result<>(200, data, "成功");
    }
}
