package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseReturnMapper;
import com.chino.scm.pojo.PurchasePlan;
import com.chino.scm.pojo.PurchaseRequest;
import com.chino.scm.pojo.PurchaseReturn;
import com.chino.scm.service.PurchaseReturnService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseReturnServiceImpl extends ServiceImpl<PurchaseReturnMapper, PurchaseReturn> implements PurchaseReturnService {
    @Autowired
    private PurchaseReturnMapper purchaseReturnMapper;

    @Override
    public IPage<PurchaseReturn> findAll(Integer pageNum, Integer pageSize) {
        IPage<PurchaseReturn> page = new Page<>(pageNum, pageSize);
        LambdaQueryWrapper<PurchaseReturn> queryWrapper = new LambdaQueryWrapper<>();
        purchaseReturnMapper.selectPage(page, queryWrapper);
        return page;
    }

    @Override
    public Integer updatePlan(PurchaseReturn purchaseReturn) {
        return purchaseReturnMapper.updatePurchaseReturn(purchaseReturn);
    }

    @Override
    public Integer addPlan(PurchaseReturn purchaseReturn) {
        return purchaseReturnMapper.addPurchaseReturn(purchaseReturn);
    }

    @Override
    public List<PurchaseReturn> search(PurchaseReturn purchaseReturn) {
        // 使用LambdaQueryWrapper构建查询条件
        LambdaQueryWrapper<PurchaseReturn> queryWrapper = new LambdaQueryWrapper<>();
        // 如果退货单号不为空，则添加等于查询条件
        queryWrapper.eq(StringUtils.isNotBlank(purchaseReturn.getReturnCode()), PurchaseReturn::getReturnCode, purchaseReturn.getReturnCode())
                // 如果到货编号不为空，则添加等于查询条件
                .eq(purchaseReturn.getArrivalId() != null, PurchaseReturn::getArrivalId, purchaseReturn.getArrivalId())
                // 如果采购合同编号不为空，则添加等于查询条件
                .eq(purchaseReturn.getContractId() != null, PurchaseReturn::getContractId, purchaseReturn.getContractId())
                // 如果退货日期不为空，则添加等于查询条件
                .eq(purchaseReturn.getReturnDate() != null, PurchaseReturn::getReturnDate, purchaseReturn.getReturnDate());

        // 查询符合条件的采购退货记录
        return purchaseReturnMapper.selectList(queryWrapper);
    }

    @Override
    public Integer deleteReturn(Integer id) {
        return purchaseReturnMapper.deleteReturn(id);
    }
}
