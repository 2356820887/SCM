package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.SupplierStatement;

public interface SupplierStatementService extends IService<SupplierStatement> {

    SupplierStatement findAll();

}
