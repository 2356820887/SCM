package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.CustomerStatement;
import com.chino.scm.pojo.SupplierStatement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CustomerStatementMapper extends BaseMapper<CustomerStatement> {
    @Select("select * from customer_statement")
    CustomerStatement selectAll();
    @Select("select * from customer_statement where year = #{year}")
    CustomerStatement selectByYear(int year);
    @Select("select * from customer_statement where quarter = #{quarter}")
    CustomerStatement selectByQuarter(int year);
    @Select("select * from customer_statement where month = #{month}")
    CustomerStatement selectByMonth(int month);
}