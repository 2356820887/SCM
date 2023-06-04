package com.chino.scm.pojo;

import lombok.Data;

@Data
public class Material {
    private Integer id;
    private String materialCode;
    private String materialName;
    private String model;
    private String specification;
    private String unit;
    private float unitPrice;
    private String type;
    private String remark;
    private MaterialType materialType;
}
