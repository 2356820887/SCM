package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseRequestDetailMapper;
import com.chino.scm.pojo.PurchaseRequestDetail;
import com.chino.scm.service.PurchaseRequestDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseRequestDetailServiceImpl extends ServiceImpl<PurchaseRequestDetailMapper, PurchaseRequestDetail> implements PurchaseRequestDetailService {
    @Autowired
    private PurchaseRequestDetailMapper purchaseRequestDetailMapper;
    @Override
    public List<PurchaseRequestDetail> findAll() {
        return purchaseRequestDetailMapper.selectAll();
    }

    @Override
    public List<PurchaseRequestDetail> findByRequestId(Integer rid) {
        return purchaseRequestDetailMapper.selectByRequestId(rid);
    }
}
