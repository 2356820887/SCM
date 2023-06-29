package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.ArrivalDetail;
import com.chino.scm.service.ArrivalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/arr-det")
public class ArrivalDetailController {
    @Autowired
    private ArrivalDetailService arrivalDetailService;

    Map<String, Object> data = new HashMap<>();

    @GetMapping("/find-id")
    public Result<Map<String, Object>> findById(Integer id) {
        data.put("data", arrivalDetailService.findById(id));
        return new Result<>(200, data, "操作成功");
    }

    @GetMapping("/delete-id")
    public Result<Map<String, Object>> deleteById(Integer id) {
        data.put("data", arrivalDetailService.deleteById(id));
        return new Result<>(200, data, "操作成功");
    }

    @PostMapping("/update")
    public Result<Map<String, Object>> updateArrivalDetail(@RequestBody ArrivalDetail arrivalDetail) {
        data.put("data", arrivalDetailService.updateArrivalDetail(arrivalDetail));
        return new Result<>(200, data, "操作成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> addArrivalDetail(@RequestBody ArrivalDetail arrivalDetail) {
        data.put("data", arrivalDetailService.addArrivalDetail(arrivalDetail));
        return new Result<>(200, data, "操作成功");
    }
}
