package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.CustomerStatement;

public interface CustomerStatementService extends IService<CustomerStatement> {
    CustomerStatement findAll();
    CustomerStatement findByYear(int year);
    CustomerStatement findByQuarter(int quarter);
    CustomerStatement findByMonth(int month);
}
