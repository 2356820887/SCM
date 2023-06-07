package com.chino.scm.pojo;

import java.util.Date;

import lombok.Data;

@Data
public class PurchaseReturn {
    private Integer id; // 采购退货编号
    private String returnCode; // 退货单号
    private Integer arrivalId; // 到货编号
    private Integer contractId; // 采购合同编号
    private String supplier; // 供应商名称
    private Date returnDate; // 退货日期
    private String creator; // 创建人
    private Date createTime; // 创建时间
    private String remark; // 备注
}
