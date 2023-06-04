package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseRequestDetail;

import java.util.List;
import java.util.Map;

public interface PurchaseRequestDetailService extends IService<PurchaseRequestDetail> {

    List<PurchaseRequestDetail> findAll();

    List<PurchaseRequestDetail> findByRequestId(Integer rid);

    Integer updatePurchaseRequestDetail(PurchaseRequestDetail purchaseRequestDetail);

    Integer deletePurchaseRequestDetail(Integer id);

    List<PurchaseRequestDetail> findByConditions(Map<String,Object> data);
}
