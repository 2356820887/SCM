package com.chino.scm.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class PurchaseRequestDetail {
    private Integer id; // 采购申请详细信息编号
    private Integer purchaseRequestId; // 采购申请编号
    private String material; // 物料名称
    private String model; // 物料型号
    private String specification; // 物料规格
    private String unit; // 物料单位
    private Double price; // 物料单价
    private Integer purchaseQuantity; // 采购数量
    private Integer demandQuantity; // 需求数量
    private Date demandDate; // 需求日期
    private String remark; // 备注
}
