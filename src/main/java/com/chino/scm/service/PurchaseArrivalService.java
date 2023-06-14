package com.chino.scm.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseArrival;

import java.util.List;

public interface PurchaseArrivalService extends IService<PurchaseArrival> {

    IPage<PurchaseArrival> findAll(Integer pageNum, Integer pageSize);

    Integer updateArrival(PurchaseArrival purchaseArrival);

    Integer addArrival(PurchaseArrival purchaseArrival);

    Integer deleteArrival(Integer id);

    List<PurchaseArrival> search(PurchaseArrival purchaseArrival);
}
