package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.ArrivalDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ArrivalDetailMapper extends BaseMapper<ArrivalDetail> {

    @Select("select * from arrival_detail where id = #{id}")
    List<ArrivalDetail> findById(Integer id);

    @Delete("delete from arrival_detail where id = #{id}")
    Integer deleteById(Integer id);
}
