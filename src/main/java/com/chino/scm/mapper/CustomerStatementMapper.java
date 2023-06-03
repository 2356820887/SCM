package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.CustomerStatement;
import com.chino.scm.pojo.SupplierStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerStatementMapper extends BaseMapper<CustomerStatement> {
    @Select("select * from customer_statement")
    List<CustomerStatement> selectAll();

    List<CustomerStatement> selectByYearOrCustomer(Integer year, String customerName);

    @Select("select * from customer_statement order by `quarter`")
    List<CustomerStatement> orderByQuarter();

    @Select("select * from customer_statement order by `month`")
    List<CustomerStatement> orderByMonth();
}