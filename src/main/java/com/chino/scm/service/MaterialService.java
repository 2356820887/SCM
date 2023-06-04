package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.Material;

import java.util.List;

public interface MaterialService extends IService<Material> {

    List<Material> findAll();

    List<Material> findByType(Integer type);
}
