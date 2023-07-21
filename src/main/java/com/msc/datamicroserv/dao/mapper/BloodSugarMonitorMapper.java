package com.msc.datamicroserv.dao.mapper;

import com.msc.datamicroserv.api.request.DisplayDataReq;
import com.msc.datamicroserv.dao.entity.BloodSugarMonitorData;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: data-microserv
 * @description:
 * @author: yfliu
 * @create: 2023-07-18 14:44
 **/
@Mapper
public interface BloodSugarMonitorMapper {

    List<BloodSugarMonitorData> QueryBatchBloodSugarDataByTime(DisplayDataReq request);


}
