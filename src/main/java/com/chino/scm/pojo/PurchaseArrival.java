package com.chino.scm.pojo;

import lombok.Data;

import java.util.Date;
@Data
public class PurchaseArrival {
    private Integer id;
    private String arrivalNumber;
    private String contractNumber;
    private String supplierName;
    private String contactPerson;
    private String contactPhone;
    private Date arrivalDate;
    private String status;
    private String remark;
}
