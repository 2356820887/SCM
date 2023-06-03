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

import java.util.List;

@Service
public class CustomerStatementServiceImpl extends ServiceImpl<CustomerStatementMapper, CustomerStatement> implements CustomerStatementService {
    @Autowired
    private CustomerStatementMapper customerStatementMapper;

    @Override
    public List<CustomerStatement> findAll() {
        return customerStatementMapper.selectAll();
    }

    @Override
    public List<CustomerStatement> findByYearOrCustomer(Integer year, String customerName) {
        return customerStatementMapper.selectByYearOrCustomer(year, customerName);
    }

    @Override
    public List<CustomerStatement> orderByQuarter() {
        return customerStatementMapper.orderByQuarter();
    }

    @Override
    public List<CustomerStatement> orderByMonth() {
        return customerStatementMapper.orderByMonth();
    }
}
