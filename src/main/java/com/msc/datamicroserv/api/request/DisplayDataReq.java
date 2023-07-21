package com.msc.datamicroserv.api.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Date;
import java.sql.Timestamp;


/**
 * @program: data-microserv
 * @description: RequestBody to request data
 * @author: yfliu
 * @create: 2023-07-20 15:08
 **/
@Data
public class DisplayDataReq {

    private String mac;

    private Timestamp startTime;

    private Timestamp endTime;

}
