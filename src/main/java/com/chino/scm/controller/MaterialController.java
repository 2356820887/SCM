package com.chino.scm.controller;

import com.chino.scm.common.Result;
import com.chino.scm.pojo.Material;
import com.chino.scm.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/material")
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    Map<String, Object> data = new HashMap<>();

    @GetMapping("/find-all")
    public Result<Map<String, Object>> findAll(){
        data.put("data", materialService.findAll());
        return new Result<>(200, data, "成功");
    }

    @GetMapping("/find-type")
    public Result<Map<String, Object>> findByType(Integer type){
        data.put("data", materialService.findByType(type));
        return new Result<>(200, data, "成功");
    }

    @PostMapping("/add")
    public Result<Map<String, Object>> add(Material material){
        data.put("data", materialService.addMaterial(material));
        return new Result<>(200, data, "成功");
    }
}
