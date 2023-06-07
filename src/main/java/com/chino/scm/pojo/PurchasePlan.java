package com.chino.scm.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.time.LocalDate;

@Data
public class PurchasePlan {
    private Integer id;
    private String documentNumber;
    private String applicant;
    private LocalDate applicationDate;
    private String applicationStatus;
    private String approved;
    private LocalDate approvalDate;
    private String approvalStatus;
    private String approvalComment;
    private String remark;
    @TableField(exist = false)
    private LocalDate startACDate;
    @TableField(exist = false)
    private LocalDate endACDate;
    @TableField(exist = false)
    private LocalDate startARDate;
    @TableField(exist = false)
    private LocalDate endARDate;
}
