package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.SupplierStatementMapper;
import com.chino.scm.pojo.SupplierStatement;
import com.chino.scm.service.SupplierStatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SupplierStatementServiceImpl extends ServiceImpl<SupplierStatementMapper, SupplierStatement> implements SupplierStatementService {
    @Autowired
    private SupplierStatementMapper supplierStatementMapper;

    @Override
    public SupplierStatement findAll() {
        return null;
    }
}
