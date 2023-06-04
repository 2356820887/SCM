package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseRequest;

import java.util.Date;
import java.util.List;

public interface PurchaseRequestService extends IService<PurchaseRequest> {

    List<PurchaseRequest> findAll();

    Integer updateOne(PurchaseRequest purchaseRequest);

    Integer deleteOne(Integer id);

    List<PurchaseRequest> search(PurchaseRequest purchaseRequest);

    Integer addPurchaseRequest(PurchaseRequest purchaseRequest);

}
