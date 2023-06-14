package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseContractMapper;
import com.chino.scm.pojo.PurchaseArrival;
import com.chino.scm.pojo.PurchaseContract;
import com.chino.scm.pojo.PurchasePlan;
import com.chino.scm.service.PurchaseContractService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseContractServiceImpl extends ServiceImpl<PurchaseContractMapper, PurchaseContract> implements PurchaseContractService {
    @Autowired
    private PurchaseContractMapper purchaseContractMapper;


    @Override
    public IPage<PurchaseContract> findAll(Integer pageNum, Integer pageSize) {
        IPage<PurchaseContract> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<PurchaseContract> queryWrapper = new LambdaQueryWrapper<>();
        purchaseContractMapper.selectPage(page, queryWrapper);
        return page;
    }

    @Override
    public Integer updatePlan(PurchaseContract purchaseContract) {
        return purchaseContractMapper.updatePurchaseContract(purchaseContract);
    }

    @Override
    public Integer addPlan(PurchaseContract purchaseContract) {
        return purchaseContractMapper.insertPurchaseContract(purchaseContract);
    }

    @Override
    public List<PurchaseContract> search(PurchaseContract purchaseContract) {
        LambdaQueryWrapper<PurchaseContract> queryWrapper = new LambdaQueryWrapper<>();

        // 根据合同编号模糊查询
        queryWrapper.like(StringUtils.isNotBlank(purchaseContract.getContractCode()), PurchaseContract::getContractCode, purchaseContract.getContractCode());
        // 根据申请编号查询
        queryWrapper.eq(purchaseContract.getApplicationId() != null, PurchaseContract::getApplicationId, purchaseContract.getApplicationId());
        // 根据供应商模糊查询
        queryWrapper.like(StringUtils.isNotBlank(purchaseContract.getSupplier()), PurchaseContract::getSupplier, purchaseContract.getSupplier());
        // 根据签约日期区间查询
        if (purchaseContract.getStartSignDate() != null && purchaseContract.getEndSignDate() != null) {
            queryWrapper.between(PurchaseContract::getSignDate, purchaseContract.getStartSignDate(), purchaseContract.getEndSignDate());
        }
        // 根据申请人模糊查询
        queryWrapper.like(StringUtils.isNotBlank(purchaseContract.getApplicant()), PurchaseContract::getApplicant, purchaseContract.getApplicant());
        // 根据申请日期查询
        if (purchaseContract.getStartACDate() != null && purchaseContract.getEndACDate() != null) {
            queryWrapper.between(PurchaseContract::getApplicationTime, purchaseContract.getStartACDate(), purchaseContract.getEndACDate());
        }
        // 根据申请状态查询
        queryWrapper.eq(StringUtils.isNotBlank(purchaseContract.getApplicationStatus()), PurchaseContract::getApplicationStatus, purchaseContract.getApplicationStatus());
        // 根据审核人模糊查询
        queryWrapper.like(StringUtils.isNotBlank(purchaseContract.getReviewer()), PurchaseContract::getReviewer, purchaseContract.getReviewer());
        // 根据审核时间区间查询
        if (purchaseContract.getStartReviewTime() != null && purchaseContract.getEndReviewTime() != null) {
            queryWrapper.between(PurchaseContract::getReviewTime, purchaseContract.getStartReviewTime(), purchaseContract.getEndReviewTime());
        }
        // 根据审核状态查询
        queryWrapper.eq(StringUtils.isNotBlank(purchaseContract.getReviewStatus()), PurchaseContract::getReviewStatus, purchaseContract.getReviewStatus());

        return purchaseContractMapper.selectList(queryWrapper);
    }

    @Override
    public Integer deletePlan(Integer id) {
        return purchaseContractMapper.deleteContract(id);
    }
}
