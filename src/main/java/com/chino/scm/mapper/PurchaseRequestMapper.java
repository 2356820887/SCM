package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.PurchaseRequest;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PurchaseRequestMapper extends BaseMapper<PurchaseRequest> {

    @Select("select * from purchase_request")
    List<PurchaseRequest> selectAll();

    @Update("UPDATE `purchase_request` SET `remark` = #{remark} WHERE `id` = #{id}")
    int updateOne(PurchaseRequest purchaseRequest);

    @Delete("DELETE FROM `scm`.`purchase_request` WHERE `id` = #{id}")
    int deleteOne(Integer id);

    Integer insertPurchaseRequest(PurchaseRequest purchaseRequest);
}
