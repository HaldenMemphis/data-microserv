package com.msc.datamicroserv.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @program: data-microserv
 * @description: Clickhouse Entity
 * @author: yfliu
 * @create: 2023-07-14 16:39
 **/

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BloodSugarMonitorData {
    private String uuid;

    private String mac;

    private String sourceIP;

    private Date timestamp;

    private Float bloodSugar;

    public BloodSugarMonitorData(String uuid, String mac, String sourceIP, Float bloodSugar, Date timestamp) {
        this.uuid = uuid;
        this.mac = mac;
        this.sourceIP = sourceIP;
        this.timestamp = timestamp;
        this.bloodSugar = bloodSugar;
    }

}
