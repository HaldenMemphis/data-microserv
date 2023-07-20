package com.msc.datamicroserv.service;

import com.msc.datamicroserv.dao.entity.BloodSugarMonitorData;
import com.msc.datamicroserv.utils.RespVO;
import com.msc.datamicroserv.utils.ResponseMsg;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: data-microserv
 * @description:
 * @author: yfliu
 * @create: 2023-07-18 14:22
 **/
public interface DataDisplayService {

    RespVO<BloodSugarMonitorData> getSingleBloodSugarData(String uuid);

    RespVO<List<BloodSugarMonitorData>> getBatchBloodSugarDataByTime(String mac, long startTime, long endTime);


}
