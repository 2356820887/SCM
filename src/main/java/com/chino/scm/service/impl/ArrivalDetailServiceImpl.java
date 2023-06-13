package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.ArrivalDetailMapper;
import com.chino.scm.pojo.ArrivalDetail;
import com.chino.scm.service.ArrivalDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArrivalDetailServiceImpl extends ServiceImpl<ArrivalDetailMapper, ArrivalDetail> implements ArrivalDetailService {
    @Autowired
    private ArrivalDetailMapper arrivalDetailMapper;

    @Override
    public List<ArrivalDetail> findById(Integer id) {
        return arrivalDetailMapper.findById(id);
    }

    @Override
    public Integer deleteById(Integer id) {
        return arrivalDetailMapper.deleteById(id);
    }
}
