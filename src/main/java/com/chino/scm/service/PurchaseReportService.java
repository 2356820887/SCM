package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.PurchaseReport;

import java.util.List;

public interface PurchaseReportService extends IService<PurchaseReport> {

    List<PurchaseReport> findAll();

    List<PurchaseReport> findByQuarter(Integer quarter);

    List<PurchaseReport> findByMonth(Integer month);

    List<PurchaseReport> search(PurchaseReport purchaseReport);
}
