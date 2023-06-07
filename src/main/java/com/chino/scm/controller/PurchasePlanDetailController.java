package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.PurchasePlanDetail;
import com.chino.scm.service.PurchasePlanDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pur-plan-det")
public class PurchasePlanDetailController {
    @Autowired
    private PurchasePlanDetailService purchasePlanDetailService;
    Map<String, Object> data = new HashMap<>();
    @GetMapping("/find-all")
    public Result<Map<String, Object>> finAll(){
        data.put("data", purchasePlanDetailService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/delete")
    public Result<Map<String, Object>> deletePlan(Integer id) {
        data.put("data", purchasePlanDetailService.deletePlan(id));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> addDetail(@RequestBody PurchasePlanDetail purchasePlanDetail) {
        data.put("data", purchasePlanDetailService.addPlan(purchasePlanDetail));
        return new Result<>(200, data, "成功");
    }
}
