package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.SupplierStatementMapper;
import com.chino.scm.pojo.SupplierStatement;
import com.chino.scm.service.SupplierStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierStatementServiceImpl extends ServiceImpl<SupplierStatementMapper, SupplierStatement> implements SupplierStatementService {
    @Autowired
    private SupplierStatementMapper supplierStatementMapper;

    @Override
    public List<SupplierStatement> findAll() {
        return supplierStatementMapper.selectAll();
    }

    @Override
    public List<SupplierStatement> findByYearOrSupplier(Integer year, String supplierName) {
        return supplierStatementMapper.selectByYearOrSupplier(year, supplierName);
    }

    @Override
    public List<SupplierStatement> orderByQuarter() {
        return supplierStatementMapper.orderByQuarter();
    }

    @Override
    public List<SupplierStatement> orderByMonth() {
        return supplierStatementMapper.orderByMonth();
    }
}
