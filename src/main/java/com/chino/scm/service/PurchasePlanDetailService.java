package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchasePlanDetail;

import java.util.List;

public interface PurchasePlanDetailService extends IService<PurchasePlanDetail> {

    List<PurchasePlanDetail> findAll();

    List<PurchasePlanDetail> findById(Integer id);

    Integer deletePlan(Integer id);

    Integer addPlan(PurchasePlanDetail purchasePlanDetail);
}
