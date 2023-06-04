package com.chino.scm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chino.scm.mapper.PurchaseRequestMapper;
import com.chino.scm.pojo.PurchaseRequest;
import com.chino.scm.service.PurchaseRequestService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PurchaseRequestServiceImpl extends ServiceImpl<PurchaseRequestMapper, PurchaseRequest> implements PurchaseRequestService {
    @Autowired
    private PurchaseRequestMapper purchaseRequestMapper;

    @Override
    public List<PurchaseRequest> findAll() {
        return purchaseRequestMapper.selectAll();
    }

    @Override
    public Integer updateOne(PurchaseRequest purchaseRequest) {
        return purchaseRequestMapper.updateOne(purchaseRequest);
    }

    @Override
    public Integer deleteOne(Integer id) {
        return purchaseRequestMapper.deleteOne(id);
    }

    public List<PurchaseRequest> search(PurchaseRequest purchaseRequest) {
        LambdaQueryWrapper<PurchaseRequest> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(purchaseRequest.getRequestNumber() != null, PurchaseRequest::getRequestNumber, purchaseRequest.getRequestNumber())
                .eq(StringUtils.isNoneBlank(purchaseRequest.getRequestType()), PurchaseRequest::getRequestType, purchaseRequest.getRequestType())
                .like(StringUtils.isNoneBlank(purchaseRequest.getPlanNumber()), PurchaseRequest::getPlanNumber, purchaseRequest.getPlanNumber())
                .eq(StringUtils.isNoneBlank(purchaseRequest.getRequester()), PurchaseRequest::getRequester, purchaseRequest.getRequester());
        if (purchaseRequest.getStartReqDate() != null && purchaseRequest.getEndReqDate() != null) {
            queryWrapper.between(PurchaseRequest::getRequestDate, purchaseRequest.getStartReqDate(), purchaseRequest.getEndReqDate());
        }
        queryWrapper.eq(StringUtils.isNoneBlank(purchaseRequest.getRequestStatus()), PurchaseRequest::getRequestStatus, purchaseRequest.getRequestStatus())
                .eq(StringUtils.isNoneBlank(purchaseRequest.getReviewer()), PurchaseRequest::getReviewer, purchaseRequest.getReviewer());
        if (purchaseRequest.getStartRevDate() != null && purchaseRequest.getEndRevDate() != null) {
            queryWrapper.between(PurchaseRequest::getReviewDate, purchaseRequest.getStartRevDate(), purchaseRequest.getEndRevDate());
        }
        queryWrapper.eq(StringUtils.isNoneBlank(purchaseRequest.getReviewStatus()), PurchaseRequest::getReviewStatus, purchaseRequest.getReviewStatus());

        return purchaseRequestMapper.selectList(queryWrapper);
    }

    @Override
    public Integer addPurchaseRequest(PurchaseRequest purchaseRequest) {
        return purchaseRequestMapper.insertPurchaseRequest(purchaseRequest);
    }

}
