package com.woniu.woniu_bx;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan(basePackages = "com.woniu.woniu_bx.mapper")
//@EnableScheduling
public class WoniuBxApplication {
    public static void main(String[] args) {
        SpringApplication.run(WoniuBxApplication.class, args);
    }

}
