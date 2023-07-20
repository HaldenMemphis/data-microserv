package com.msc.datamicroserv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.msc.datamicroserv.dao.mapper")
public class DataMicroservApplication {

    public static void main(String[] args) {
        SpringApplication.run(DataMicroservApplication.class, args);
    }

}
