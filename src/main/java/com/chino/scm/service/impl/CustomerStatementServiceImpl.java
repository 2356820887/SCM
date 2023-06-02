package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.CustomerStatementMapper;
import com.chino.scm.mapper.SupplierStatementMapper;
import com.chino.scm.pojo.CustomerStatement;
import com.chino.scm.pojo.SupplierStatement;
import com.chino.scm.service.CustomerStatementService;
import com.chino.scm.service.SupplierStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerStatementServiceImpl extends ServiceImpl<CustomerStatementMapper, CustomerStatement> implements CustomerStatementService {
    @Autowired
    private CustomerStatementMapper customerStatementMapper;

    @Override
    public CustomerStatement findAll() {
        return customerStatementMapper.selectAll();
    }

    @Override
    public CustomerStatement findByYear(int year) {
        return customerStatementMapper.selectByYear(year);
    }

    @Override
    public CustomerStatement findByQuarter(int quarter) {
        return customerStatementMapper.selectByQuarter(quarter);
    }

    @Override
    public CustomerStatement findByMonth(int month) {
        return customerStatementMapper.selectByMonth(month);
    }
}
