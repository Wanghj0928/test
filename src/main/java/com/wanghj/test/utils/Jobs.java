package com.wanghj.test.utils;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * @author wanghj
 * @create 2018-01-08 16:40
 **/
@Component
public class Jobs {
    public final static long ONE_Minute =  60 * 1000;
    private DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(fixedDelay=ONE_Minute)
    public void fixedDelayJob(){
        System.out.println(dateFormat.format(new Date())+" >>fixedDelay执行....");
    }

    @Scheduled(fixedRate=ONE_Minute)
    public void fixedRateJob(){
        System.out.println(dateFormat.format(new Date())+" >>fixedRate执行....");
    }

    @Scheduled(cron="0 15 3 * * ?")
    public void cronJob(){
        System.out.println(dateFormat.format(new Date())+" >>cron执行....");
    }
}