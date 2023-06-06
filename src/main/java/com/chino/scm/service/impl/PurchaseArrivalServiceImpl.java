package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseArrivalMapper;
import com.chino.scm.pojo.PurchaseArrival;
import com.chino.scm.service.PurchaseArrivalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PurchaseArrivalServiceImpl extends ServiceImpl<PurchaseArrivalMapper, PurchaseArrival> implements PurchaseArrivalService {
    @Autowired
    private PurchaseArrivalMapper purchaseArrivalMapper;
    @Override
    public List<PurchaseArrival> findAll() {
        return purchaseArrivalMapper.selectAll();
    }

    @Override
    public Integer updateArrival(PurchaseArrival purchaseArrival) {
        return purchaseArrivalMapper.updateArrival(purchaseArrival);
    }

    @Override
    public Integer addArrival(PurchaseArrival purchaseArrival) {
        return purchaseArrivalMapper.insertArrival(purchaseArrival);
    }

    @Override
    public Integer deleteArrival(Integer id) {
        return purchaseArrivalMapper.deleteArrival(id);
    }
}
