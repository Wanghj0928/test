package com.wanghj.test.mongodao;

import com.wanghj.test.domain.Monitor;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wanghj
 * @create 2018-01-05 17:03
 **/
@Repository
public interface MonitorRepository extends MongoRepository<Monitor, String> {

    /**
     * 根据imei号查询记录
     *
     * @param imei
     * @return
     */
    Monitor findByImei(String imei);
}