package com.chino.scm.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;
@Data
public class PurchaseRequest {
    private Integer id;
    private Integer requestNumber;
    private String requestType;
    private String planNumber;
    private String replenishmentNumber;
    private String requester;
    private Date requestDate;
    private String requestStatus;
    private String reviewer;
    private Date reviewDate;
    private String reviewStatus;
    private String reviewComment;
    private String remark;
    @TableField(exist = false)
    private Date startReqDate;
    @TableField(exist = false)
    private Date endReqDate;
    @TableField(exist = false)
    private Date startRevDate;
    @TableField(exist = false)
    private Date endRevDate;
}
