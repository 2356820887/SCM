package com.chino.scm.pojo;

import lombok.Data;

@Data
public class Supplier {
    private Integer id;
    private String name;
    private String abbreviation;
    private String address;
    private String phone;
    private String contactName;
    private String contactPhone;
    private String bankName;
    private String bankAccount;
    private Integer taxId;
    private String category;
    private String level;
    private String applicationStatus;
    private String status;
}
