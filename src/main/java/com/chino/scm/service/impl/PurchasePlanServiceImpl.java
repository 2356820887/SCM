package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchasePlanMapper;
import com.chino.scm.pojo.PurchaseArrival;
import com.chino.scm.pojo.PurchasePlan;
import com.chino.scm.pojo.PurchaseRequest;
import com.chino.scm.service.PurchasePlanService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PurchasePlanServiceImpl extends ServiceImpl<PurchasePlanMapper, PurchasePlan> implements PurchasePlanService {
    @Autowired
    private PurchasePlanMapper purchasePlanMapper;

    @Override
    public List<PurchasePlan> findAll() {
        return purchasePlanMapper.selectAll();
    }

    @Override
    public Integer updatePlan(PurchasePlan purchasePlan) {
        return purchasePlanMapper.updatePlan(purchasePlan);
    }

    @Override
    public Integer addPlan(PurchasePlan purchasePlan) {
        return purchasePlanMapper.insertPlan(purchasePlan);
    }

    public List<PurchasePlan> search(PurchasePlan purchasePlan) {
        LambdaQueryWrapper<PurchasePlan> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNoneBlank(purchasePlan.getDocumentNumber()), PurchasePlan::getDocumentNumber, purchasePlan.getDocumentNumber())
                .eq(StringUtils.isNoneBlank(purchasePlan.getApplicant()), PurchasePlan::getApplicant, purchasePlan.getApplicant())
                .eq(StringUtils.isNoneBlank(purchasePlan.getApplicationStatus()), PurchasePlan::getApplicationStatus, purchasePlan.getApplicationStatus())
                .eq(StringUtils.isNoneBlank(purchasePlan.getApproved()), PurchasePlan::getApproved, purchasePlan.getApproved())
                .eq(StringUtils.isNoneBlank(purchasePlan.getApprovalStatus()), PurchasePlan::getApprovalStatus, purchasePlan.getApprovalStatus());

        if (purchasePlan.getStartACDate() != null && purchasePlan.getEndACDate() != null) {
            queryWrapper.between(PurchasePlan::getApplicationDate, purchasePlan.getStartACDate(), purchasePlan.getEndACDate());
        }

        LocalDate startARDate = purchasePlan.getStartARDate();
        LocalDate endARDate = purchasePlan.getEndARDate();
        if (startARDate != null && endARDate != null) {
            queryWrapper.between(PurchasePlan::getApprovalDate, startARDate, endARDate);
        }

        return purchasePlanMapper.selectList(queryWrapper);
    }

    @Override
    public Integer deletePlan(Integer id) {
        return purchasePlanMapper.deletePlan(id);
    }

}
