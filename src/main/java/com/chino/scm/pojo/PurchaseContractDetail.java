package com.chino.scm.pojo;

import lombok.Data;

import java.time.LocalDate;

@Data
public class PurchaseContractDetail {
    private Integer id;
    private Integer contractId;
    private String material;
    private String model;
    private String specification;
    private String unit;
    private Float unitPrice;
    private Integer purchaseQuantity;
    private Float amount;
    private LocalDate demandDate;
    private String remark;
}
