package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.PurchasePlanDetail;
import com.chino.scm.pojo.PurchaseReturnDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PurchaseReturnDetailMapper extends BaseMapper<PurchaseReturnDetail> {
    @Select("select * from purchase_return_detail")
    List<PurchaseReturnDetail> selectAll();

    @Delete("DELETE FROM purchase_return_detail WHERE `id` = #{id}")
    Integer deleteDetail(Integer id);

    Integer addPurchaseReturnDetail(PurchaseReturnDetail purchaseReturnDetail);
}
