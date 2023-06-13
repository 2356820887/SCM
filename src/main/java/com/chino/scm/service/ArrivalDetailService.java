package com.chino.scm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chino.scm.pojo.ArrivalDetail;

import java.util.List;

public interface ArrivalDetailService extends IService<ArrivalDetail> {

    List<ArrivalDetail> findById(Integer id);

    Integer deleteById(Integer id);
}
