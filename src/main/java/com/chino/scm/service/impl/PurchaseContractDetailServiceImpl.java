package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseContractDetailMapper;
import com.chino.scm.pojo.PurchaseContractDetail;
import com.chino.scm.service.PurchaseContractDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PurchaseContractDetailServiceImpl extends ServiceImpl<PurchaseContractDetailMapper, PurchaseContractDetail> implements PurchaseContractDetailService {
    @Autowired
    private PurchaseContractDetailMapper purchaseContractDetailMapper;
    @Override
    public List<PurchaseContractDetail> findAll() {
        return purchaseContractDetailMapper.selectAll();
    }

    @Override
    public Integer deleteDetail(Integer id) {
        return purchaseContractDetailMapper.deleteDetail(id);
    }

    @Override
    public Integer addPlan(PurchaseContractDetail purchaseContractDetail) {
        return purchaseContractDetailMapper.insertDetail(purchaseContractDetail);
    }
}
