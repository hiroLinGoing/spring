package com.hiro.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Project: springbootDemo
 *
 * @author : hirolin
 * @date : 2019/3/25 22:13
 */
@SpringBootApplication
@MapperScan("com.hiro.demo.db")
@EnableScheduling
public class DemoApplication {
    public static void main(String [] args) {
        SpringApplication.run(DemoApplication.class,args);
    }
}
