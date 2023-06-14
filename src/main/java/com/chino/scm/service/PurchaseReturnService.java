package com.chino.scm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseReturn;

import java.util.List;

public interface PurchaseReturnService extends IService<PurchaseReturn> {
    IPage<PurchaseReturn> findAll(Integer pageNum, Integer pageSize);

    Integer updatePlan(PurchaseReturn purchaseReturn);

    Integer addPlan(PurchaseReturn purchaseReturn);

    List<PurchaseReturn> search(PurchaseReturn purchaseReturn);

    Integer deleteReturn(Integer id);
}
