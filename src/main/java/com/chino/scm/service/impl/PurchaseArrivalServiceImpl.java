package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseArrivalMapper;
import com.chino.scm.pojo.PurchaseArrival;
import com.chino.scm.pojo.PurchaseRequest;
import com.chino.scm.service.PurchaseArrivalService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseArrivalServiceImpl extends ServiceImpl<PurchaseArrivalMapper, PurchaseArrival> implements PurchaseArrivalService {
    @Autowired
    private PurchaseArrivalMapper purchaseArrivalMapper;

    @Override
    public IPage<PurchaseArrival> findAll(Integer pageNum, Integer pageSize) {
        IPage<PurchaseArrival> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<PurchaseArrival> queryWrapper = new LambdaQueryWrapper<>();
        purchaseArrivalMapper.selectPage(page, queryWrapper);
        return page;
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

    public List<PurchaseArrival> search(PurchaseArrival purchaseArrival) {
        LambdaQueryWrapper<PurchaseArrival> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNoneBlank(purchaseArrival.getArrivalNumber()), PurchaseArrival::getArrivalNumber, purchaseArrival.getArrivalNumber());
        queryWrapper.like(StringUtils.isNoneBlank(purchaseArrival.getContractNumber()), PurchaseArrival::getContractNumber, purchaseArrival.getContractNumber());
        queryWrapper.like(purchaseArrival.getArrivalDate() != null, PurchaseArrival::getArrivalDate, purchaseArrival.getArrivalDate());
        queryWrapper.like(StringUtils.isNoneBlank(purchaseArrival.getSupplierName()), PurchaseArrival::getSupplierName, purchaseArrival.getSupplierName());
        queryWrapper.eq(StringUtils.isNoneBlank(purchaseArrival.getStatus()), PurchaseArrival::getStatus, purchaseArrival.getStatus());
        return purchaseArrivalMapper.selectList(queryWrapper);
    }
}
