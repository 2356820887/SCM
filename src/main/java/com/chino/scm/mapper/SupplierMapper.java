package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.Supplier;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SupplierMapper extends BaseMapper<Supplier> {

    @Select("select * from supplier")
    List<Supplier> selectAll();

    List<Supplier> selectByNameOrContactName(String name, String contactName);

    Integer updateSupplier(Supplier supplier);

    Integer insertSupplier(Supplier supplier);
}
