package com.tz.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tz
 */
@MapperScan(basePackages = "com.tz.dao")
@SpringBootApplication(scanBasePackages = {"com.tz"})
public class MicroWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroWebApplication.class, args);
    }

}
