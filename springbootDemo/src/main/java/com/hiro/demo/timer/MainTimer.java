package com.hiro.demo.timer;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Project: springbootDemo
 *
 * @author : hirolin
 * @date : 2019/3/25 22:44
 */
@Component
public class MainTimer {

    @Scheduled(cron = "${demo.backend.timer}")
    public void backendTimer(){
        System.out.println("test");
    }
}
