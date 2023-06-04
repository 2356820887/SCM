package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.MaterialMapper;
import com.chino.scm.pojo.Material;
import com.chino.scm.service.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MaterialServiceImpl extends ServiceImpl<MaterialMapper, Material> implements MaterialService {
    @Autowired
    private MaterialMapper materialMapper;
    @Override
    public List<Material> findAll() {
        return materialMapper.selectAll();
    }

    @Override
    public List<Material> findByType(Integer type) {
        return materialMapper.selectByType(type);
    }
}
