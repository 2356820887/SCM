package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.SupplierMapper;
import com.chino.scm.pojo.Supplier;
import com.chino.scm.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierServiceImpl extends ServiceImpl<SupplierMapper, Supplier> implements SupplierService {

    @Autowired
    private SupplierMapper supplierMapper;

    @Override
    public List<Supplier> findAll() {
        return supplierMapper.selectAll();
    }

    @Override
    public List<Supplier> findByNameOrContactName(String name, String contactName) {
        return supplierMapper.selectByNameOrContactName(name, contactName);
    }

    @Override
    public Integer updateSupplier(Supplier supplier) {
        return supplierMapper.updateSupplier(supplier);
    }

    @Override
    public Integer addSupplier(Supplier supplier) {
        return supplierMapper.insertSupplier(supplier);
    }
}
