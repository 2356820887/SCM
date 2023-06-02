package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.SupplierStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SupplierStatementMapper extends BaseMapper<SupplierStatement> {
    @Select("select * from supplier_statement")
    SupplierStatement selectAll();

    @Select("select * from supplier_statement where year = #{year}")
    SupplierStatement selectByYear(int year);
}