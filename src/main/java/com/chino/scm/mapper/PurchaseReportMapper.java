package com.chino.scm.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chino.scm.pojo.PurchaseReport;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface PurchaseReportMapper extends BaseMapper<PurchaseReport> {
    @Select("select * from purchase_report")
    List<PurchaseReport> findAll();

    List<PurchaseReport> findByQuarter(Integer quarter);

    List<PurchaseReport> findByMonth(Integer month);
}
