package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.PurchaseContractDetail;
import com.chino.scm.service.PurchaseContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pur-con-det")
public class PurchaseContractDetailController {
    @Autowired
    private PurchaseContractDetailService purchaseContractDetailService;
    Map<String, Object> data = new HashMap<>();
    @GetMapping("/find-all")
    public Result<Map<String, Object>> finAll(){
        data.put("data", purchaseContractDetailService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/delete")
    public Result<Map<String, Object>> deletePlan(Integer id) {
        data.put("data", purchaseContractDetailService.deleteDetail(id));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> addDetail(@RequestBody PurchaseContractDetail purchaseContractDetail) {
        data.put("data", purchaseContractDetailService.addPlan(purchaseContractDetail));
        return new Result<>(200, data, "成功");
    }
}
