package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseRequest;

import java.util.List;

public interface PurchaseRequestService extends IService<PurchaseRequest> {

    List<PurchaseRequest> findAll();

    int updateOne(PurchaseRequest purchaseRequest);

}
