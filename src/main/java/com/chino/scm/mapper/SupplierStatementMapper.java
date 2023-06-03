package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.SupplierStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SupplierStatementMapper extends BaseMapper<SupplierStatement> {
    @Select("select * from supplier_statement")
    List<SupplierStatement> selectAll();

    List<SupplierStatement> selectByYearOrSupplier(Integer year, String supplierName);

    @Select("SELECT * FROM supplier_statement ORDER BY `quarter`")
    List<SupplierStatement> orderByQuarter();

    @Select("SELECT * FROM supplier_statement ORDER BY `month`")
    List<SupplierStatement> orderByMonth();
}