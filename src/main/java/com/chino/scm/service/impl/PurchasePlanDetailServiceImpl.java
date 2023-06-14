package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchasePlanDetailMapper;
import com.chino.scm.mapper.PurchasePlanMapper;
import com.chino.scm.pojo.PurchasePlanDetail;
import com.chino.scm.service.PurchasePlanDetailService;
import com.chino.scm.service.PurchasePlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchasePlanDetailServiceImpl extends ServiceImpl<PurchasePlanDetailMapper, PurchasePlanDetail> implements PurchasePlanDetailService {
    @Autowired
    private PurchasePlanDetailMapper purchasePlanDetailMapper;

    @Override
    public List<PurchasePlanDetail> findAll() {
        return purchasePlanDetailMapper.selectAll();
    }

    @Override
    public List<PurchasePlanDetail> findById(Integer id) {
        return purchasePlanDetailMapper.findById(id);
    }

    @Override
    public Integer deletePlan(Integer id) {
        return purchasePlanDetailMapper.deletePlan(id);
    }

    @Override
    public Integer addPlan(PurchasePlanDetail purchasePlanDetail) {
        return purchasePlanDetailMapper.insertDetail(purchasePlanDetail);
    }
}
