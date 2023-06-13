package com.chino.scm.pojo;

import lombok.Data;

@Data
public class ArrivalDetail {
    private Integer id;                 // 到货明细编号
    private Integer purchaseArrivalId;  // 采购到货编号
    private String productionBatchNumber;   // 生产批号
    private Integer arrivalQuantity;    // 到货数量
    private String remark;              // 备注
}
