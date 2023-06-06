package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.PurchaseArrival;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PurchaseArrivalMapper extends BaseMapper<PurchaseArrival> {

    @Select("select * from purchase_arrival")
    List<PurchaseArrival> selectAll();

    Integer updateArrival(PurchaseArrival purchaseArrival);

    Integer insertArrival(PurchaseArrival purchaseArrival);

    @Delete("DELETE FROM `scm`.`purchase_arrival` WHERE `id` = #{id}")
    Integer deleteArrival(Integer id);
}
