package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseContractDetail;

import java.util.List;

public interface PurchaseContractDetailService extends IService<PurchaseContractDetail> {
    List<PurchaseContractDetail> findAll();

    Integer deleteDetail(Integer id);

    Integer addPlan(PurchaseContractDetail purchaseContractDetail);
}
