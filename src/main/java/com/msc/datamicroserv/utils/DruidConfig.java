package com.msc.datamicroserv.utils;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * @program: data-microserv
 * @description:
 * @author: yfliu
 * @create: 2023-07-18 16:54
 **/
@Configuration
public class DruidConfig {

    @Autowired
    private ClickHouseClient ClickHouseClient;

    @Bean
    public DataSource dataSource() {
        DruidDataSource datasource = new DruidDataSource();
        datasource.setUrl(ClickHouseClient.getUrl());
        datasource.setDriverClassName(ClickHouseClient.getDriverClassName());
        datasource.setInitialSize(ClickHouseClient.getInitialSize());
        datasource.setMinIdle(ClickHouseClient.getMinIdle());
        datasource.setMaxActive(ClickHouseClient.getMaxActive());
        datasource.setMaxWait(ClickHouseClient.getMaxWait());
        datasource.setPassword(ClickHouseClient.getPassword());
        return datasource;
    }
}