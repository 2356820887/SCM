package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseReportMapper;
import com.chino.scm.pojo.PurchaseContract;
import com.chino.scm.pojo.PurchaseReport;
import com.chino.scm.service.PurchaseReportService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseReportServiceImpl extends ServiceImpl<PurchaseReportMapper, PurchaseReport> implements PurchaseReportService {
    @Autowired
    private PurchaseReportMapper purchaseReportMapper;

    @Override
    public List<PurchaseReport> findAll() {
        return purchaseReportMapper.findAll();
    }

    @Override
    public List<PurchaseReport> findByQuarter(Integer quarter) {
        return purchaseReportMapper.findByQuarter(quarter);
    }

    @Override
    public List<PurchaseReport> findByMonth(Integer month) {
        return purchaseReportMapper.findByMonth(month);
    }

    public List<PurchaseReport> search(PurchaseReport purchaseReport) {
        LambdaQueryWrapper<PurchaseReport> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(purchaseReport.getYear() != null, PurchaseReport::getYear, purchaseReport.getYear())
                .eq(StringUtils.isNoneBlank(purchaseReport.getSupplierName()), PurchaseReport::getSupplierName, purchaseReport.getSupplierName())
                .eq(StringUtils.isNoneBlank(purchaseReport.getMaterial()), PurchaseReport::getMaterial, purchaseReport.getMaterial());
        return purchaseReportMapper.selectList(queryWrapper);
    }
}
