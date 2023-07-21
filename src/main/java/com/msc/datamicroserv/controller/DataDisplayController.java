package com.msc.datamicroserv.controller;

import com.msc.datamicroserv.api.request.DisplayDataReq;
import com.msc.datamicroserv.dao.entity.BloodSugarMonitorData;
import com.msc.datamicroserv.service.DataDisplayService;
import com.msc.datamicroserv.utils.RespVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @program: data-microserv
 * @description:
 * @author: yfliu
 * @create: 2023-07-14 16:49
 **/
@RestController
@Slf4j
public class DataDisplayController {

    @Autowired
    private DataDisplayService dataDisplayService;


    @RequestMapping(value = "/getBloodSugarData", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public RespVO<List<BloodSugarMonitorData>> getBloodSugarData(@RequestBody DisplayDataReq request, HttpServletRequest httpRequest) {
        if(request == null) return new RespVO(101,"Missing parameters");
        return dataDisplayService.getBatchBloodSugarDataByTime(request);
    }



}
