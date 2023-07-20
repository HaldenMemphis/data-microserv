package com.msc.datamicroserv.utils;

import lombok.Data;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;


/**
 * @program: data-microserv
 * @description:
 * @author: yfliu
 * @create: 2023-07-18 15:22
 **/
@Data
@Component
public class ClickHouseClient {

    @Value("${clickhouse.driverClassName}")
    private String driverClassName;
    @Value("${clickhouse.url}")
    private String url;
    @Value("${clickhouse.username}")
    private String username;
    @Value("${clickhouse.password}")
    private String password;
    @Value("${clickhouse.initialSize}")
    private Integer initialSize;
    @Value("${clickhouse.minIdle}")
    private Integer minIdle;
    @Value("${clickhouse.maxActive}")
    private Integer maxActive;
    @Value("${clickhouse.maxWait}")
    private Integer maxWait;



}
