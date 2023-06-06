package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.Material;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MaterialMapper extends BaseMapper<Material> {

    @Select("select * from material_info")
    List<Material> selectAll();

    List<Material> selectByType(Integer type);

}
