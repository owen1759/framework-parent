package com.jxy.framework.core;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jxy.framework.core.mapper")
public class Application {

    public static void main(String[] args) {
        System.setProperty("spring.config.location", "classpath:/conf/");
        SpringApplication.run(Application.class, args);
    }

}