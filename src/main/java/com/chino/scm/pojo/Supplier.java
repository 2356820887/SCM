package com.chino.scm.pojo;

import lombok.Data;

@Data
public class Supplier {
    private Integer id;
    private String name;
    private String abbreviation;
    private String address;
    private String phone;
    private String contact_name;
    private String contact_phone;
    private String bank_name;
    private String bank_account;
    private Integer tax_id;
    private String category;
    private String level;
    private String application_status;
    private String status;
}
