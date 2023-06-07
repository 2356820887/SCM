package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.PurchasePlan;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PurchasePlanMapper extends BaseMapper<PurchasePlan> {

    @Select("select * from purchase_plan")
    List<PurchasePlan> selectAll();

    Integer updatePlan(PurchasePlan purchasePlan);

    Integer insertPlan(PurchasePlan purchasePlan);
    @Delete("DELETE FROM `scm`.`purchase_plan` WHERE `id` = #{id}")
    Integer deletePlan(Integer id);
}
