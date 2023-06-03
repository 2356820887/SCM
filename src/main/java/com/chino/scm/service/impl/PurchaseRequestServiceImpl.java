package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseRequestMapper;
import com.chino.scm.pojo.PurchaseRequest;
import com.chino.scm.service.PurchaseRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseRequestServiceImpl extends ServiceImpl<PurchaseRequestMapper, PurchaseRequest> implements PurchaseRequestService {
    @Autowired
    private PurchaseRequestMapper purchaseRequestMapper;

    @Override
    public List<PurchaseRequest> findAll() {
        return purchaseRequestMapper.selectAll();
    }

    @Override
    public int updateOne(PurchaseRequest purchaseRequest) {
        return purchaseRequestMapper.updateOne(purchaseRequest);
    }
}
