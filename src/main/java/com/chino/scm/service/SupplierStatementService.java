package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.SupplierStatement;

public interface SupplierStatementService extends IService<SupplierStatement> {
    SupplierStatement findAll();
    SupplierStatement findByYear(int year);
    SupplierStatement findByQuarter(int quarter);
    SupplierStatement findByMonth(int month);
}
