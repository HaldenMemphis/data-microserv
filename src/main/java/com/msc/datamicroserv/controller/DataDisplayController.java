package com.msc.datamicroserv.controller;

import com.msc.datamicroserv.dao.entity.BloodSugarMonitorData;
import com.msc.datamicroserv.service.DataDisplayService;
import com.msc.datamicroserv.utils.MessageConfig;
import com.msc.datamicroserv.utils.RespVO;
import com.msc.datamicroserv.utils.ResponseMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
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



    @RequestMapping(value = "/getBloodSugarData",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public RespVO<List<BloodSugarMonitorData>> getBloodSugarData(@RequestParam String mac, HttpServletRequest httpRequest) {
        RespVO<List<BloodSugarMonitorData>> result = dataDisplayService.getBatchBloodSugarDataByTime(mac, 0, 0);
        System.out.println(result);
        return result;
    }

    @GetMapping(value = "/123")
    public String getBloodSugarData() {
        System.out.println(1);
        return "okok";
    }


}
