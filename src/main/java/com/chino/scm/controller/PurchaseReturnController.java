package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.PurchaseReturn;
import com.chino.scm.service.PurchaseReturnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pur-re")
public class PurchaseReturnController {
    @Autowired
    private PurchaseReturnService purchaseReturnService;

    Map<String, Object> data = new HashMap<>();

    @GetMapping("find-all")
    public Result<Map<String, Object>> findAll() {
        data.put("data", purchaseReturnService.findAll());
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/update")
    public Result<Map<String, Object>> updatePlan(@RequestBody PurchaseReturn purchaseReturn) {
        data.put("data", purchaseReturnService.updatePlan(purchaseReturn));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/search")
    public Result<Map<String, Object>> search(@RequestBody PurchaseReturn purchaseReturn) {
        data.put("data", purchaseReturnService.search(purchaseReturn));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> addPlan(@RequestBody PurchaseReturn purchaseReturn) {
        data.put("data", purchaseReturnService.addPlan(purchaseReturn));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/delete")
    public Result<Map<String, Object>> deletePlan(Integer id) {
        data.put("data", purchaseReturnService.deleteReturn(id));
        return new Result<>(200, data, "成功");
    }
}
