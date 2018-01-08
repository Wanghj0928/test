package com.wanghj.test.service;


import com.wanghj.test.domain.Monitor;

import java.util.List;

/**
 * @author wanghj
 * @create 2018-01-05 17:06
 **/
public interface MonitorService {

    /**
     * 根据imei号查询记录
     *
     * @param imei
     * @return
     */
    Monitor findByImei(String imei);

    List<Monitor> findAll();
}
