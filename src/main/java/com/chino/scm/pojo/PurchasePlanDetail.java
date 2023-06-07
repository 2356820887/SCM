package com.chino.scm.pojo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PurchasePlanDetail {
    private Integer id;
    private Integer purchasePlanId;
    private String material;
    private String model;
    private String specification;
    private String unit;
    private Integer purchaseQuantity;
    private Integer demandQuantity;
    private LocalDate demandDate;
    private String remark;
}
