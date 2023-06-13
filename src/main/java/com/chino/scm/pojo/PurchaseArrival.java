package com.chino.scm.pojo;

import lombok.Data;

import java.time.LocalDate;
@Data
public class PurchaseArrival {
    private Integer id;
    private String arrivalNumber;
    private String contractNumber;
    private String supplierName;
    private String contactPerson;
    private String contactPhone;
    private LocalDate arrivalDate;
    private String status;
    private String remark;
    private String batchNumber;
}
