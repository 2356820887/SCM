package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.PurchaseRequest;
import com.chino.scm.service.PurchaseRequestDetailService;
import com.chino.scm.service.PurchaseRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
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

    @PostMapping("/update")
    public Result<Map<String, Object>> updateOne(@RequestBody PurchaseRequest purchaseRequest) {
        data.put("data", purchaseRequestService.updateOne(purchaseRequest));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/delete")
    public Result<Map<String, Object>> deleteOne(Integer id) {
        data.put("data", purchaseRequestService.deleteOne(id));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/search")
    public Result<Map<String, Object>> search(@RequestBody PurchaseRequest purchaseRequest) {
        data.put("data", purchaseRequestService.search(purchaseRequest));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> addPurchaseRequest(@RequestBody PurchaseRequest purchaseRequest) {
        data.put("data", purchaseRequestService.addPurchaseRequest(purchaseRequest));
        return new Result<>(200, data, "成功");
    }

}
