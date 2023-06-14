package com.chino.scm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchasePlan;

import java.util.List;

public interface PurchasePlanService extends IService<PurchasePlan> {

    IPage<PurchasePlan> findAll(Integer pageNum, Integer pageSize);

    Integer updatePlan(PurchasePlan purchasePlan);

    Integer addPlan(PurchasePlan purchasePlan);

    List<PurchasePlan> search(PurchasePlan purchasePlan);

    Integer deletePlan(Integer id);
}
