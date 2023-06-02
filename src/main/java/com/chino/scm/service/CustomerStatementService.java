package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.CustomerStatement;
import com.chino.scm.pojo.SupplierStatement;

import java.util.List;

public interface CustomerStatementService extends IService<CustomerStatement> {
    CustomerStatement findAll();
    List<CustomerStatement> findByYearOrCustomer(Integer year, String customerName);

    List<CustomerStatement> orderByQuarter();

    List<CustomerStatement> orderByMonth();
}
