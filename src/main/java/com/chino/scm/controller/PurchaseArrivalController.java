package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.PurchaseArrival;
import com.chino.scm.service.PurchaseArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pur-arr")
public class PurchaseArrivalController {
    @Autowired
    private PurchaseArrivalService purchaseArrivalService;
    Map<String, Object> data = new HashMap<>();

    @GetMapping("/find-all")
    public Result<Map<String, Object>> findAll() {
        data.put("data", purchaseArrivalService.findAll());
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/update")
    public Result<Map<String, Object>> updateArrival(@RequestBody PurchaseArrival purchaseArrival) {
        data.put("data", purchaseArrivalService.updateArrival(purchaseArrival));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> addArrival(@RequestBody PurchaseArrival purchaseArrival) {
        data.put("data", purchaseArrivalService.addArrival(purchaseArrival));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/delete")
    public Result<Map<String, Object>> deleteArrival(Integer id) {
        data.put("data", purchaseArrivalService.deleteArrival(id));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/search")
    public Result<Map<String, Object>> search(@RequestBody PurchaseArrival purchaseArrival){
        data.put("data", purchaseArrivalService.search(purchaseArrival));
        return new Result<>(200, data, "成功");
    }
}
