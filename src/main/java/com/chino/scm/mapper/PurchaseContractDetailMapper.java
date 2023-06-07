package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.PurchaseContractDetail;
import com.chino.scm.pojo.PurchasePlanDetail;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PurchaseContractDetailMapper extends BaseMapper<PurchaseContractDetail> {

    @Select("select * from purchase_contract_detail")
    List<PurchaseContractDetail> selectAll();

    @Delete("DELETE FROM purchase_contract_detail WHERE `id` = #{id}")
    Integer deleteDetail(Integer id);

    Integer insertDetail(PurchaseContractDetail purchaseContractDetail);
}
