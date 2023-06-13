package com.chino.scm.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class PurchaseContract {
    private Integer id; // 采购合同编号
    private String contractCode; // 合同编号
    private Integer applicationId; // 申请编号
    private String supplier; // 供应商
    private String contactPerson; // 联系人
    private Float contractAmount; // 合同金额
    private String deliveryMethod; // 送货方式
    private LocalDate signDate; // 签约日期
    private String applicant; // 申请人
    private LocalDate applicationTime; // 申请时间
    private String applicationStatus; // 申请状态
    private String reviewer; // 审核人
    private LocalDate reviewTime; // 审核时间
    private String reviewStatus; // 审核状态
    private String reviewComment; // 审核意见
    private String remark; // 备注
    private String contactWay; //联系电话
    @TableField(exist = false)
    private LocalDate startSignDate;
    @TableField(exist = false)
    private LocalDate endSignDate;
    @TableField(exist = false)
    private LocalDate startACDate;
    @TableField(exist = false)
    private LocalDate endACDate;
    @TableField(exist = false)
    private LocalDate startReviewTime;
    @TableField(exist = false)
    private LocalDate endReviewTime;
}
