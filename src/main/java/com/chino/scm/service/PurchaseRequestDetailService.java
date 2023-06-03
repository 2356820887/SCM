package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseRequestDetail;

import java.util.List;

public interface PurchaseRequestDetailService extends IService<PurchaseRequestDetail> {

    List<PurchaseRequestDetail> findAll();

    List<PurchaseRequestDetail> findByRequestId(Integer rid);
}
