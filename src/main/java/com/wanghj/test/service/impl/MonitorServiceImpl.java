package com.wanghj.test.service.impl;

import com.wanghj.test.domain.Monitor;
import com.wanghj.test.mongodao.MonitorRepository;
import com.wanghj.test.service.MonitorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wanghj
 * @create 2018-01-05 17:06
 **/
@Service
public class MonitorServiceImpl implements MonitorService {

    @Autowired
    private MonitorRepository monitorRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Monitor findByImei(String imei) {
        Query query = new Query();
        query.addCriteria(Criteria.where("IMEI").is(imei));
        Monitor monitor = mongoTemplate.findOne(query, Monitor.class);
        return monitor;
//        return this.monitorRepository.findByImei(imei);
    }

    @Override
    public List<Monitor> findAll() {
        return monitorRepository.findAll();
    }
}
