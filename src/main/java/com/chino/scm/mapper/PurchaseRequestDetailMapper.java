package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.PurchaseRequestDetail;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PurchaseRequestDetailMapper extends BaseMapper<PurchaseRequestDetail> {

    @Select("select * from purchase_request_detail")
    List<PurchaseRequestDetail> selectAll();
}
