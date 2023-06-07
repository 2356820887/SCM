package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseReturn;

import java.util.List;

public interface PurchaseReturnService extends IService<PurchaseReturn> {
    List<PurchaseReturn> findAll();

    Integer updatePlan(PurchaseReturn purchaseReturn);

    Integer addPlan(PurchaseReturn purchaseReturn);

    List<PurchaseReturn> search(PurchaseReturn purchaseReturn);

    Integer deleteReturn(Integer id);
}
