package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseReturnDetailMapper;
import com.chino.scm.pojo.PurchasePlanDetail;
import com.chino.scm.pojo.PurchaseReturnDetail;
import com.chino.scm.service.PurchaseReturnDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseReturnDetailServiceImpl extends ServiceImpl<PurchaseReturnDetailMapper, PurchaseReturnDetail> implements PurchaseReturnDetailService {
    @Autowired
    private PurchaseReturnDetailMapper purchaseReturnDetailMapper;

    @Override
    public List<PurchaseReturnDetail> findAll() {
        return purchaseReturnDetailMapper.selectAll();
    }

    @Override
    public Integer deleteDetail(Integer id) {
        return purchaseReturnDetailMapper.deleteDetail(id);
    }

    @Override
    public Integer addPlan(PurchaseReturnDetail purchaseReturnDetail) {
        return purchaseReturnDetailMapper.addPurchaseReturnDetail(purchaseReturnDetail);
    }
}
