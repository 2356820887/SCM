package com.chino.scm.pojo;

import lombok.Data;

@Data
public class PurchaseReturnDetail {
    private Integer id;
    private Integer returnId;
    private String material;
    private String model;
    private String specification;
    private String unit;
    private Integer returnQuantity;
    private String remark;
}
