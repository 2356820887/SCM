package com.chino.scm.pojo;

import lombok.Data;

@Data
public class SupplierStatement {
    private Integer id; // 对账编号

    private String year; // 年份

    private String quarter; // 季度

    private String month; // 月份

    private String supplierName; // 供应商名称

    private Float payableAmount; // 应付金额

}