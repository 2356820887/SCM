package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseArrival;

import java.util.List;

public interface PurchaseArrivalService extends IService<PurchaseArrival> {

    List<PurchaseArrival> findAll();

    Integer updateArrival(PurchaseArrival purchaseArrival);

    Integer addArrival(PurchaseArrival purchaseArrival);

    Integer deleteArrival(Integer id);
}
