package com.wanghj.test.controller;

import com.wanghj.test.domain.Monitor;
import com.wanghj.test.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author wanghj
 * @create 2018-01-05 17:08
 **/
@RestController
@RequestMapping("/monitor")
public class MonitorController {

    @Autowired
    private MonitorService monitorService;

    @RequestMapping("/{imei}")
    public Monitor findByImei(@PathVariable("imei") String imei) {
        return monitorService.findByImei(imei);
    }

    @RequestMapping("/all")
    public List<Monitor> findByImei() {
        return monitorService.findAll();
    }
}
