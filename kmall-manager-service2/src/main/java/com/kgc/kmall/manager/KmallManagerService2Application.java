package com.kgc.kmall.manager;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.kgc.kmall.manager.mapper")
@SpringBootApplication
public class KmallManagerService2Application {

    public static void main(String[] args) {
        SpringApplication.run(KmallManagerService2Application.class, args);
    }

}
