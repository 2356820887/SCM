package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.PurchasePlan;
import com.chino.scm.pojo.PurchaseReturn;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PurchaseReturnMapper extends BaseMapper<PurchaseReturn> {
    @Select("select * from purchase_return")
    List<PurchaseReturn> selectAll();

    Integer updatePurchaseReturn(PurchaseReturn purchaseReturn);

    Integer addPurchaseReturn(PurchaseReturn purchaseReturn);
    @Delete("DELETE FROM purchase_return WHERE `id` = #{id}")
    Integer deleteReturn(Integer id);
}
