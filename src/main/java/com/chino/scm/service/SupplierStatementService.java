package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.SupplierStatement;

import java.util.List;

public interface SupplierStatementService extends IService<SupplierStatement> {
    SupplierStatement findAll();

    List<SupplierStatement> findByYearOrSupplier(Integer year, String supplierName);

    List<SupplierStatement> orderByQuarter();

    List<SupplierStatement> orderByMonth();
}
