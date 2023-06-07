package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.PurchaseReport;
import com.chino.scm.service.PurchaseReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/pur-rep")
public class PurchaseReportController {
    @Autowired
    private PurchaseReportService purchaseReportService;

    Map<String, Object> data = new HashMap<>();

    @GetMapping("find-all")
    public Result<Map<String, Object>> findAll() {
        data.put("data", purchaseReportService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("find-quarter")
    public Result<Map<String, Object>> findByQuarter(Integer quarter) {
        data.put("data", purchaseReportService.findByQuarter(quarter));
        return new Result<>(200, data, "成功");
    }

    @GetMapping("find-month")
    public Result<Map<String, Object>> findByMonth(Integer month) {
        data.put("data", purchaseReportService.findByMonth(month));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/search")
    public Result<Map<String, Object>> search(@RequestBody PurchaseReport purchaseReport) {
        data.put("data", purchaseReportService.search(purchaseReport));
        return new Result<>(200, data, "成功");
    }
}
