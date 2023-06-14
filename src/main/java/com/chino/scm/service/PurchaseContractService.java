package com.chino.scm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseContract;

import java.util.List;

public interface PurchaseContractService extends IService<PurchaseContract> {
    IPage<PurchaseContract> findAll(Integer pageNum, Integer pageSize);

    Integer updatePlan(PurchaseContract purchaseContract);

    Integer addPlan(PurchaseContract purchaseContract);

    List<PurchaseContract> search(PurchaseContract purchaseContract);

    Integer deletePlan(Integer id);

}
