package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchasePlanDetail;
import com.chino.scm.pojo.PurchaseReturnDetail;

import java.util.List;

public interface PurchaseReturnDetailService extends IService<PurchaseReturnDetail> {
    List<PurchaseReturnDetail> findAll();

    Integer deleteDetail(Integer id);

    Integer addPlan(PurchaseReturnDetail purchaseReturnDetail);
}
