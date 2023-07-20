package com.msc.datamicroserv.service.impl;

import com.msc.datamicroserv.dao.entity.BloodSugarMonitorData;
import com.msc.datamicroserv.dao.mapper.BloodSugarMonitorMapper;
import com.msc.datamicroserv.service.DataDisplayService;
import com.msc.datamicroserv.utils.MessageConfig;
import com.msc.datamicroserv.utils.RespVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @program: data-microserv
 * @description:
 * @author: yfliu
 * @create: 2023-07-18 14:22
 **/
@Service
public class DataDisplayServiceImpl implements DataDisplayService {

    @Autowired
    private BloodSugarMonitorMapper bloodSugarMonitorMapper;

    @Resource
    private MessageConfig messageConfig;


    @Override
    public RespVO<BloodSugarMonitorData> getSingleBloodSugarData(String uuid) {
        return RespVO.createSuccessResponse();
    }

    @Override
    public RespVO<List<BloodSugarMonitorData>> getBatchBloodSugarDataByTime(String mac, long startTime, long endTime) {
        try {
            List<BloodSugarMonitorData> results = bloodSugarMonitorMapper.QueryBatchBloodSugarDataByTime(mac, 0, 0);
            if(results == null || results.size() == 0) {
                return new RespVO(100, "The query object does not exist", null);
            }
            return RespVO.createSuccessResponse(results);

        }catch (Exception e) {
            return new RespVO(500, "error", e.getMessage());
        }
    }


}