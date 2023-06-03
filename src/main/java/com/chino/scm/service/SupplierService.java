package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.Supplier;

import java.util.List;

public interface SupplierService extends IService<Supplier> {
    List<Supplier> findAll();

    List<Supplier> findByNameOrContactName(String name, String contactName);

    Integer updateSupplier(Supplier supplier);

    Integer addSupplier(Supplier supplier);
}
