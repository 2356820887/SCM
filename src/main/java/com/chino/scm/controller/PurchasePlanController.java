package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.PurchasePlan;
import com.chino.scm.service.PurchasePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pur-plan")
public class PurchasePlanController {
    @Autowired
    private PurchasePlanService purchasePlanService;

    Map<String, Object> data = new HashMap<>();

    @GetMapping("find-all/{pageNum}/{pageSize}")
    public Result<Map<String, Object>> findAll(@PathVariable Integer pageNum, @PathVariable Integer pageSize) {
        data.put("data", purchasePlanService.findAll(pageNum, pageSize));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/update")
    public Result<Map<String, Object>> updatePlan(@RequestBody PurchasePlan purchasePlan) {
        data.put("data", purchasePlanService.updatePlan(purchasePlan));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/search")
    public Result<Map<String, Object>> search(@RequestBody PurchasePlan purchasePlan) {
        data.put("data", purchasePlanService.search(purchasePlan));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> addPlan(@RequestBody PurchasePlan purchasePlan) {
        data.put("data", purchasePlanService.addPlan(purchasePlan));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/delete")
    public Result<Map<String, Object>> deletePlan(Integer id) {
        data.put("data", purchasePlanService.deletePlan(id));
        return new Result<>(200, data, "成功");
    }
}
