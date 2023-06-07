package com.chino.scm.pojo;

import lombok.Data;

@Data
public class PurchaseReport {
    private Integer id;
    private Integer year;
    private Integer quarter;
    private Integer month;
    private String material;
    private Float purchaseAmount;
    private Float refundAmount;
    private Integer purchaseQuantity;
    private Integer arrivalQuantity;
    private Integer storageQuantity;
    private Integer returnQuantity;
    private String supplierName;
}

