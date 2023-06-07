package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.PurchasePlan;
import com.chino.scm.pojo.PurchasePlanDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PurchasePlanDetailMapper extends BaseMapper<PurchasePlanDetail> {

    @Select("select * from scm.purchase_plan_detail")
    List<PurchasePlanDetail> selectAll();

    @Delete("DELETE FROM `scm`.`purchase_plan_detail` WHERE `id` = #{id}")
    Integer deletePlan(Integer id);

    Integer insertDetail(PurchasePlanDetail purchasePlanDetail);
}
