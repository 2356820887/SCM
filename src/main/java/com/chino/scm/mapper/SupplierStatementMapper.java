package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.SupplierStatement;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SupplierStatementMapper extends BaseMapper<SupplierStatement> {
    @Select("select * from supplier_statement")
    SupplierStatement selectAll();
}